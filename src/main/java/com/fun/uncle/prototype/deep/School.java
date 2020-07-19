package com.fun.uncle.prototype.deep;

import java.util.List;

/**
 * @Description:
 * @Author: fan
 * @DateTime: 2020/7/19 9:16 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class School implements Cloneable{

    private String name;

    private Teacher teacher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        School clone = (School) super.clone();
        Teacher teacher = (Teacher) clone.getTeacher().clone();
        clone.setTeacher(teacher);
        return clone;
    }


    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
