package com.fun.uncle.watcher;

/**
 * @Description: 具体的观察者
 * @Author: Summer
 * @DateTime: 2021/11/4 2:43 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class FriendOneObserver implements Observer {

    @Override
    public void update(String message) {
        // 模拟处理业务逻辑
        System.out.println("One 知道了你发动态了" + message);
    }
}
