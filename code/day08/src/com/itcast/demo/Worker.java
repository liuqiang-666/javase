package com.itcast.demo;

public class Worker {
    private String name;
    private int year;

    public Worker() {
    }

    public Worker(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "WorKer [姓名=" + name + ", 工龄=" + year + "]";
    }
    public void show(){
        System.out.println("姓名："+name+",年龄："+year);

    }
}
