package com.fun.uncle.handle;

/**
 * @Description: 责任家
 * @Author: Summer
 * @DateTime: 2021/11/3 4:19 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public abstract class Handler {

    protected Handler handler;

    public abstract void handleRequest(Integer times);

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
