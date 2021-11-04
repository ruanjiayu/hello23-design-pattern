package com.fun.uncle.template;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2021/11/4 4:56 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class CompanyB extends AskForLeaveFlow{

    @Override
    protected void firstGroupLeader(String name) {
        System.out.println("CompanyB 组内有人请假，请假人：" + name);
    }
    @Override
    protected void secondGroupLeader(String name){
        System.out.println("CompanyB 部门有人请假，请假人：" + name);
    }
}
