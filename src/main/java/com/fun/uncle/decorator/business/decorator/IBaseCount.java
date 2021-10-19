package com.fun.uncle.decorator.business.decorator;

import com.fun.uncle.decorator.business.OrderDetail;

import java.math.BigDecimal;

/**
 * @Description: 计算支付金额接口类
 * @Author: Summer
 * @DateTime: 2021/8/31 6:08 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public interface IBaseCount {

    BigDecimal countPayMoney(OrderDetail orderDetail);
}
