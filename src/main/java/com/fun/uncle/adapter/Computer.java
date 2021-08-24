package com.fun.uncle.adapter;

/**
 * @Description:
 * @Author: fan
 * @DateTime: 2020/7/26 10:36 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Computer {

    public void needNet(NetToUsb netToUsb) {
        netToUsb.handleRequest();
    }


    public static void main(String[] args) {
        Computer computer = new Computer();
        Network network = new NetworkCable10M();
        Adapter adapter = new Adapter(network);

        computer.needNet(adapter);
    }
}
