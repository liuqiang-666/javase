package com.itheima.level01;
/*
 * ����һ������,��������������ڸ���int�������г��ֵĴ���,���һ��û�г����򷵻�0
	��:��������3 ���3������ int[] arr = {3,4,3,5,7,9};�г��ֵĴ��� 
 */
public class Task03 {
	public static void main(String[] args) {
		//1.ָ��Ҫ���ҵ�����
		int key = 3;
		//2.ָ������
		int[] arr = {3,4,3,5,7,9};
		//3.��������������ڸ���int�������г��ֵĴ���
		int count = getCount(arr, 3);
		System.out.println("���ֵĴ���:" + count);
		
	}
	
	/*
	 * ��������������ڸ���int�������г��ֵĴ���
	 * ָ�����������ƣ� getCount
	 * ָ�������Ĳ����� int[] arr,  int key
	 * ָ�������ķ���ֵ�� int 
	 */
	public static int getCount(int[] arr, int key){
		//1.��¼key���ֵĴ���
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			//�Ƚ�����Ԫ����key���Ƿ���ͬ
			if (arr[i] == key) {
				//key���ֵĴ��� + 1
				count++;
			}
		}
		return count;
	}
}
