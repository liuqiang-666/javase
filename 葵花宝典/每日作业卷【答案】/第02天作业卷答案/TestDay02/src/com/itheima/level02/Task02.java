package com.itheima.level02;
import java.util.Scanner;

/*
	1.�����ṩ��������ȡ���ڴ���ҵ������ڷ�Ϊһ�ꡢ���ꡢ���ꡢ���꣬����ƾ�浥֧ȡ��Ϣ
	2.���ʱ����£�
	
		����				������ (%)
		һ��				2.25
		����				2.7
		����				3.24
		����				3.6
	3.��ӡ��ʽ��
		�����뱾��1000
		����Ϊ��1000.0
		��ȡһ���ı�Ϣ�ǣ�1022.5
		��ȡ�����ı�Ϣ�ǣ�1027.0
		��ȡ�����ı�Ϣ�ǣ�1032.4
		��ȡ�����ı�Ϣ�ǣ�1036.0
		
	������
		1.��������¼�����
		2.ͨ������¼�뱾�𲢸�ֵ������bj
		3.����治ͬ���޵ı�Ϣ
		4.��ӡ��Ϣ
 */
public class Task02 {
	public static void main(String[] args) {
//		1.��������¼�����
		Scanner sc = new Scanner(System.in);
//		2.ͨ������¼�뱾�𲢸�ֵ������bj
		System.out.print("�����뱾��");
		double bj = sc.nextDouble();	//¼�뱾��
		System.out.println("����Ϊ��"+bj);
//		3.����治ͬ���޵ı�Ϣ
		double bx1 = bj * (1+2.25/100);	//����һ��ı�Ϣ
		double bx2 = bj * (1+2.7/100);	//��������ı�Ϣ
		double bx3 = bj * (1+3.24/100);	//��������ı�Ϣ
		double bx5 = bj * (1+3.6/100);	//��������ı�Ϣ
//		4.��ӡ��Ϣ
		System.out.println("��ȡһ���ı�Ϣ�ǣ�" + bx1);
		System.out.println("��ȡ�����ı�Ϣ�ǣ�" + bx2);
		System.out.println("��ȡ�����ı�Ϣ�ǣ�" + bx3);
		System.out.println("��ȡ�����ı�Ϣ�ǣ�" + bx5);
	}
}

