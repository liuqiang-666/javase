package com.itheima.level01;

/*
 * ��֪����int[] nums = {5,10,15},Ҫ�󴴽�һ��������
 * 1.������ĳ��Ⱥ���֪������ͬ
 * 2.������ÿ��Ԫ�ص�ֵ ����֪�����Ӧλ��Ԫ�ص�2��
 * 3.�ڿ���̨�д�ӡ�����������Ԫ��
 */
public class Task03 {
	public static void main(String[] args) {
		//1.������֪����int[] nums = {5,10,15}
		int[] nums = {5,10,15};
		//2.����һ�������飬������ĳ��Ⱥ���֪������ͬ
		int len = nums.length;
		int[] newArr = new int[len];
		//3.������ÿ��Ԫ�ص�ֵ ����֪�����Ӧλ��Ԫ�ص�2��
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = nums[i] * 2;//Ԫ�ص�ֵ ����֪�����Ӧλ��Ԫ�ص�2��
		}
		//4.�ڿ���̨�д�ӡ�����������Ԫ��
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + "  ");
		}
	}
}