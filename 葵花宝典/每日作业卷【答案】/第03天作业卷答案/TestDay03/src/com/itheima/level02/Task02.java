package com.itheima.level02;

import java.util.Scanner;

/*
 * �����������󣬲��ô���ʵ�֣�
	1.����������ģ����������ܣ��Լ���¼�������int���͵����ݽ��мӡ������ˡ��������㣬����ӡ������
	2.Ҫ��
		(1)����¼����������,����ǰ������������μ���������ݣ�
			����������ΪҪ���е�����(0:��ʾ�ӷ�����,1:��ʾ��������,2:��ʾ�˷�����,3:��ʾ��������)
		(2)ʹ�ý�����ѧ֪ʶ��ɹ���
		(3)��ʾ��ʽ����:
			�������һ������:30
			������ڶ�������:40
			��������Ҫ���е�����(0:��ʾ�ӷ�����,1:��ʾ��������,2:��ʾ�˷�����,3:��ʾ��������):0
			����̨���:30+40=70

 */
public class Task02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = sc.nextInt();
		System.out.println("������ڶ�������");
		int b = sc.nextInt();
		System.out.println("��������Ҫ���е�����(0:��ʾ�ӷ�����,1:��ʾ��������,2:��ʾ�˷�����,3:��ʾ��������):");
		int type = sc.nextInt();
		//����������ڽ��ս��
		double result = 0;
		switch(type) {
			case 0://���ӷ�
				result = a + b;
				System.out.println(a+"+"+b+"="+result);
				break;
			case 1:
				result = a - b;
				System.out.println(a+"-"+b+"="+result);
				break;
			case 2:
				result = a * b;
				System.out.println(a+"*"+b+"="+result);
				break;
			case 3:
				result = a / (b + 0.0);
				System.out.println(a+"/"+b+"="+result);
				break;
			default:
				System.out.println("����������");
		}
	}
}
