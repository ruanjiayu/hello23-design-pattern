package com.fun.uncle.flow;

import org.springframework.stereotype.Service;

/**
 * @Description: 对应场景处理
 * @Author: Summer
 * @DateTime: 2021/10/26 8:14 下午
 * @Version: 0.0.1-SNAPSHOT
 */
@Service
public class NodeTwo implements FlowNodeInterface{

    @Override
    public Object invokeNode(FlowEngine.RunData nodeData, Context context) {
        System.out.println("invokeNode:" +  nodeData.getParamOne() + "没沟通" + nodeData.getParamTwo());
        try {
            Thread.sleep(300L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return nodeData.getParamTwo();
    }

    @Override
    public void afterInvoke(FlowEngine.RunData nodeData, Context context) {
        System.out.println("afterInvoke:" + nodeData.getParamOne() + "胯下海口" + nodeData.getParamTwo());
    }

    @Override
    public String resultKey() {
        return NodeTwo.class.getSimpleName();
    }
}
