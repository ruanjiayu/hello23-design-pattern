package com.fun.uncle.decorator;

/**
 * @Description: 煎饼果子测试类
 * @Author: fan
 * @DateTime: 2020/8/22 2:29 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class BatterCakeTest {

    public static void main(String[] args) {

        BatterCake batterCake = new BaseBatterCake();

        batterCake = new EggBatterCake(batterCake);

        batterCake = new HotDogBatterCake(batterCake);

        batterCake = new EggBatterCake(batterCake);

        batterCake = new EggBatterCake(batterCake);

        System.out.println(batterCake.getMsg() + "售价：" + batterCake.getPrice() );

    }
}
