package com.fun.uncle.flow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2021/10/25 2:57 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Context {

    /**
     * 结果缓存
     */
    private Map<String, Object> resultMap = new HashMap<>();

    public Map<String, Object> getAdaptorMap() {
        return resultMap;
    }

    public void setAdaptorMap(Map<String, Object> resultMap) {
        this.resultMap = resultMap;
    }


}
