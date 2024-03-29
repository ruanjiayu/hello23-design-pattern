package com.fun.uncle.decorator.business;

import java.math.BigDecimal;

/**
 * @Description: 使用优惠券
 * @Author: Summer
 * @DateTime: 2021/8/31 5:00 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class UserCoupon {

    //优惠券ID
    private int id;

    //领取优惠券用户ID
    private int userId;

    //商品SKU
    private String sku;

    //优惠金额
    private BigDecimal coupon;

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

    public BigDecimal getCoupon() {
        return coupon;
    }

    public void setCoupon(BigDecimal coupon) {
        this.coupon = coupon;
    }
}
