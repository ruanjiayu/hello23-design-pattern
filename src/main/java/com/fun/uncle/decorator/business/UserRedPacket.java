package com.fun.uncle.decorator.business;

import java.math.BigDecimal;

/**
 * @Description: 使用红包
 * @Author: Summer
 * @DateTime: 2021/8/31 6:07 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class UserRedPacket {

    //红包ID
    private int id;

    //领取用户ID
    private int userId;

    //商品SKU
    private String sku;

    //领取红包金额
    private BigDecimal redPacket;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public BigDecimal getRedPacket() {
        return redPacket;
    }

    public void setRedPacket(BigDecimal redPacket) {
        this.redPacket = redPacket;
    }
}
