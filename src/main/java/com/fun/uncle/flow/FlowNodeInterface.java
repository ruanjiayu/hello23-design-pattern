package com.fun.uncle.flow;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2021/10/26 6:24 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public interface FlowNodeInterface<T> {

    /**
     * Node执行的方法
     *
     * @param nodeData
     * @param context
     * @return
     */
    T invokeNode(RunData nodeData, Context context);


    /**
     * node执行后的执行的方法
     *
     * @param nodeData
     * @param context
     */
    void afterInvoke(RunData nodeData, Context context);

    /**
     * 从context中获取node结果key
     *
     * @return
     */
    String resultKey();
}
