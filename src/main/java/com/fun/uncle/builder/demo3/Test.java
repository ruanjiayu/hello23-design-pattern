package com.fun.uncle.builder.demo3;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2021/11/3 2:50 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Test {

    public static void main(String[] args) {
        ItemBuilder itemBuilder = new ItemConcreteBuilder();
        ItemDirector itemDirector = new ItemDirector(itemBuilder);
        Item normalItem = itemDirector.normalConstruct();
        System.out.println(normalItem);
        Item cardItem = itemDirector.cardConstruct();
        System.out.println(cardItem);

    }
}
