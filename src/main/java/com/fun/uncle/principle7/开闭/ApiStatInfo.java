package com.fun.uncle.principle7.开闭;

import lombok.Data;

/**
 * @Description:
 * @Author: summer
 * @CreateDate: 2022/11/25 10:56
 * @Version: 1.0.0
 */
@Data
public class ApiStatInfo {

    private String api;

    private long requestCount;

    private long errorCount;

    private long durationOfSeconds;
}
