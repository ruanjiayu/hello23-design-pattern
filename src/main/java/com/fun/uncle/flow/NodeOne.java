package com.fun.uncle.flow;

import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2021/10/26 8:13 下午
 * @Version: 0.0.1-SNAPSHOT
 */
@Service
public class NodeOne implements FlowNodeInterface{

    @Override
    public Object invokeNode(FlowEngine.RunData nodeData, Context context) {
        System.out.println("invokeNode:" + nodeData.getParamOne());
        try {
            Thread.sleep(30L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return nodeData.getParamOne();
    }

    @Override
    public void afterInvoke(FlowEngine.RunData nodeData, Context context) {
        System.out.println("afterInvoke:" + nodeData.getParamOne());
        try {
            Thread.sleep(30L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String resultKey() {
        return NodeOne.class.getSimpleName();
    }
}
