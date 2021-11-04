package com.fun.uncle.strategy;

/**
 * @Description: 策略模式
 * @Author: Summer
 * @DateTime: 2021/11/4 4:34 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Test {

    public static void main(String[] args) {
        // 测试demo
        String shareType = "order";
        ShareStrategy shareStrategy = ShareFactory.getShareStrategy(shareType);
        shareStrategy.shareAlgorithm("order");
    }
}
