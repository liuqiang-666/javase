package com.itheima.level01;

import java.util.Scanner;

/*
 * ����¼��ѧ�����Գɼ����ж�ѧ���ȼ�:
	90-100	����
	80-90	��
	70-80	��
	60-70	����
	60����	������
 */
public class Task01 {
	public static void main(String[] args) {
		//1. ����¼��ѧ�����Գɼ� int����
		Scanner sc = new Scanner(System.in);
		System.out.print("������ѧ���ĳɼ���");
		int score = sc.nextInt();
		/*
		 * 2.�ж�ѧ���ȼ�
		 * 	90-100	����
			80-90	��
			70-80	��
			60-70	����
			0 -60	������
			����<0 ���� ����>100 �� ��ʾ��������
		 */
		if (score<0 || score>100) {//����<0 ���� ����>100 
			System.out.println("����ķ�������");
		} else if (score >= 90){//	90-100	����
			System.out.println("����");
		} else if (score >=80 ){//80-90	��
			System.out.println("��");
		} else if (score >=70 ){//70-80	��
			System.out.println("��");
		} else if (score >=60 ){//60-70	����
			System.out.println("����");
		} else {//0 -60	������
			System.out.println("������");
		}
		
	}
}
