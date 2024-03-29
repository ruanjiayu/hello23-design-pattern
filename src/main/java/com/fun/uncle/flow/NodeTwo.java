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
    public Object invokeNode(RunData nodeData, Context context) {
        System.out.println("商品校验");
        try {
            Thread.sleep(300L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public void afterInvoke(RunData nodeData, Context context) {
        System.out.println("扣减库存");
    }

    @Override
    public String resultKey() {
        return NodeTwo.class.getSimpleName();
    }
}
