package com.itheima.level02;

import java.util.Scanner;

/*
	����һ�����󣬲��ô���ʵ��
	1.����¼��ѧԱ�źƵ�3�ſγ�(Java��SQL��Web)�ĳɼ�
	2.��д����ʵ�֣�
		(1)Java�γ̺�SQL�γ̵ķ���ֻ��
		(2)3�ſγ̵�ƽ����
		������
			1.��������¼�����
			2.���������������ڴ洢���ſγ̵ĳɼ�
			3.ʹ��nextInt()���������ſγ̵ı�����ֵ
			4.����洢��ֵ��ƽ��ֵ�ı���
			5.���ֵ��ƽ��ֵ
			6.��ӡ���ս��
 */
public class Task03 {
	public static void main(String[] args) {
//		1.��������¼�����
		Scanner sc = new Scanner(System.in);
//		2.���������������ڴ洢���ſγ̵ĳɼ�
		int java,sql,web;
//		3.ʹ��nextInt()���������ſγ̵ı�����ֵ
		System.out.print("������Java�ĳɼ���");
		java = sc.nextInt();
		System.out.print("������SQL�ĳɼ���");
		sql = sc.nextInt();
		System.out.print("������Web�ĳɼ���");
		web = sc.nextInt();
//		4.����洢��ֵ��ƽ��ֵ�ı���
		int diff;//��ֵ
		double avg;//ƽ��ֵ
//		��ӡ�û�����ĳɼ�
		System.out.println("---------------------------");
		System.out.println("Java\tSQL\tWeb");
		System.out.println(java+"\t"+sql+"\t"+web);
		System.out.println("---------------------------");
		
//		5.���ֵ��ƽ��ֵ
		diff = java-sql;		//����Java��SQL�ĳɼ���
		avg = (java+sql+web)/3;	//����ƽ����
		//		6.��ӡ���ս��
		System.out.println("Java��SQL�ĳɼ��"+diff);
		System.out.println("���ſε�ƽ�����ǣ�"+avg);
		
	}
}