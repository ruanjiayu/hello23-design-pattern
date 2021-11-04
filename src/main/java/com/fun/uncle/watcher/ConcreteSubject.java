package com.fun.uncle.watcher;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 订阅主题容器
 * @Author: Summer
 * @DateTime: 2021/11/4 2:44 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class ConcreteSubject implements Subject{

    // 订阅者容器
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        // 添加订阅关系
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        // 移除订阅关系
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        // 通知订阅者们
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
