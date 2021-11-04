package com.fun.uncle.watcher;

/**
 * @Description: 观察者接口
 * @Author: Summer
 * @DateTime: 2021/11/4 2:39 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public interface Observer {

    // 处理业务逻辑
    void update(String message);
}
