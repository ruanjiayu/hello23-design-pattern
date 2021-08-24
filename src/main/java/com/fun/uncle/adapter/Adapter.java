package com.fun.uncle.adapter;

/**
 * @Description: 适配器实现
 * @Author: fan
 * @DateTime: 2020/7/26 10:38 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Adapter implements NetToUsb{


    private Network network;

    public Adapter(Network network) {
        this.network = network;
    }

    @Override
    public void handleRequest() {
        network.handle();
    }
}
