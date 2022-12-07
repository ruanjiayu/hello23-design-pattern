package com.fun.uncle.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Description: 懒汉式
 * @Author: summer
 * @CreateDate: 2022/12/7 16:35
 * @Version: 1.0.0
 */
public class HungryMan {

    private AtomicLong id = new AtomicLong(0);
    private static  final HungryMan instance = new HungryMan();

    private HungryMan() {

    }

    public static HungryMan getInstance() {
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }

    public static void main(String[] args) {
        System.out.println(HungryMan.getInstance().getId());
    }

}
