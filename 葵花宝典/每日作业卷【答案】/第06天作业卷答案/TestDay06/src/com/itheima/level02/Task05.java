package com.itheima.level02;
/*
 * �����������󣬲��ô���ʵ��
	��һ�������У�2/1��3/2��5/3��8/5��13/8��21/13... ����һ���������������е�ǰ20 ��֮�͡�
 */
public class Task05 {
	public static void main(String[] args) {
		double sum = getSum();
		System.out.println(sum);
	}
	
	public static double getSum() {
		//2/1��3/2��5/3��8/5��13/8��21/13
		//����     2 3 5 8 13 21
		//��ĸ     1 2 3 5 8 13
		//�����������飬һ���洢���ӣ���һ���洢��ĸ
		int[] fzArr = new int[20];
		int[] fmArr = new int[20];
		
		fzArr[0] = 2;
		fzArr[1] = 3;
		fmArr[0] = 1;
		fmArr[1] = 2;
		//����ӷ�ĸÿһ��
		for(int i = 2; i < fzArr.length; i++) {
			fzArr[i] = fzArr[i - 1] + fzArr[i - 2];
			fmArr[i] = fmArr[i - 1] + fmArr[i - 2];
		}
		//������ͱ���
		double sum = 0;
		
		for(int i = 0; i < fzArr.length; i++) {
			sum += fzArr[i]/(fmArr[i] + 0.0);
		}
		return sum;
	}
}
