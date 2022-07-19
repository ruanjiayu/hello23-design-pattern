package com.fun.uncle.责任链模式.version.first;

/**
 * @Description: 管理者
 * @Author: Summer
 * @DateTime: 2022/7/19 4:36 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Manager {

    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public boolean approve(int amount) {
        if (amount <= 5000) {
            System.out.println("审批通过。【经理：" + name + "】");
            return true;
        } else {
            System.out.println("无权审批，请找上级。【经理：" + name + "】");
            return false;
        }
    }
}
