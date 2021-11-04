package com.fun.uncle.strategy;

/**
 * @Description: 单独商品
 * @Author: Summer
 * @DateTime: 2021/11/4 4:31 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class SingleItemShare implements ShareStrategy{

    @Override
    public void shareAlgorithm(String param) {
        System.out.println("当前分享图片是" + param);
    }
}
