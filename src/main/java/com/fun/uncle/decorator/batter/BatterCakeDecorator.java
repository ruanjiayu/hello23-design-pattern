package com.fun.uncle.decorator.batter;

/**
 * @Description: 煎饼果子适配器
 * @Author: fan
 * @DateTime: 2020/8/22 2:17 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public abstract class BatterCakeDecorator extends BatterCake{


    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    @Override
    protected String getMsg() {
        return this.batterCake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.batterCake.getPrice();
    }
}
