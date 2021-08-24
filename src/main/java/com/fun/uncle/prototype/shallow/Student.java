package com.fun.uncle.prototype.shallow;

import java.time.LocalDateTime;

/**
 * @Description:
 * @Author: fan
 * @DateTime: 2020/7/19 9:16 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Student {

    private String name;

    private LocalDateTime birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
