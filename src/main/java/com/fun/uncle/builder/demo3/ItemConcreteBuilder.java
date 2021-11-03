package com.fun.uncle.builder.demo3;

/**
 * @Description: 进行具体的构建
 * @Author: Summer
 * @DateTime: 2021/11/3 11:40 上午
 * @Version: 0.0.1-SNAPSHOT
 */
public class ItemConcreteBuilder extends ItemBuilder{

    @Override
    public void buildNormal() {
        item.setItemName("普通商品");
        item.setType(1);
    }

    @Override
    public void buildCard() {
        item.setItemName("卡券商品");
        item.setCode("code123456");
        item.setType(2);
    }

    @Override
    public void buildVideo() {
        item.setItemName("视频商品");
        item.setUrl("http://");
        item.setType(3);
    }
}
