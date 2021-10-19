package com.fun.uncle.decorator.business;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @Description: 商品
 * @Author: Summer
 * @DateTime: 2021/8/31 4:57 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Merchandise {

    //商品SKU
    private String sku;

    //商品名称
    private String name;

    //商品单价
    private BigDecimal price;

    //支持促销类型
    private Map<PromotionType, SupportPromotions> supportPromotions;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Map<PromotionType, SupportPromotions> getSupportPromotions() {
        return supportPromotions;
    }

    public void setSupportPromotions(Map<PromotionType, SupportPromotions> supportPromotions) {
        this.supportPromotions = supportPromotions;
    }
}
