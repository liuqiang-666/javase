package com.itheima.level01;

import java.util.Scanner;

/*
 * 	�Ӽ�����¼��һ������100����λ��,���100��������֮����������Ҫ�������֮��:
  		1.���ֵĸ�λ����Ϊ7;
  		2.���ֵ�ʮλ����Ϊ5;
  		3.���ֵİ�λ����Ϊ3;
 */
public class Task04 {
	public static void main(String[] args) {
		//����һ����������¼�����������ֵ��ۼƺ�
		int sum = 0;
		//��������һ������ 100-999
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//ʹ��ѭ����100-��������������֣���ȡ���е�ÿһ������
		for (int i = 100; i <= n; i++) {
			//��ȡ��ǰ���ֵĸ�λ��ʮλ����λ������
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 100 % 10;
			//�жϵ�ǰ�������Ƿ񣨸�λ����Ϊ7 ����ʮλ����Ϊ5 ���� ��λ����Ϊ3��
			if (ge!= 7 && shi!=5 && bai!=3) {
				//���������������ֽ����ۼƺ͵Ĳ���
				sum += i;
				System.out.println(i);
			}
		}
		System.out.println("��������Ҫ�������֮��:" + sum );
	}
}
