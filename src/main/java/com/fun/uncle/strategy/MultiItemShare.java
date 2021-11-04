package com.fun.uncle.strategy;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2021/11/4 4:31 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class MultiItemShare implements ShareStrategy{

    @Override
    public void shareAlgorithm(String param) {
        System.out.println("当前分享图片是" + param);
    }
}
