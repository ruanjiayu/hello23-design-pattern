package com.fun.uncle.decorator.business.decorator;

import com.fun.uncle.decorator.business.OrderDetail;

import java.math.BigDecimal;

/**
 * @Description: 支付基本类
 * @Author: Summer
 * @DateTime: 2021/8/31 6:09 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class BaseCount implements IBaseCount {

    @Override
    public BigDecimal countPayMoney(OrderDetail orderDetail) {
        orderDetail.setPayMoney(orderDetail.getMerchandise().getPrice());
        System.out.println("商品原单价金额为：" + orderDetail.getPayMoney());

        return orderDetail.getPayMoney();
    }
}
