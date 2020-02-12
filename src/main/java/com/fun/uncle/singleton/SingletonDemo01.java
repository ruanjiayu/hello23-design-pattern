package com.fun.uncle.singleton;

/**
 * @Description: 饿汉式单例 因为程序一旦启动，那么这个类就会被创建，不管有没有人调用它
 * @Author: Xian
 * @CreateDate: 2020/2/12  23:38
 * @Version: 0.0.1-SNAPSHOT
 */
public class SingletonDemo01 {

    /**
     * 一旦启动下列的数组也会随之创建，资源的浪费
     */
    private byte[] data1 = new byte[1024];
    private byte[] data2 = new byte[1024];
    private byte[] data3 = new byte[1024];
    private byte[] data4 = new byte[1024];
    private byte[] data5 = new byte[1024];

    /**
     * 1.私有化构造器
     */
    private SingletonDemo01() {

    }

    /**
     * 2. 类初始化的时候，立刻加载改对象
     */
    private static SingletonDemo01 instance = new SingletonDemo01();

    /**
     * 提供获取该对象的方法，没有scychronized, 效率高
     * @return
     */
    public static SingletonDemo01 getInstance() {
        return instance;
    }
}

class SingletonDemo01Test {
    public static void main(String[] args)  {
        SingletonDemo01 instance = SingletonDemo01.getInstance();
    }
}
