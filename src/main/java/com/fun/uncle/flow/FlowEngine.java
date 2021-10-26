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
            List<String> nodeNameList = nodeGroup.get(groupName);
            // 只有一个Node节点，串行执行
            if (nodeNameList.size() == 1) {
                String nodeName = nodeNameList.get(0);
                FlowNodeInterface detailNode = (FlowNodeInterface) BaseService.getSingleBeanByType(Class.forName(nodeName));
                NodeExecuteTask nodeParallelTask = new NodeExecuteTask(detailNode, runData, context);

                try {
                    Object result = nodeParallelTask.execute();
                    context.getAdaptorMap().put(detailNode.resultKey(), result);
                } catch (Exception e) {
                    needThrowExp = true;
                }
            } else {
                // 多个Node节点，并行执行
                List<Future> resultList = new ArrayList<>();
                List<String> executeNodeNameList = new ArrayList<>();
                List<NodeExecuteTask> executedNodeList = new ArrayList<>();
                for (String nodeName : nodeNameList) {
                    FlowNodeInterface detailNode = (FlowNodeInterface) BaseService.getSingleBeanByType(Class.forName(nodeName));
                    NodeExecuteTask nodeParallelTask = new NodeExecuteTask(detailNode, runData, context);

                    executedNodeList.add(nodeParallelTask);
                    executeNodeNameList.add(nodeName);
                    resultList.add(threadPool.submit(nodeParallelTask));
                }

                for (int i = 0; i < resultList.size(); i++) {
                    String nodeName = executeNodeNameList.get(i);
                    String nodeKey = groupName + "_" + nodeName;
                    FlowNodeInterface detailNode = (FlowNodeInterface) BaseService.getSingleBeanByType(Class.forName(nodeName));
                    FlowNode.NodeConf nodeConf = nodeMap.get(nodeKey);
                    int timeout = nodeConf.getTimeout();
                    Future future = resultList.get(i);
                    try {
                        Object o = future.get(timeout, TimeUnit.MICROSECONDS);
                        context.getAdaptorMap().put(detailNode.resultKey(), o);
                    } catch (ExecutionException e) {
                        System.out.println("ExecutionException");
                        needThrowExp = true;
                    } catch (TimeoutException o) {
                        System.out.println("TimeoutException" + timeout);
                        needThrowExp = true;
                    } catch (Exception e) {
                        System.out.println("Exception");
                        needThrowExp = true;
                    }
                }
            }

            if (needThrowExp) {
                throw new RuntimeException();
            }
        }
    }


    private Map<String, List<String>> groupByGroupName(FlowNode flowNode) {
        Map<String, List<String>> nodeGroup = new LinkedHashMap<>();
        for (String nodeKey : flowNode.getNodeList()) {
            String groupName = getGroupName(nodeKey);
            String nodeName = getNodeName(nodeKey);

            if (StringUtils.isBlank(groupName)) {
                List<String> nodeNameList = new ArrayList<>();
                nodeNameList.add(nodeName);
                nodeGroup.put(nodeName, nodeNameList);
            } else {
                List<String> nodeNameList = nodeGroup.get(groupName);
                if (nodeNameList == null) {
                    nodeNameList = new ArrayList<>();
                }

                nodeNameList.add(nodeName);
                nodeGroup.put(groupName, nodeNameList);
            }
        }
        return nodeGroup;
    }

    private String getGroupName(String nodeKey) {
        String[] arr = nodeKey.split("_");
        return arr.length == 2 ? arr[0] : null;
    }

    private String getNodeName(String nodeKey) {
        String[] arr = nodeKey.split("_");
        return arr.length == 2 ? arr[1] : arr[0];
    }


    /**
     * 流程中的参数
     */
    public static class RunData {
        private String paramOne;

        private String paramTwo;

        public String getParamOne() {
            return paramOne;
        }

        public void setParamOne(String paramOne) {
            this.paramOne = paramOne;
        }

        public String getParamTwo() {
            return paramTwo;
        }

        public void setParamTwo(String paramTwo) {
            this.paramTwo = paramTwo;
        }
    }

}
