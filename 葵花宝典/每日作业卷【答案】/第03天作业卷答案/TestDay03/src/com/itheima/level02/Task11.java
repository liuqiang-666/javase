package com.itheima.level02;

import java.util.Scanner;

/*
	ĳ�����򳵣�ûʲô�������ڴ����������ж��ٴ��(����¼��)��
	������˵Ĵ���500������ѩ����DS9��
	����������˵Ĵ���100������ѩ����C6��
	����������˵Ĵ���50������ѩ����C5��
	����������˵Ĵ���10������ѩ���������᣻
	���������ݰ��ء�
	������
		1.��������¼�����
		2.����int���ͱ���money����ͨ��nextInt()������ȡ����¼���ֵ��ֵ������money
		3.ʹ��if-else ��money��ֵ�����жϣ�����ӡ�����Ϣ
 */
public class Task11 {
	public static void main(String[] args) {
//		1.��������¼�����
		Scanner sc = new Scanner(System.in);
//		2.����int���ͱ���money����ͨ��nextInt()������ȡ����¼���ֵ��ֵ������money
		int money = sc.nextInt();	//��λ����Ԫ
//		3.ʹ��if-else ��money��ֵ�����жϣ�����ӡ�����Ϣ
		if(money >= 500) { 			//money>=500
			System.out.println("̫���ˣ��ҿ�������ѩ����DS9");
		} else if(money >= 100) {	//money>=100 && money<500
			System.out.println("�����ҿ�������ѩ����C6");
		} else if(money >= 50) {	//money>=50 && money<100
			System.out.println("�ҿ�������ѩ����C5");
		} else if(money >= 10) {	//money>=10 && money<50
			System.out.println("�����ҿ�������ѩ����������");
		} else {					//money<10
			System.out.println("������ֻ�������ݰ�����");
		}
	}
}
