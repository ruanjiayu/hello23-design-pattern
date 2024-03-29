package com.fun.uncle.flow;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2021/10/26 8:26 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Flow {
    private static FlowNode testFlow = new FlowNode();

    static {
        // 串行
//        testFlow.add(NodeOne.class, new FlowNode.NodeConf());
//        testFlow.add(NodeTwo.class, new FlowNode.NodeConf());

        // 并发执行对应流程
        testFlow.add("tree", NodeOne.class, new FlowNode.NodeConf());
        testFlow.add("tree", NodeTwo.class, new FlowNode.NodeConf());
    }

    public static FlowNode getTestFlow() {
        return testFlow;
    }
}
