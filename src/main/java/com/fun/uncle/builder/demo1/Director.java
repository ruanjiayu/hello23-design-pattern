package com.fun.uncle.builder.demo1;

/**
 * @Description: 指挥者 -> 指挥工人如何来进行操作
 * @Author: Summer
 * @DateTime: 2020/7/11 4:39 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Director {

    /**
     * 指挥者拿到图纸然后按照图纸一步一步来(工人按照顺序来执行)
     * @param builder
     * @return
     */
    public Product operateBuns(Builder builder) {
        builder.buildFlour();
        builder.buildWater();
        builder.buildPot();
        builder.buildRoll();

        Product product = builder.getProduct();
        return product;
    }


    /**
     * 指挥者拿到图纸然后按照图纸一步一步来(工人按照顺序来执行)
     * @param builder
     * @return
     */
    public Product operateSnack(Builder builder) {
        builder.buildFlour();
        builder.buildWater();
        builder.buildPot();

        Product product = builder.getProduct();
        return product;
    }
}
