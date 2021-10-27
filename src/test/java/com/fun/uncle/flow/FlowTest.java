package com.fun.uncle.flow;

import com.fun.uncle.ApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2021/10/26 8:28 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class FlowTest extends ApplicationTests {

    @Autowired
    private FlowEngine flowEngine;

    @Test
    public void expireTest() throws Exception{
        FlowNode testFlow = Flow.getTestFlow();
        // 要处理的参数
        RunData runData = new RunData();
        runData.setParam("阮佳裕");
        Context context = new Context();
        flowEngine.execute(testFlow, runData, context);
        Map<String, Object> adaptorMap = context.getAdaptorMap();

        // 获取各个校验的处理结果
        System.out.println("结果:" + adaptorMap.get("NodeOne"));
        System.out.println("结果:" + adaptorMap.get("NodeTwo"));
    }
}
