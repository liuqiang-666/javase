package com.itheima.level02;
/*
 * �������и�������int[] arr= {10,20,30,40,50,60};
 * �������û���ظ�Ԫ��.����һ���������Խ���������������鲢����������������Ԫ��ֵ������ֵ
 */
public class Task01 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60};
		System.out.println(getMaxIndex(arr));
	}

	public static int getMaxIndex(int[] arr){
		int max = arr[0];
		//�������Ԫ�ص�����ֵ
		int maxIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]){
				max = arr[i];
				//����ֵ�������Ԫ�ظı���ı�
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}
