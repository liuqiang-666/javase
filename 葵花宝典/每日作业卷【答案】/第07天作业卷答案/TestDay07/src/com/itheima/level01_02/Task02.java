package com.itheima.level01_02;

import java.util.Scanner;

/*
 * 1. ��ƣ�������һ��ѧԱ�ࣺStudent
 * 		ѧԱ��ţ�String�� 
		������String��
		�Ա�String��
		��ߣ�double��
		���䣨int��
		�ṩ�޲κ�ȫ�εĹ��췽��\get\set
 */
public class Task02 {
	public static void main(String[] args) {
		//2. ͨ���û���������ѧԱ��š���������Ϣ�������ݱ��浽������
		Scanner sc = new Scanner(System.in);
		System.out.print("������ѧԱ��ţ�");
		String id = sc.next();
		System.out.print("������ѧԱ������");
		String name = sc.next();
		System.out.print("������ѧԱ�Ա�");
		String sex = sc.next();
		System.out.print("������ѧԱ��ߣ�");
		double height = sc.nextDouble();
		System.out.print("������ѧԱ���䣺");
		int age = sc.nextInt();
		
		//3. ����Student����ͨ�����췽�����������ݴ洢��Student������
		Student stu = new Student(id, name, sex, height, age);
		//4. ��ӡ�����е�ÿ������ֵ��
		System.out.println(stu.getId() + ", " + stu.getName() + "," + stu.getSex() + ", " + stu.getHeight() + ", " + stu.getAge());;
	}
}
