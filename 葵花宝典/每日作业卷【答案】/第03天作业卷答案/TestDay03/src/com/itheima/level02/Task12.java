package com.itheima.level02;

import java.util.Scanner;


/*
	ѧУ�����˶��ᣬ�������ܳɼ���10�����ڵ�ѧ�����ʸ�������������Ա��Ϊ�������Ů���顣
	������
		1.��������¼�����
		2.����double���͵ı���score���ڽ��ճɼ�������String���͵ı���gender���ڽ����Ա�
		3.��score��gender��ֵ
		4.����Ҫ�ж��Ƿ��ܹ��������
		5.��ȷ���������������£����ж��ǽ��������飬���ǽ���Ů����
 */
public class Task12 {
	public static void main(String[] args) {
//		1.��������¼�����
		Scanner sc = new Scanner(System.in);
//		2.����double���͵ı���score���ڽ��ճɼ�������String���͵ı���gender���ڽ����Ա�
		double score;
		String gender;
//		3.��score��gender��ֵ
		System.out.print("����������ɼ�(s):");
		score = sc.nextDouble();
		System.out.print("�������Ա�");
		gender = sc.nextLine();
//		4.����Ҫ�ж��Ƿ��ܹ��������
		if(score <= 10) {
//		5.��ȷ���������������£����ж��ǽ��������飬���ǽ���Ů����
			if(gender.equals("��")) {
				System.out.println("�������Ӿ����飡");
			} else if(gender.equals("Ů")) {
				System.out.println("����Ů�Ӿ����飡");
			}
		} else {
			System.out.println("��̭��");
		}
	}
}
