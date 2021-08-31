package com.fun.uncle.decorator.batter;

/**
 * @Description: 热狗煎饼
 * @Author: fan
 * @DateTime: 2020/8/22 2:27 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class HotDogBatterCake extends BatterCakeDecorator{

    public HotDogBatterCake(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "1根热狗";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 3;
    }
}
