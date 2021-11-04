package com.fun.uncle.watcher;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2021/11/4 2:48 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class FriendTwoObserver implements Observer{

    @Override
    public void update(String message) {
        // 模拟处理业务逻辑
        System.out.println("Two 知道了你发动态了" + message);
    }
}
