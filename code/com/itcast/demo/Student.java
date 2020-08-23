package com.itcast.demo;

public class Student {
     private int age;
     private String name;
     private  String birth;
     private  int num;

    public Student() {
    }

    public Student(int age, String name, String birth, int num) {
        this.age = age;
        this.name = name;
        this.birth = birth;
        this.num = num;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
