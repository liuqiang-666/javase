package com.itheima.level01;
/*
 * ����һ������,ʵ��ͬʱ������������ļӼ��˳��Ľ��,��ͬʱ������������
 */
public class Task05 {
	public static void main(String[] args) {
		//1. ����2������
		int a =20;
		int b = 5;
		//2. ���÷�����ʵ�ֵõ��Ӽ��˳��Ľ��
		int[] result = getNums(a, b);
		//3. ��ӡ���
		System.out.println("���������ļӼ��˳��Ľ��Ϊ��");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	/*
	 * 1.����һ������,ʵ��ͬʱ������������ļӼ��˳��Ľ��,��ͬʱ������������
	 * ָ�����������ƣ� getNums
	 * ָ�������Ĳ����� int a, int b
	 * ָ�������ķ���ֵ�� int[]
	 */
	public static int[] getNums(int a, int b){
		//����һ�����飬��żӼ��˳��Ľ��
		int[] arr = new int[4];
		arr[0] = a+b;
		arr[1] = a-b;
		arr[2] = a*b;
		arr[3] = a/b;
		return arr;
	}
}
