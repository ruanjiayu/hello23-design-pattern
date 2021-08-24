package com.fun.uncle.prototype.shallow;

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
        school.setTeachers(Collections.singletonList(teacher));

        /**
         * 【origin】School{name='绍兴市高级中学', teachers=[Teacher{name='菜老师', students=[Student{name='阮佳裕', birthday=2020-07-19T21:43:13.966}]}]}
         * 【origin】2065951873
         * ==========开始克隆================
         * 开始克隆
         * 【other】School{name='绍兴市高级中学', teachers=[Teacher{name='菜老师', students=[Student{name='阮佳裕', birthday=2020-07-19T21:43:13.966}]}]}
         * 【other】1791741888
         */
        System.out.println("【origin】" + school);
        System.out.println("【origin】" + school.hashCode());

        System.out.println("==========开始克隆================");

        School otherSchool = (School) school.clone();
        System.out.println("【other】" + otherSchool);
        System.out.println("【other】" + otherSchool.hashCode());


        System.out.println("==========检查是否是浅拷贝=============");

        /**
         * 【origin】School{name='绍兴市高级中学', teachers=[Teacher{name='徐', students=[Student{name='阮佳裕', birthday=2020-07-19T21:43:13.966}]}]}
         * 【origin】2065951873
         * 【other】School{name='绍兴市高级中学', teachers=[Teacher{name='徐', students=[Student{name='阮佳裕', birthday=2020-07-19T21:43:13.966}]}]}
         * 【other】1791741888
         */
        otherSchool.getTeachers().get(0).setName("徐");
        System.out.println("【origin】" + school);
        System.out.println("【origin】" + school.hashCode());
        System.out.println("【other】" + otherSchool);
        System.out.println("【other】" + otherSchool.hashCode());



    }
}
