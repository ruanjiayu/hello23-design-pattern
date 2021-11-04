package com.fun.uncle.template;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2021/11/4 4:57 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Test {

    public static void main(String[] args) {
        // 公司A请假流程模版
        AskForLeaveFlow companyA = new CompanyA();
        companyA.askForLeave("阮佳裕");
        // 结果：CompanyA 组内有人请假，请假人：阮佳裕
        //       当前有人请假了，请假人：阮佳裕

        AskForLeaveFlow companyB = new CompanyB();
        companyB.askForLeave("徐帆");
        // 结果：CompanyB 组内有人请假，请假人：徐帆
        //      CompanyB 部门有人请假，请假人：徐帆
        //      当前有人请假了，请假人：徐帆
    }
}
