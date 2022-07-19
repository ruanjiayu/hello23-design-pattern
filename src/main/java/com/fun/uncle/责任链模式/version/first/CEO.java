package com.fun.uncle.责任链模式.version.first;

/**
 * @Description: CEO
 * @Author: Summer
 * @DateTime: 2022/7/19 4:37 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class CEO {

    private String name;

    public CEO(String name) {
        this.name = name;
    }

    public boolean approve(int amount) {
        if (amount <= 10000) {
            System.out.println("审批通过。【CEO：" + name + "】");
            return true;
        } else {
            System.out.println("驳回申请。【CEO：" + name + "】");
            return false;
        }
    }

}
