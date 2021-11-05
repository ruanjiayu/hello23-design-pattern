package com.fun.uncle.agent;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2021/11/5 10:51 上午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Cicada implements BaseService{

    @Override
    public void mainService() {
        System.out.println("主要业务，以蝉为例，当蝉出现业务调用时，螳螂监听到");
    }
}
