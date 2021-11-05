package com.fun.uncle.agent;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2021/11/5 10:53 上午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Test {

    public static void main(String[] args) {
        BaseService baseService  = BeanFactory.newInstanc(Cicada.class);
        baseService.mainService();
    }
}
