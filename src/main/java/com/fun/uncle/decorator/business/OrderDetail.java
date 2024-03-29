package com.fun.uncle.decorator.business;

import java.math.BigDecimal;

/**
 * @Description: 详细订单
 * @Author: Summer
 * @DateTime: 2021/8/31 4:56 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class OrderDetail {

    //详细订单ID
    private int id;

    //主订单ID
    private int orderId;

    //商品详情
    private Merchandise merchandise;

    //支付单价
    private BigDecimal payMoney;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Merchandise getMerchandise() {
        return merchandise;
    }

    public void setMerchandise(Merchandise merchandise) {
        this.merchandise = merchandise;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }
}
