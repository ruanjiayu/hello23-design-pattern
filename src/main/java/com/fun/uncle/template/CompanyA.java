package com.fun.uncle.template;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2021/11/4 4:56 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class CompanyA extends AskForLeaveFlow{

    @Override
    protected void firstGroupLeader(String name) {
        System.out.println("CompanyA 组内有人请假，请假人：" + name);
    }
}
