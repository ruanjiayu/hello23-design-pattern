package com.fun.uncle.singleton;


import java.util.concurrent.atomic.AtomicLong;

/**
 * @Description: 双重检测
 * @Author: summer
 * @CreateDate: 2022/12/7 16:43
 * @Version: 1.0.0
 */
public class DoubleDetection {

    private AtomicLong id = new AtomicLong(0);

    private static DoubleDetection instance;

    private DoubleDetection() {

    }

    public static DoubleDetection getInstance() {
        if (instance == null) {
            // 此处为类级别锁
            synchronized (DoubleDetection.class) {
                if (instance == null) {
                    instance = new DoubleDetection();
                }
            }
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }

    public static void main(String[] args) {
        System.out.println(DoubleDetection.getInstance().getId());
    }
}
