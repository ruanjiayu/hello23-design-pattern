package com.fun.uncle.decorator;

/**
 * @Description: 鸡蛋煎饼
 * @Author: fan
 * @DateTime: 2020/8/22 2:20 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class EggBatterCake extends BatterCakeDecorator{


    public EggBatterCake(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
