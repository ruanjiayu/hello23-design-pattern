package com.fun.uncle.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description: 正则表达式测试
 * @Author: Summer
 * @DateTime: 2021/10/27 3:01 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class RegularUtil {

    private final static Pattern PATTERN = Pattern.compile("^付定金立减");

    public static void main(String[] args) {
        String target = "付定金立减500元";
        Matcher matcher = PATTERN.matcher(target);
        // 付定金立减 加工成 付XX定金立减
        if (matcher.find()) {
            StringBuilder sb = new StringBuilder(target);
            sb.insert(1, "阮佳裕");
            System.out.println(sb);
        }
    }
}
