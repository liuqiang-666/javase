package com.itheima.level01;

import java.util.Scanner;

/*
 * ����¼���Լ�������(String),����(int),���(int)���浽��Ӧ�ı�����,
 * ��������:�ҵ�����������,����25��,���180CM(��ʾ������String����,��Ҫʹ��Scanner��next()����.)
 * 
 */

public class Task03 {
	public static void main(String[] args) {
		//1.�����������������䡢���
		//��������ΪString���ͣ�Ҫʹ��Scanner��next()����
		//�������䡢���Ϊint���ͣ���ʹ��Scanner��nextInt()����
		Scanner sc = new Scanner(System.in);
		String name = sc.next();//����
		int age = sc.nextInt();//����
		int height = sc.nextInt();//���
		
		//2.��ӡ���
		//�ҵ�����������,����25��,���180CM
		System.out.println("�ҵ�������"+ name +",����"+ age +"��,���"+ height +"CM");
	}
}
