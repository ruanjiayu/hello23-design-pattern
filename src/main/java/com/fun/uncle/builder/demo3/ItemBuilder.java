package com.fun.uncle.builder.demo3;

/**
 * @Description: 构建抽象的建造者
 * @Author: Summer
 * @DateTime: 2021/11/3 11:35 上午
 * @Version: 0.0.1-SNAPSHOT
 */
public abstract class ItemBuilder {

    // 创建产品
    protected Item item = new Item();

    public abstract void buildNormal();

    public abstract void buildCard();

    public abstract void buildVideo();

    // 返回产品对象
    public Item getResult() {
        return item;
    }
}
