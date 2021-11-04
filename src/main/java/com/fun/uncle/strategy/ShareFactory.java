package com.fun.uncle.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 定义分享工厂
 * @Author: Summer
 * @DateTime: 2021/11/4 4:33 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class ShareFactory {

    // 定义策略map缓存
    private static final Map<String, ShareStrategy> shareStrategies = new HashMap<>();
    static {
        shareStrategies.put("order", new OrderItemShare());
        shareStrategies.put("single", new SingleItemShare());
        shareStrategies.put("multi", new MultiItemShare());
    }
    // 获取指定策略
    public static ShareStrategy getShareStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return shareStrategies.get(type);
    }

}
