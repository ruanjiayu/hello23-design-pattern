package com.fun.uncle.strategy;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2021/11/4 4:32 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public enum ShareType {

    SINGLE("single", "单商品"),

    MULTI("multi", "多商品"),

    ORDER("order", "下单");
    // 场景对应的编码
    private String code;

    // 业务场景描述
    private String desc;

    ShareType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }
}
