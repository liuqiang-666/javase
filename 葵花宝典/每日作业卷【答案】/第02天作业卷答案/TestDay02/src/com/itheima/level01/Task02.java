package com.itheima.level01;
/*
 * ����¼��һ��ѧ���ɼ�(int����),����ɼ����ڵ���60���������,����ɼ�С��60�����������
 */

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		//1. ��������һ��int���͵����֣�����ɼ�
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//2. ʹ����Ԫ������жϳɼ��Ƿ�Ϊ�����񡱻򡰲�����
		String result = (n>60)?"����":"������";
		//3. ��ӡ���
		System.out.println("�ɼ��Ƿ񼰸�" + result);
	}
}
