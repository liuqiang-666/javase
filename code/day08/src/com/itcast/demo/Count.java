package com.itcast.demo;


import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            String s=sc.nextLine();
            test(s);
        }

    }
    public static void test(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        if(s.equals(sb.toString())){
            System.out.println("这个字符串是对称的！");
        }else {
            System.out.println("这个字符串不是对称的");
        }

    }
}