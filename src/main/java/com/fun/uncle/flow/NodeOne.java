package com.fun.uncle.flow;

import org.springframework.stereotype.Service;

/**
 * @Description: 对应场景处理
 * @Author: Summer
 * @DateTime: 2021/10/26 8:13 下午
 * @Version: 0.0.1-SNAPSHOT
 */
@Service
public class NodeOne implements FlowNodeInterface{

    @Override
    public Object invokeNode(FlowEngine.RunData nodeData, Context context) {
        System.out.println("身份校验");
        try {
            Thread.sleep(300L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return nodeData.getParamOne();
    }

    @Override
    public void afterInvoke(FlowEngine.RunData nodeData, Context context) {
        System.out.println("记录参与");
    }

    @Override
    public String resultKey() {
        return NodeOne.class.getSimpleName();
    }
}
