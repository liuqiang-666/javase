package com.itheima.level01_02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * ����˵����
 * 		�ӿ���̨����3��ѧԱ����Ϣ��
 * 		ÿ�����д洢��һ��Student�����У������Student����洢��һ�������С�
 * 		������Ϻ󣬽�����ѧԱ��Ϣ�洢���ļ�Student.txt�С�
 * 		ÿ��ѧԱ��Ϣ�洢һ�У��������ֵ�м��ö��Ÿ�����
 */
public class Task02 {
	public static void main(String[] args) throws IOException {
		//1.����ѧ����, �����ѧ���ļ���
		ArrayList<Student> list = new ArrayList<Student>();
		//2.ͨ��3��ѭ����������²���
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			//��������ѧ������Ϣ��
			System.out.print("�������"+i+"��ѧ����ѧ�ţ�");
			String id = sc.next();
			System.out.print("�������"+i+"��ѧ����������");
			String name = sc.next();
			System.out.print("�������"+i+"��ѧ�����Ա�");
			String sex = sc.next();
			System.out.print("�������"+i+"��ѧ�������䣺");
			String age = sc.next();
			//����Ϣ��װ��Student������
			Student s = new Student(id, name, sex, age);
			//��Student����浽������
			list.add(s);
		}
		//3.������ѧԱ��Ϣ�洢���ļ�Student.txt�С�
		BufferedWriter out = new BufferedWriter(new FileWriter("Student.txt"));
		//ÿ��ѧԱ��Ϣ�洢һ�У��������ֵ�м��ö��Ÿ�����
		for (int i = 0; i < list.size(); i++) {
			//1.��ȡ������ÿһ��ѧ������
			Student s = list.get(i);
			//2.��ȡ�����е�ÿһ������ֵ,�������ֵ�м��ö��Ÿ���
			String line = s.getId() +","+ s.getName() +","+ s.getSex() +","+ s.getAge();
			//3.����ָ���ĸ�ʽ�Ѷ��������ֵ��д�뵽�ļ���
			out.write(line);
			out.newLine();
			out.flush();
		}
		out.close();//�ر���
		
	}
}
