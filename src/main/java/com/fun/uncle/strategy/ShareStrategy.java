package com.fun.uncle.strategy;

/**
 * @Description: 定义相同需要操作的数据
 * @Author: Summer
 * @DateTime: 2021/11/4 4:29 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public interface ShareStrategy {

    // 定义分享策略执行方法
    void shareAlgorithm(String param);

}
