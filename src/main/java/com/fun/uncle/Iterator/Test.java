package com.fun.uncle.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2021/11/4 5:45 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i =1;i<10;i++){
            list.add(i);
        }
        Iterator it = list.iterator();
        while(it.hasNext()){
            it.remove();
        }
    }
}
