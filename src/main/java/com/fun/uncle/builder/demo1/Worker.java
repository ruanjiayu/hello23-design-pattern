package com.fun.uncle.builder.demo1;

/**
 * @Description: 工人->负责创建包子
 * @Author: Summer
 * @DateTime: 2020/7/11 4:34 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Worker extends Builder{


    private Product product;

    public Worker() {
        // 很重要一点，工人自己创建产品，而不是传入产品
        this.product = new Product();
    }

    @Override
    void buildWater() {
        product.setWater("加水");
        System.out.println("加水");
    }

    @Override
    void buildFlour() {
        product.setFlour("加面粉");
        System.out.println("加面粉");
    }

    @Override
    void buildPot() {
        product.setPot("加盆");
        System.out.println("加盆");
    }

    @Override
    void buildRoll() {
        product.setRoll("加擀");
        System.out.println("加擀");
    }

    @Override
    Product getProduct() {
        return this.product;
    }
}
