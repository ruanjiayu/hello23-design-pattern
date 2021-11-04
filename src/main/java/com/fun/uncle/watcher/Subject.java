package com.fun.uncle.watcher;


/**
 * @Description: 主题
 * @Author: Summer
 * @DateTime: 2021/11/4 2:38 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public interface Subject {

    // 添加订阅关系
    void attach(Observer observer);

    // 移除订阅关系
    void detach(Observer observer);

    // 通知订阅者
    void notifyObservers(String message);
}
