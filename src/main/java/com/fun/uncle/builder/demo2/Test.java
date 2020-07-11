package com.fun.uncle.builder.demo2;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2020/7/11 5:34 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Test {

    public static void main(String[] args) {
        // 服务员
        Worker worker = new Worker();
        // 链式编程
        Product product = worker.buildKeLe("雪碧").getProduct();
        System.out.println(product);


    }
}
