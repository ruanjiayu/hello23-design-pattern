package com.fun.uncle.builder;

/**
 * @Description: 产品
 * @Author: Summer
 * @DateTime: 2020/7/11 4:25 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Product {

    /**
     * 水
     */
    private String water;

    /**
     * 面粉
     */
    private String flour;

    /**
     * 盆
     */
    private String pot;

    /**
     * 擀
     */
    private String roll;


    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    public String getPot() {
        return pot;
    }

    public void setPot(String pot) {
        this.pot = pot;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Product{" +
                "water='" + water + '\'' +
                ", flour='" + flour + '\'' +
                ", pot='" + pot + '\'' +
                ", roll='" + roll + '\'' +
                '}';
    }
}
