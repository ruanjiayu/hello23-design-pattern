package com.fun.uncle.builder;

/**
 * @Description: 设计图纸-> 构建包子
 * @Author: Summer
 * @DateTime: 2020/7/11 4:22 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public abstract class Builder {

    /**
     * 水
     */
    abstract void buildWater();

    /**
     * 面粉
     */
    abstract void buildFlour();

    /**
     * 盆
     */
    abstract void buildPot();

    /**
     * 擀
     */
    abstract void buildRoll();

    /**
     * 得到包子产品
     * @return
     */
    abstract Product getProduct();

}
