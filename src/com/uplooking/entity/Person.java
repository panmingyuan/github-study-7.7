package com.uplooking.entity;

/**
 * Description：xxx<br/>
 * Copyright (c) ，2018， PanMingYuan <br/>
 * This program is protected by copyright laws. <br/>
 * Date：2018年07月07日
 *
 * @author 潘明元
 * @version : 1.0
 */
public class Person {
    private String name;
    private int age;
    private String sex;

    public Person() {
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
