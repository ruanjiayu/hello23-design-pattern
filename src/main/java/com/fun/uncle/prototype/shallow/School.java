package com.fun.uncle.prototype.shallow;

import java.util.List;

/**
 * @Description:
 * @Author: fan
 * @DateTime: 2020/7/19 9:16 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class School implements Cloneable{

    private String name;

    private List<Teacher> teachers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("不知道这个是啥");
        super.finalize();
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", teachers=" + teachers +
                '}';
    }
}
