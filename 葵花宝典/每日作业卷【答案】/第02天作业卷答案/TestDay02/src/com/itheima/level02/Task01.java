package com.itheima.level02;

import java.util.Scanner;
/*
	1.С���������зֱ�������ֽ�ƣ����磺����10�ͺ���8������10��8��ͨ������¼�룩��Ҫ���д���뽻��С�����е���
	2.�������еĽ�����£�

	������С�������е�ֽ�ƣ�10
	������С�������е�ֽ�ƣ�8

	����ǰС�����е�ֽ�ƣ�
	�����е�ֽ�ƣ�10
	�����е�ֽ�ƣ�8

	������С�����е�ֽ�ƣ�
	�����е�ֽ�ƣ�8
	�����е�ֽ�ƣ�10
	
	������
		1.��������¼�����
		2.����int���͵ı���left��right����ͨ��nextInt()������left��right��ֵ
		3.������ʱ����tempʵ��left��right����ֵ�ý���
		4.����ʽ��ӡ������Ľ��

*/
public class Task01 {
	public static void main(String[] args) {		
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		//¼�������е�ֽ������
		System.out.print("������С�������е�ֽ�ƣ�");
		int left = sc.nextInt();
		//¼�������е�ֽ������
		System.out.print("������С�������е�ֽ�ƣ�");
		int right = sc.nextInt();
		//��ӡ����ǰ��ֽ��
		System.out.println();
		System.out.println("����ǰС�����е�ֽ�ƣ�");
		System.out.println("�����е�ֽ�ƣ�"+left);
		System.out.println("�����е�ֽ�ƣ�"+right);
		System.out.println();
		// ����һ����ʱ����temp,����left��ֵ
		int temp = left;
		// ��right��ֵ��ֵ��left
		left = right;
		// ����ʱ����temp��ֵ��ֵ��right 
		right = temp;
		// ��ӡ������ֽ��
		System.out.println("������С�����е�ֽ�ƣ�");
		System.out.println("�����е�ֽ�ƣ�"+left);
		System.out.println("�����е�ֽ�ƣ�"+right);
	}
}
