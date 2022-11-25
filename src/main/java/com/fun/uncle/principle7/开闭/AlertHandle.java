package com.fun.uncle.principle7.开闭;

/**
 * @Description:
 * @Author: summer
 * @CreateDate: 2022/11/25 10:55
 * @Version: 1.0.0
 */
public abstract class AlertHandle {

    private Integer tpsNum;

    private Integer errorNum;

    public AlertHandle(Integer tpsNum, Integer errorNum) {
        this.tpsNum = tpsNum;
        this.errorNum = errorNum;
    }

    public abstract void check(ApiStatInfo apiStatInfo);

}
