package com.itheima.level01;

import java.util.Scanner;

/*
 * ����¼��һ�������εĳ��Ϳ�(���Ϳ�Ϊint����),���㳤���ε�������ܳ�
 */

public class Task05 {
	public static void main(String[] args) {
		//1. �������볤���εĳ����
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();//��
		int width = sc.nextInt();//��
		
		//2. ���㳤���ε�������ܳ�
		// ��� = �� * ��
		int area = length * width;
		// �ܳ� = (�� + ��) * 2
		int c = (length + width) * 2;
		
		System.out.println("�����ε����Ϊ��"+ area +"���ܳ�Ϊ" + c);
	}
}
