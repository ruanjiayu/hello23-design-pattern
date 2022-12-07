package com.fun.uncle.singleton;


import java.util.concurrent.atomic.AtomicLong;

/**
 * @Description: 懒汉式
 * @Author: summer
 * @CreateDate: 2022/12/7 16:39
 * @V
 */
public class Sluggard {

    private AtomicLong id = new AtomicLong(0);

    private static Sluggard instance;

    private Sluggard() {}

    public static synchronized Sluggard getInstance() {
        if (instance == null) {
            instance = new Sluggard();
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }

    public static void main(String[] args) {
        System.out.println(Sluggard.getInstance().getId());
    }
}
