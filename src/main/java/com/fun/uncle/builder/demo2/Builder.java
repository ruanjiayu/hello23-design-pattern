package com.fun.uncle.builder.demo2;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2020/7/11 5:17 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public abstract class Builder {

    /**
     * 构建可乐
     * @return
     */
    abstract Builder buildKeLe(String value);

    /**
     * 构建汉堡
     * @return
     */
    abstract Builder builderHamburger(String value);

    /**
     * 构建薯条
     * @return
     */
    abstract Builder builderFrenchFries(String value);

    /**
     * 构建点心
     * @return
     */
    abstract Builder builderSnack(String value);


    /**
     * 得到产品
     * @return
     */
    abstract Product getProduct();


}
