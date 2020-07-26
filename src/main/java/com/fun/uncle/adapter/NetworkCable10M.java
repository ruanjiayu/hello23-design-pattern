package com.fun.uncle.adapter;

/**
 * @Description: 网线光纤10M
 * @Author: fan
 * @DateTime: 2020/7/26 10:39 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class NetworkCable10M implements Network{

    @Override
    public void handle() {
        System.out.println("开始上网");
    }

}
