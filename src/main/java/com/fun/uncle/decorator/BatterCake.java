package com.fun.uncle.decorator;

/**
 * @Description: 抽象类，煎饼果子
 * @Author: fan
 * @DateTime: 2020/8/22 2:10 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public abstract class BatterCake {

    /**
     * 得到煎饼果子信息
     * @return
     */
    protected abstract String getMsg();


    /**
     * 得到煎饼果子的价格
     * @return
     */
    protected abstract int getPrice();
}
