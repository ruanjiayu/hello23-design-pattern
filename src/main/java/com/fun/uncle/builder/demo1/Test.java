package com.fun.uncle.builder.demo1;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2020/7/11 4:43 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Test {

    public static void main(String[] args) {
        Worker worker = new Worker();
        Director director = new Director();
        // 创建包子
        Product product = director.operateBuns(worker);
        System.out.println(product);
        Worker snackWorker = new Worker();
        // 创建点心
        Product snack = director.operateSnack(snackWorker);
        System.out.println(snack);
    }
}
