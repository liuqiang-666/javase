package com.itheima.level01;
/*
 * ����һ���������Ԫ�ص�����,��Ϊÿ��Ԫ�ظ�ֵ,������������Ԫ�ص���Сֵ
 */
public class Task01 {
	public static void main(String[] args) {
		//1.����һ���������Ԫ�ص�����,��Ϊÿ��Ԫ�ظ�ֵ
		int[] arr = {23,54,22,13,55};
		//2.������������Ԫ�ص���Сֵ
		//����һ����������¼��Сֵ
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			//��ȡ�����е�ÿ��Ԫ��
			//arr[i]
			//��һ�Ƚϣ��õ���Сֵ
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("min = " + min);
	}
}
