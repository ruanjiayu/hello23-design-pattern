package com.fun.uncle.handle;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2021/11/3 4:31 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class ThirdInterview extends Handler{

    @Override
    public void handleRequest(Integer times) {
        if (times == 3) {
            System.out.println("第三次面试"+ times + "，恭喜面试通过，HR会跟你联      系！！！");
        }
        System.out.println("end 3");
    }
}
