package com.itheima.level01;

import java.util.Random;

/*
 * ����һ������Ϊ3��һά����,��ÿ��Ԫ�ظ�ֵ. 
 * (Ҫ��������ÿ��Ԫ�ص�ֵ��0-9�������)
 * ���������ӡÿ��Ԫ�ص�ֵ
 * 
 */
public class Task02 {
	public static void main(String[] args) {
		//1.����һ������Ϊ3��һά����
		int[] arr = new int[3];
		//2.��ÿ��Ԫ�ظ�ֵ(ѭ���ķ�ʽ)
		for (int i = 0; i < arr.length; i++) {
			//������ÿ��Ԫ�ص�ֵ��0-9�������
			Random r = new Random();
			int num = r.nextInt(10); //0-9�������
			arr[i] = num; //���������ֵ������Ԫ��
		}
		//3.���������ӡÿ��Ԫ�ص�ֵ(ѭ���ķ�ʽ)
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
}
