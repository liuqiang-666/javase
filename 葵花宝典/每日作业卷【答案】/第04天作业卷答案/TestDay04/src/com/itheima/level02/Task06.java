package com.itheima.level02;

/*
 * ������˵������벻Ҫ��ǰ���У�
 */

public class Task06 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] temp1 = arr1;//temp1��arr1ָ�����ͬһ������
		int[] temp2 = arr1;//temp2��arr1ָ�����ͬһ������
		//ͨ�����ϲ���arr1��temp1��temp2ָ�����ͬһ������
		System.out.println("ͨ��temp1ȡ������ֵ: ");
		
		for(int i = 0;i<temp1.length;i++) {
			//ͨ��temp1��ӡ����Ԫ�أ����ս��1 2 3 4 5
			System.out.print(temp1[i]+" ");
		}
		System.out.println();
		System.out.println("ͨ��temp2ȡ������ֵ: ");
		for(int i = 0;i<temp2.length;i++) {
			//ͨ��temp2��ӡ����Ԫ�أ����ս��1 2 3 4 5
			System.out.print(temp2[i]+" ");
		}
		System.out.println();
		//ͨ��temp1����ָ�������Ϊ2��Ԫ�ر�Ϊ9���������Ԫ��ֵ{1,2,9,4,5}
		temp1[2] = 9;
		
		System.out.println("ͨ��temp1ȡ������ֵ: ");
		for(int i = 0;i<temp1.length;i++) {
			//ͨ��temp1��ӡ����Ԫ�أ����ս��1 2 9 4 5
			System.out.print(temp1[i]+" ");
		}
		System.out.println();
		System.out.println("ͨ��temp2ȡ������ֵ: ");
		for(int i = 0;i<temp2.length;i++) {
			//ͨ��temp2��ӡ����Ԫ�أ����ս��1 2 9 4 5
			System.out.print(temp2[i]+" ");
		}
		System.out.println();
		
	}
}
