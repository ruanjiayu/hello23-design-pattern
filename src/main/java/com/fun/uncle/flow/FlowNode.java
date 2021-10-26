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

    private Map<String, NodeConf> nodeMap = new LinkedHashMap<>();

    /**
     *
     * @param groupName
     * @param nodeName
     * @param nodeConf
     */
    public void add(String groupName, Class nodeName, NodeConf nodeConf) {
        String key;
        if (StringUtils.isNotBlank(groupName)) {
            key = groupName + "_" + nodeName.getName();
        } else {
            key = nodeName.getName();
        }

        if (nodeMap.containsKey(key)) {
            return;
        }

        nodeMap.put(key, nodeConf);
    }

    public void add(Class nodeName, NodeConf nodeConf) {
        this.add(nodeName.getName(), nodeName, nodeConf);
    }

    public void replace(String groupName, Class nodeName, NodeConf nodeConf) {
        String key;
        if (StringUtils.isNotBlank(groupName)) {
            key = groupName + "_" + nodeName.getName();
        } else {
            key = nodeName.getName();
        }

        nodeMap.put(key, nodeConf);
    }

    public void replace(Class nodeName, NodeConf nodeConf) {
        this.replace(nodeName.getName(), nodeName, nodeConf);
    }

    public void remove(String groupName, Class nodeName) {
        String key = null;
        if (StringUtils.isNotBlank(groupName)) {
            key = groupName + "_" + nodeName.getName();
        } else {
            key = nodeName.getName();
        }

        nodeMap.remove(key);
    }

    public void remove(Class nodeName) {
        this.remove(nodeName.getName(), nodeName);
    }

    public Set<String> getNodeList() {
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

        private int timeout = 5000;

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
