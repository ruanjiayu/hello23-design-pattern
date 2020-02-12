package com.fun.uncle.singleton;


/**
 * @Description: 懒汉式单例 不立刻加载改对象,有synchronized, 效率低
 * @Author: Xian
 * @CreateDate: 2020/2/12  23:49
 * @Version: 0.0.1-SNAPSHOT
 */
public class SingletonDemo02 {

    /**
     * 1.私有化构造器
     */
    private SingletonDemo02(){

    }

    /**
     * 2.类初始化的时候，不立刻加载改对象
     */
    private static SingletonDemo02 instance;

    /**
     * 3. 提供获取该对象的方法，有synchronized, 效率低
     * @return
     */
    public static synchronized SingletonDemo02 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo02();
        }
        return instance;
    }
}


class SingletonDemo02Test{
    public static void main(String[] args) {
        SingletonDemo02 instance = SingletonDemo02.getInstance();
        SingletonDemo02 instance1 = SingletonDemo02.getInstance();
        System.out.println(instance == instance1);
    }
}
