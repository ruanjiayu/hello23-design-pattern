package com.fun.uncle.decorator.batter;

/**
 * @Description: 煎饼果子基础套餐
 * @Author: fan
 * @DateTime: 2020/8/22 2:13 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class BaseBatterCake extends BatterCake{


    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
