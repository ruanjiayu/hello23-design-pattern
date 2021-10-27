package com.fun.uncle.flow;

import java.util.concurrent.Callable;

/**
 * @Description: 执行node节点
 * @Author: Summer
 * @DateTime: 2021/10/26 7:44 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class NodeExecuteTask implements Callable {

    private FlowNodeInterface flowNodeInterface;

    private RunData runData;

    private Context context;


    public NodeExecuteTask(FlowNodeInterface flowNodeInterface, RunData runData, Context context) {
        this.flowNodeInterface = flowNodeInterface;
        this.runData = runData;
        this.context = context;
    }

    public Object execute() {
        try{
            Object o = flowNodeInterface.invokeNode(runData, context);
            flowNodeInterface.afterInvoke(runData, context);
            return o;
        } catch (Throwable ex) {
            throw ex;
        }
    }

    @Override
    public Object call() throws Exception {
        return execute();
    }
}
