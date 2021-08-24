package com.fun.uncle.prototype.deep;

import java.time.LocalDateTime;
import java.util.Collections;

/**
 * @Description: 原型模式测试
 * @Author: fan
 * @DateTime: 2020/7/19 9:20 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student student = new Student();
        student.setName("阮佳裕");
        student.setBirthday(LocalDateTime.now());

        Teacher teacher = new Teacher();
        teacher.setName("菜老师");
        teacher.setStudents(Collections.singletonList(student));

        School school = new School();
        school.setName("绍兴市高级中学");
        school.setTeacher(teacher);

        /**
         * 【origin】School{name='绍兴市高级中学', teacher=Teacher{name='菜老师', students=[Student{name='阮佳裕', birthday=2020-07-19T21:59:48.404}]}}
         * 【origin】2065951873
         * ==========开始克隆================
         * 【other】School{name='绍兴市高级中学', teacher=Teacher{name='菜老师', students=[Student{name='阮佳裕', birthday=2020-07-19T21:59:48.404}]}}
         * 【other】1791741888
         */
        System.out.println("【origin】" + school);
        System.out.println("【origin】" + school.hashCode());

        System.out.println("==========开始克隆================");

        School otherSchool = (School) school.clone();
        System.out.println("【other】" + otherSchool);
        System.out.println("【other】" + otherSchool.hashCode());


        System.out.println("==========开始深度拷贝=============");

        /**
         * 【origin】School{name='绍兴市高级中学', teacher=Teacher{name='菜老师', students=[Student{name='何', birthday=2020-07-19T21:59:48.404}]}}
         * 【origin】2065951873
         * 【other】School{name='绍兴市高级中学', teacher=Teacher{name='徐', students=[Student{name='何', birthday=2020-07-19T21:59:48.404}]}}
         * 【other】1791741888
         */
        otherSchool.getTeacher().setName("徐");
        otherSchool.getTeacher().getStudents().get(0).setName("何");
        System.out.println("【origin】" + school);
        System.out.println("【origin】" + school.hashCode());
        System.out.println("【other】" + otherSchool);
        System.out.println("【other】" + otherSchool.hashCode());


    }
}
