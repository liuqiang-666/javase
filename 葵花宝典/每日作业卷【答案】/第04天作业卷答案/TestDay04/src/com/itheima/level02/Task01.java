package com.itheima.level02;

import java.util.Random;

/*
 * 	������1-10���浽һ������Ϊ10��һά������
	����һ��������,����Ϊ3,ȡ��ԭ���������������Ԫ��(�������Ƿ��ظ�)
	���������Ԫ�ظ�ֵ
	������������Ԫ�صĺ�
 */
public class Task01 {
	public static void main(String[] args) {
		//������1-10���浽һ������Ϊ10��һά������
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = i+1;
		}
		//����һ��������,����Ϊ3,ȡ��ԭ���������������Ԫ��(�������Ƿ��ظ�)
		int[] newArr = new int[3];
		for (int i = 0; i < newArr.length; i++) {
			Random r = new Random();
			//ȡ��ԭ�������е����Ԫ��Ϊ������Ԫ�ظ�ֵ
			int index = r.nextInt(arr.length);
			newArr[i] = arr[index];
		}
		
		//������������Ԫ�صĺ�
		int sum = 0;
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
			sum += newArr[i];
		}
		System.out.println("sum =" + sum);
	}
}
