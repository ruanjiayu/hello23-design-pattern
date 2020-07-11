package com.fun.uncle.builder.demo2;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2020/7/11 5:32 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Worker extends Builder{

    private Product product;

    public Worker() {
        this.product = new Product();
    }


    @Override
    Builder buildKeLe(String value) {
        product.setKeLe(value);
        return this;
    }

    @Override
    Builder builderHamburger(String value) {
        product.setHamburger(value);
        return this;
    }

    @Override
    Builder builderFrenchFries(String value) {
        product.setFrenchFries(value);
        return this;
    }

    @Override
    Builder builderSnack(String value) {
        product.setSnack(value);
        return this;
    }

    @Override
    Product getProduct() {
        return this.product;
    }
}
