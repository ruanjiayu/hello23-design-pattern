package com.fun.uncle.decorator.business.decorator;

import com.fun.uncle.decorator.business.OrderDetail;

import java.math.BigDecimal;

/**
 * @Description: 计算支付金额的抽象类
 * @Author: Summer
 * @DateTime: 2021/9/1 10:31 上午
 * @Version: 0.0.1-SNAPSHOT
 */
public abstract class BaseCountDecorator implements IBaseCount {

    private IBaseCount count;

    public BaseCountDecorator(IBaseCount count) {
        this.count = count;
    }

    @Override
    public BigDecimal countPayMoney(OrderDetail orderDetail) {
        BigDecimal payTotalMoney = new BigDecimal(0);
        if(count!=null) {
            payTotalMoney = count.countPayMoney(orderDetail);
        }
        return payTotalMoney;
    }

}
