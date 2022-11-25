package com.fun.uncle.principle7.开闭;

/**
 * @Description:
 * @Author: summer
 * @CreateDate: 2022/11/25 11:17
 * @Version: 1.0.0
 */
public class Test {

    public static void main(String[] args) {
        ApiStatInfo apiStatInfo = new ApiStatInfo();
        apiStatInfo.setApi("");
        apiStatInfo.setRequestCount(0L);
        apiStatInfo.setErrorCount(0L);
        apiStatInfo.setDurationOfSeconds(0L);

        ApplicationContext.getInstance().getAlert().check(apiStatInfo);
    }
}
