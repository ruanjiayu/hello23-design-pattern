package com.fun.uncle.builder.demo3;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2021/11/3 11:33 上午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Item {

    private String itemName;

    //
    private Integer type;

    // 卡券code
    private String code;

    // 视频必填
    private String url;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", type=" + type +
                ", code='" + code + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
