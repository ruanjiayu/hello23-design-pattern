package com.fun.uncle.flow;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @Description: 流执行引擎
 * @Author: Summer
 * @DateTime: 2021/10/25 6:24 下午
 * @Version: 0.0.1-SNAPSHOT
 */
@Service
public class FlowEngine {

    public static ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5,
            10,
            60L,
            TimeUnit.MINUTES,
            new LinkedBlockingDeque<>(500),
            new ThreadFactoryBuilder().setNameFormat("flowEngine-pool-%d").build(),
            new ThreadPoolExecutor.AbortPolicy() {
                @Override
                public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                    throw new RejectedExecutionException("Task" + r.toString() + "rejected from" + executor.toString());
                }
            }
    );

    public void execute(FlowNode flowNode, RunData runData, Context context) throws Exception {
        Map<String, List<String>> nodeGroup = this.groupByGroupName(flowNode);

        Map<String, FlowNode.NodeConf> nodeMap = flowNode.getNodeMap();

        for (String groupName : nodeGroup.keySet()) {
            boolean needThrowExp = false;
            List<String> nodeClassNameList = nodeGroup.get(groupName);
            // 只有一个Node节点，串行执行
            if (nodeClassNameList.size() == 1) {
                String nodeClassName = nodeClassNameList.get(0);
                FlowNodeInterface detailNode = (FlowNodeInterface) BaseService.getSingleBeanByType(Class.forName(nodeClassName));
                NodeExecuteTask nodeParallelTask = new NodeExecuteTask(detailNode, runData, context);

                try {
                    Object result = nodeParallelTask.execute();
                    context.getAdaptorMap().put(detailNode.resultKey(), result);
                } catch (Exception e) {
                    needThrowExp = true;
                }
            }
            // 多个Node节点，并行执行
            else {
                List<Future> resultList = new ArrayList<>();
                List<String> executeNodeClassNameList = new ArrayList<>();
                List<NodeExecuteTask> executedNodeList = new ArrayList<>();

                // 组装需要执行的任务
                for (String nodeClassName : nodeClassNameList) {
                    FlowNodeInterface detailNode = (FlowNodeInterface) BaseService.getSingleBeanByType(Class.forName(nodeClassName));
                    NodeExecuteTask nodeParallelTask = new NodeExecuteTask(detailNode, runData, context);

                    executedNodeList.add(nodeParallelTask);
                    executeNodeClassNameList.add(nodeClassName);
                    resultList.add(threadPool.submit(nodeParallelTask));
                }

                // 拿到执行的结果
                for (int i = 0; i < resultList.size(); i++) {
                    String nodeClassName = executeNodeClassNameList.get(i);
                    String nodeKey = groupName + "_" + nodeClassName;
                    FlowNodeInterface detailNode = (FlowNodeInterface) BaseService.getSingleBeanByType(Class.forName(nodeClassName));
                    FlowNode.NodeConf nodeConf = nodeMap.get(nodeKey);
                    int timeout = nodeConf.getTimeout();
                    Future future = resultList.get(i);

                    try {
                        Object result = future.get(timeout, TimeUnit.MILLISECONDS);
                        // 将结果放入上下文
                        context.getAdaptorMap().put(detailNode.resultKey(), result);
                    } catch (ExecutionException e) {
                        System.out.println("ExecutionException");
                        needThrowExp = true;
                        break;
                    } catch (TimeoutException o) {
                        System.out.println("TimeoutException");
                        needThrowExp = true;
                        break;
                    } catch (Exception e) {
                        System.out.println("Exception");
                        needThrowExp = true;
                        break;
                    }
                }
            }

            /**
             * 出现异常时候的处理逻辑
             */
            if (needThrowExp) {
                throw new RuntimeException();
            }
        }
    }


    /**
     * key: 组名
     * value: 节点的 类名字
     *
     * @param flowNode
     * @return key: 组名 value
     */
    private Map<String, List<String>> groupByGroupName(FlowNode flowNode) {
        Map<String, List<String>> nodeGroup = new LinkedHashMap<>();
        for (String nodeKey : flowNode.getNodeKeyList()) {
            String groupName = getGroupName(nodeKey);
            String nodeClassName = getNodeClassName(nodeKey);

            if (StringUtils.isBlank(groupName)) {
                List<String> nodeClassNameList = new ArrayList<>();
                nodeClassNameList.add(nodeClassName);
                nodeGroup.put(nodeClassName, nodeClassNameList);
            } else {
                List<String> nodeClassNameList = nodeGroup.get(groupName);
                if (nodeClassNameList == null) {
                    nodeClassNameList = new ArrayList<>();
                }

                nodeClassNameList.add(nodeClassName);
                nodeGroup.put(groupName, nodeClassNameList);
            }
        }
        return nodeGroup;
    }

    private String getGroupName(String nodeKey) {
        String[] arr = nodeKey.split("_");
        return arr.length == 2 ? arr[0] : null;
    }

    private String getNodeClassName(String nodeKey) {
        String[] arr = nodeKey.split("_");
        return arr.length == 2 ? arr[1] : arr[0];
    }

}
