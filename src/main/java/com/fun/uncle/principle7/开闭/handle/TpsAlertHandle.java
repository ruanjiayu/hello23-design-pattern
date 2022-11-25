package com.fun.uncle.principle7.开闭.handle;

import com.fun.uncle.principle7.开闭.AlertHandle;
import com.fun.uncle.principle7.开闭.ApiStatInfo;

/**
 * @Description:
 * @Author: summer
 * @CreateDate: 2022/11/25 11:05
 * @Version: 1.0.0
 */
public class TpsAlertHandle extends AlertHandle {


    public TpsAlertHandle(Integer tpsNum, Integer errorNum) {
        super(tpsNum, errorNum);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        // 流量检测
    }
}
