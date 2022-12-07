package com.fun.uncle.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Description: 静态内部类
 * @Author: summer
 * @CreateDate: 2022/12/7 16:48
 * @Version: 1.0.0
 */
public class StaticInsideClass {

    private AtomicLong id = new AtomicLong(0);

    private StaticInsideClass() {

    }

    private static class SingletonHolder {
        private static final StaticInsideClass instance = new StaticInsideClass();
    }

    public static StaticInsideClass getInstance() {
        return SingletonHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }

    public static void main(String[] args) {
        System.out.println(StaticInsideClass.getInstance().getId());
    }
}
