package com.fun.uncle.责任链模式.version.last;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2022/7/19 4:54 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Manager extends Approver {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void approve(int amount) {
        if (amount <= 5000) {
            System.out.println("审批通过。【管理者：" + name + "】");
        } else {
            System.out.println("无权审批，升级处理。【管理者：" + name + "】");
            this.nextApprover.approve(amount);
        }
    }
}
