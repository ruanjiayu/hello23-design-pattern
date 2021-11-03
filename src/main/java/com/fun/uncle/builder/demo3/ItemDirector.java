package com.fun.uncle.builder.demo3;

/**
 * @Description: 商品导演类--指导我们如何去构建
 * @Author: Summer
 * @DateTime: 2021/11/3 1:54 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class ItemDirector {

    private ItemBuilder itemBuilder;

    public ItemDirector(ItemBuilder itemBuilder) {
        this.itemBuilder = itemBuilder;
    }

    public Item normalConstruct() {
        itemBuilder.buildNormal();
        return itemBuilder.getResult();
    }

    public Item cardConstruct() {
        itemBuilder.buildCard();
        return itemBuilder.getResult();
    }

    public Item videoConstruct() {
        itemBuilder.buildVideo();
        return itemBuilder.getResult();
    }
}

