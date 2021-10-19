package com.fun.uncle.decorator.business.decorator;

import com.fun.uncle.decorator.business.OrderDetail;
import com.fun.uncle.decorator.business.PromotionType;

import java.math.BigDecimal;

/**
 * @Description: 计算使用红包后的金额
 * @Author: Summer
 * @DateTime: 2021/9/1 10:39 上午
 * @Version: 0.0.1-SNAPSHOT
 */
public class RedPacketDecorator extends BaseCountDecorator{

    public RedPacketDecorator(IBaseCount count) {
        super(count);
    }

    @Override
    public BigDecimal countPayMoney(OrderDetail orderDetail) {
        super.countPayMoney(orderDetail);
        BigDecimal payTotalMoney = countCouponPayMoney(orderDetail);
        return payTotalMoney;
    }

    private BigDecimal countCouponPayMoney(OrderDetail orderDetail) {

        BigDecimal redPacket = orderDetail.getMerchandise().getSupportPromotions().get(PromotionType.REDPACKED).getUserRedPacket().getRedPacket();
        System.out.println("红包优惠金额：" + redPacket);

        orderDetail.setPayMoney(orderDetail.getPayMoney().subtract(redPacket));
        return orderDetail.getPayMoney();
    }
}
