package com.fun.uncle.principle7.开闭;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: summer
 * @CreateDate: 2022/11/25 10:51
 * @Version: 1.0.0
 */
public class Alert {

    private List<AlertHandle> alertHandles = new ArrayList<>();

    public void addAlertHandle(AlertHandle alertHandle) {
        this.alertHandles.add(alertHandle);
    }

    public void check(ApiStatInfo apiStatInfo) {
        for (AlertHandle handle : alertHandles) {
            handle.check(apiStatInfo);
        }
    }

}
