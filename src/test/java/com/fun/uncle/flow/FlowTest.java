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
        FlowEngine.RunData runData = new FlowEngine.RunData();
        runData.setParamOne("one");
        runData.setParamTwo("two");
        Context context = new Context();
        flowEngine.execute(testFlow, runData, context);
        Map<String, Object> adaptorMap = context.getAdaptorMap();

        System.out.println(adaptorMap.get("NodeOne"));
        System.out.println(adaptorMap.get("NodeTwo"));
    }
}
