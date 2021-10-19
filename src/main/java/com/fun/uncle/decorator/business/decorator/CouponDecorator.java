package com.fun.uncle.decorator.business.decorator;

import com.fun.uncle.decorator.business.OrderDetail;
import com.fun.uncle.decorator.business.PromotionType;

import java.math.BigDecimal;

/**
 * @Description: 计算使用优惠券后的金额
 * @Author: Summer
 * @DateTime: 2021/9/1 10:33 上午
 * @Version: 0.0.1-SNAPSHOT
 */
public class CouponDecorator extends BaseCountDecorator{

    public CouponDecorator(IBaseCount count) {
        super(count);
    }

    @Override
    public BigDecimal countPayMoney(OrderDetail orderDetail) {
        super.countPayMoney(orderDetail);
        BigDecimal payTotalMoney = countCouponPayMoney(orderDetail);
        return payTotalMoney;
    }

    private BigDecimal countCouponPayMoney(OrderDetail orderDetail) {

        BigDecimal coupon =  orderDetail.getMerchandise().getSupportPromotions().get(PromotionType.COUPON).getUserCoupon().getCoupon();
        System.out.println("优惠券金额：" + coupon);

        orderDetail.setPayMoney(orderDetail.getPayMoney().subtract(coupon));
        return orderDetail.getPayMoney();
    }
}
