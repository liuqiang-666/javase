package com.itheima.level01;

import java.util.Random;
import java.util.Scanner;

/*
 * ����¼��һ������������һ���ó��ȵ����飬Ϊÿһ��Ԫ�ظ�ֵΪ1-10���������������ӡ����������ֵ����5��Ϊż����Ԫ��.
 */
public class Task04 {
	public static void main(String[] args) {
		//1. ����¼��һ������
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		//2. ͨ���������������������
		int[] arr = new int[len];
		//3. ����Ԫ�ظ�ֵ��ѭ���ķ�ʽ��
		System.out.print("arr����Ԫ��ֵΪ��");
		for (int i = 0; i < arr.length; i++) {
			//ÿһ��Ԫ�ظ�ֵΪ1-10���������
			Random r = new Random();
			int n = r.nextInt(10) + 1;//1-10���������
			arr[i] = n;//������Ԫ�ظ�ֵ
			
			System.out.print(arr[i] + "  ");
		}
		//4. ��ӡ����Ԫ��ֵ
		System.out.println();
		System.out.print("����������Ԫ��Ϊ��");
		for (int i = 0; i < arr.length; i++) {
			//��ȡ����Ԫ�ص�n��
			int n = arr[i];
			//Ԫ��ֵ����5��Ϊż����Ԫ��
			if (n>5 && n%2==0) {
				System.out.print(n + "  ");
			}
		}
	}
}
