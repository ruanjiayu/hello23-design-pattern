package com.fun.uncle.责任链模式.version.first;

/**
 * @Description: 员工
 * @Author: Summer
 * @DateTime: 2022/7/19 4:36 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Staff {

    private String name;

    public Staff(String name) {
        this.name = name;
    }

    public boolean approve(int amount) {
        if (amount <= 1000) {
            System.out.println("审批通过。【员工：" + name + "】");
            return true;
        } else {
            System.out.println("无权审批，请找上级。【员工：" + name + "】");
            return false;
        }
    }
}
