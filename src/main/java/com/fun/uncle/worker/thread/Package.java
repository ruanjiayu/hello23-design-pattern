package com.fun.uncle.worker.thread;

/**
 * @Description: 包裹
 * @Author: Summer
 * @DateTime: 2021/8/24 8:44 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Package {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void execute() {
        System.out.println(Thread.currentThread().getName() + " executed " + this);
    }
}
