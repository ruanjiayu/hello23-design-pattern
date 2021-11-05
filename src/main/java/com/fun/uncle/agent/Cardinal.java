package com.fun.uncle.agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2021/11/5 11:33 上午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Cardinal implements InvocationHandler {

    // 监听代理代理对象
    private Object proxyOne;

    public Cardinal(Object proxyOne) {
        this.proxyOne = proxyOne;
    }

    // 螳螂主要业务，也就是监听对象
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(proxyOne, args);
        secondaryMain();
        return null;
    }

    private void secondaryMain() {
        System.out.println("黄雀吃螳螂 - 次要业务");
    }
}
