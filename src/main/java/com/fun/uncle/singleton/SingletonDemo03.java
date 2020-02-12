package com.fun.uncle.singleton;

/**
 * @Description: DCL懒汉式 双重检测 （由于JVM底层内部模型原因,偶尔会出现问题，不建议使用）
 * @Author: Xian
 * @CreateDate: 2020/2/13  0:02
 * @Version: 0.0.1-SNAPSHOT
 */
public class SingletonDemo03 {
    /**
     * 1.私有化构造器
     */
    private SingletonDemo03(){

    }

    /**
     * 2. 类初始化的时候，不立刻加载该对象, 一旦有线程修改该值，那么会将其他线程拥有改对象的值指针地址重新指向
     */
    private volatile static SingletonDemo03 instance;

    /**
     * 3. 提供获取该对象的方法，有synchronized,效率较低
     * @return
     */
    public static SingletonDemo03 getInstance() {
        if (instance == null) {
            synchronized (SingletonDemo03.class) {
                if (instance == null) {
                    instance = new SingletonDemo03();
                }
            }
        }
        return instance;
    }

    // 1. 分配内存
    // 2. 执行构造方法
    // 3. 指向地址
}

class SingletonDemo03Test{
    public static void main(String[] args) {
        SingletonDemo03 instance = SingletonDemo03.getInstance();
        SingletonDemo03 instance1 = SingletonDemo03.getInstance();
        System.out.println(instance == instance1);
    }
}