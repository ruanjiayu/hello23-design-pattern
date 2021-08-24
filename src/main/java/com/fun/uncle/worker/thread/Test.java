package com.fun.uncle.worker.thread;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2021/8/24 8:48 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Test {

    public static void main(String[] args) {

        //新建8个工人
        final PackageChannel channel = new PackageChannel(8);

        //开始工作
        channel.startWorker();

        //为流水线添加包裹
        for (int i = 0; i < 100; i++) {
            Package packagereq = new Package();
            packagereq.setAddress("test");
            packagereq.setName("test");
            channel.put(packagereq);
        }
    }
}
