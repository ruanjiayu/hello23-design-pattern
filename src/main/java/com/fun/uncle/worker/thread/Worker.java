package com.fun.uncle.worker.thread;

import java.util.Random;

/**
 * @Description: 机器人
 * @Author: Summer
 * @DateTime: 2021/8/24 8:47 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Worker extends Thread {

    private static final Random random = new Random(System.currentTimeMillis());
    private final PackageChannel channel;

    public Worker(String name, PackageChannel channel) {
        super(name);
        this.channel = channel;
    }

    @Override
    public void run() {
        while (true) {
            channel.take().execute();

            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
