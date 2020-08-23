package com.itcast.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        lo:while(true){
            
            System.out.println("======欢迎来到学生管理系统；====");
            System.out.println("============1、查询=============");
            System.out.println("============2、添加=============");
            System.out.println("============3、删除=============");
            System.out.println("============4、修改=============");
            System.out.println("============5、退出=============");
            System.out.print("请输入你的选择 ；");
            int a=sc.nextInt();
            switch (a) {
                case 1:
                    indexdata(list);
                    break;
                case 2:
                    Adddata(list);
                    break;
                case 3:
                    deldata(list);
                    
                    break;
                case 4:
                    update(list);
                    break;            
            
                case 5:
                    System.out.println("欢迎你的使用！感谢");
                    break lo;            
               default:
                    System.out.println("您的输入有误!");
                    break;
            }

        }

    } 

    public static void Adddata(ArrayList<Student> list) {
        Scanner sc =new Scanner(System.in);
        lo1:while(true){
            System.out.println("请输入您要添加的学生姓名：");
            String name=sc.nextLine();
        
            System.out.println("请输入您要添加的学生学号：");
            int pid=sc.nextInt();
            for (int i = 0; i < list.size(); i++) {
                    if(list.get(i).getNum()==pid){
                    System.out.println("您的学号重复了！换个学号吧！");
                    continue lo1;
                }
                
            }
            System.out.println("请输入您要添加的学生年龄：");
            int age=sc.nextInt();
            System.out.println("请输入您要添加的学生生日：");
            String bir=sc.next();
            Student stu =new Student(age, name,bir, pid);
            list.add(stu);
            System.out.println("添加成功");
            break;
        }

    
    }

    public static void indexdata(ArrayList<Student> list) {
        if(list.size()==0){
            System.out.println("暂无学生信息请添加；");
            Adddata(list);
        }else{
            System.out.println("请输入学生学号");
            Scanner sc= new Scanner(System.in);
            int index=sc.nextInt();
            System.out.println("姓名\t学号\t年龄\t生日");

            for (int i = 0; i < list.size(); i++) {
                Student stu =list.get(i);
                System.out.println(stu.getName()+"\t"+stu.getNum()+"\t"+stu.getAge()+"\t"+stu.getBirth());
                
            }
        }
        
    }

    public static void deldata(ArrayList<Student> list){
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入删除的学生学号");
        int index=sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNum()==index){
                Student stu =list.get(i);
                
                System.out.println(stu.getName()+"\t"+stu.getNum()+"\t"+stu.getAge()+"\t"+stu.getBirth());
                list.remove(i);
            }else{
                System.out.println("对不起没有找到这条信息！");
            }
        }

    }

    public static void update(ArrayList<Student> list) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入你要更新的学生信息：");
        int index=sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNum()==index){
                // Scanner sc =new Scanner(System.in);
                System.out.println("请输入您要更新的学生姓名：");
                String name=sc.nextLine();
                System.out.println("请输入您要更新的学生年龄：");
                int age=sc.nextInt();
                System.out.println("请输入您要更新的学生生日：");
                String bir=sc.next();
                Student stu =new Student(age, name,bir, index);
                list.add(stu);
                System.out.println("更新成功");
                
            }
        }
        
    }
}

