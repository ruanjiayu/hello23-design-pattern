package com.fun.uncle.handle;

/**
 * @Description: 责任链模式
 * @Author: Summer
 * @DateTime: 2021/11/3 5:12 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Test {

    public static void main(String[] args) {
        Handler first = new FirstInterview();
        Handler second = new SecondInterview();
        Handler three = new ThirdInterview();
        first.setHandler(second);
        second.setHandler(three);

        // 第一次面试
        first.handleRequest(1);
        System.out.println();
        // 第二次面试
        first.handleRequest(2);
        System.out.println();
        // 第三次面试
        first.handleRequest(3);
        System.out.println();
    }
}
