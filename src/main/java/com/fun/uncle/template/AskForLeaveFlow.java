package com.fun.uncle.template;

/**
 * @Description: 请假流程
 * @Author: Summer
 * @DateTime: 2021/11/4 4:54 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public abstract class AskForLeaveFlow {

    // 一级组长直接审批
    protected abstract void firstGroupLeader(String name);

    // 二级组长部门负责人审批
    protected void secondGroupLeader(String name) {
    }

    // 告知HR有人请假了
    private final void notifyHr(String name) {
        System.out.println("当前有人请假了，请假人：" + name);
    }

    // 请假流模版
    public void askForLeave(String name) {
        firstGroupLeader(name);
        secondGroupLeader(name);
        notifyHr(name);
    }
}
