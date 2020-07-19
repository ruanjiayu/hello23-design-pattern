package com.fun.uncle.prototype.deep;

import java.util.List;

/**
 * @Description:
 * @Author: fan
 * @DateTime: 2020/7/19 9:16 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Teacher implements Cloneable{

    private String name;

    private List<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
