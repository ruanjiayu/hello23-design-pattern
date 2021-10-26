package com.fun.uncle.flow;

import org.apache.commons.lang3.StringUtils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description: 流程节点
 * @Author: Summer
 * @DateTime: 2021/10/25 3:03 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class FlowNode {

    /**
     * key: 类名字或者 groupName_类名字
     * value: 节点配置
     */
    private Map<String, NodeConf> nodeMap = new LinkedHashMap<>();

    /**
     * 新增流程节点
     * @param groupName 组名
     * @param clazz
     * @param nodeConf
     */
    public void add(String groupName, Class clazz, NodeConf nodeConf) {
        String key;
        if (StringUtils.isNotBlank(groupName)) {
            key = groupName + "_" + clazz.getName();
        } else {
            key = clazz.getName();
        }

        if (nodeMap.containsKey(key)) {
            return;
        }

        nodeMap.put(key, nodeConf);
    }

    /**
     *
     * @param clazz node节点类
     * @param nodeConf 节点配置
     */
    public void add(Class clazz, NodeConf nodeConf) {
        this.add(clazz.getName(), clazz, nodeConf);
    }

    /**
     * 节点替换
     * @param groupName
     * @param clazz
     * @param nodeConf
     */
    public void replace(String groupName, Class clazz, NodeConf nodeConf) {
        String key;
        if (StringUtils.isNotBlank(groupName)) {
            key = groupName + "_" + clazz.getName();
        } else {
            key = clazz.getName();
        }

        nodeMap.put(key, nodeConf);
    }

    /**
     * 节点替换
     * @param clazz
     * @param nodeConf
     */
    public void replace(Class clazz, NodeConf nodeConf) {
        this.replace(clazz.getName(), clazz, nodeConf);
    }

    public void remove(String groupName, Class clazz) {
        String key;
        if (StringUtils.isNotBlank(groupName)) {
            key = groupName + "_" + clazz.getName();
        } else {
            key = clazz.getName();
        }

        nodeMap.remove(key);
    }

    public void remove(Class clazz) {
        this.remove(clazz.getName(), clazz);
    }

    public Set<String> getNodeKeyList() {
        return nodeMap.keySet();
    }

    public Map<String, NodeConf> getNodeMap() {
        return nodeMap;
    }

    public void setMap(LinkedHashMap<String, NodeConf> map) {
        this.nodeMap = map;
    }



    /**
     * 内部类：node的节点配置
     */
    public static class NodeConf {

        private int timeout = 1000;

        public NodeConf() {
        }

        public NodeConf(int timeout) {
            this.timeout = timeout;
        }

        public int getTimeout() {
            return timeout;
        }

        public void setTimeout(int timeout) {
            this.timeout = timeout;
        }
    }
}
