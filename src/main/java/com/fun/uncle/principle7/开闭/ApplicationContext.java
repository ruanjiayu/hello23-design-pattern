package com.fun.uncle.principle7.开闭;

import com.fun.uncle.principle7.开闭.handle.ErrorAlertHandle;
import com.fun.uncle.principle7.开闭.handle.TpsAlertHandle;

/**
 * @Description:
 * @Author: summer
 * @CreateDate: 2022/11/25 11:07
 * @Version: 1.0.0
 */
public class ApplicationContext {

    private Alert alert;

    private Integer tpsNum;

    private Integer errorNum;


    // 饿汉式单例
    private static final ApplicationContext instance = new ApplicationContext();


    public Alert getAlert() {
        return alert;
    }

    public static ApplicationContext getInstance() {
        return instance;
    }

    public void initializeBeans() {
        alert = new Alert();
        tpsNum = 10;
        errorNum = 5;

        alert.addAlertHandle(new TpsAlertHandle(tpsNum, errorNum));
        alert.addAlertHandle(new ErrorAlertHandle(tpsNum, errorNum));
    }

    private ApplicationContext() {
        instance.initializeBeans();
    }

}
