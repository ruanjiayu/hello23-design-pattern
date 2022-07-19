package com.fun.uncle.责任链模式.version.last;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2022/7/19 4:54 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class CEO extends Approver {

    public CEO(String name) {
        super(name);
    }

    @Override
    public void approve(int amount) {
        if (amount <= 1000) {
            System.out.println("审批通过。【CEO：" + name + "】");
        } else {
            System.out.println("驳回申请。【CEO：" + name + "】");
        }
    }
}
