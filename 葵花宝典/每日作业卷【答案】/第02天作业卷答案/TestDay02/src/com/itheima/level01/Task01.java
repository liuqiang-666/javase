package com.itheima.level01;

import java.util.Scanner;

/*
 * ����¼��һ��int���͵�����,ʹ����Ԫ������ж����������������ż��
 */
public class Task01 {
	public static void main(String[] args) {
		//1.��������һ��int���͵�����
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//2.ʹ����Ԫ������ж����������������ż��
			// ����%2==0
		String result = (n%2==0)?"ż��":"����";
		//3.��ӡ���
		System.out.println("������ǣ�" + result);
	}
}
