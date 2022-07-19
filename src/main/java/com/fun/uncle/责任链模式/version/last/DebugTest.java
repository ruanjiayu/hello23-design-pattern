package com.fun.uncle.责任链模式.version.last;

import org.junit.Test;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2022/7/19 4:39 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class DebugTest {

    @Test
    public void test1() {
        Approver flightJohn = new Staff("张飞");
        flightJohn.setNextApprover(new Manager("关羽")).setNextApprover(new CEO("刘备"));

        //高层接触不到也没必要接触，直接找员工张飞审批。
        flightJohn.approve(1000);
        /***********************
         审批通过。【员工：张飞】
         ***********************/

        flightJohn.approve(4000);
        /***********************
         无权审批，升级处理。【员工：张飞】
         审批通过。【经理：关羽】
         ***********************/

        flightJohn.approve(9000);
        /***********************
         无权审批，升级处理。【员工：张飞】
         无权审批，升级处理。【经理：关羽】
         审批通过。【CEO：刘备】
         ***********************/

        flightJohn.approve(88000);
        /***********************
         无权审批，升级处理。【员工：张飞】
         无权审批，升级处理。【经理：关羽】
         驳回申请。【CEO：刘备】
         ***********************/
    }



}
