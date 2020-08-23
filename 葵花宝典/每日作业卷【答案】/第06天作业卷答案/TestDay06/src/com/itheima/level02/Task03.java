package com.itheima.level02;

import java.util.Scanner;

/*
 * �����������󣬲��ô���ʵ��
	1.����¼��6��int���͵����ݴ�������arr��
	2.��arr�����е����ݷ�ת
	3.����ת�������Ǳ�Ϊ�����Ļ��ཻ�� 1��3��, 3��5��,�Դ�����
	4.����������һ���Ǳ�Ϊ������Ԫ�� �������е�һ���Ǳ�Ϊ������Ԫ�ؽ���
	5.��ӡ���յ�����(ʵ����1-4��֮�������)
	6.�磺�û������6��int����Ϊ[1,2,3,4,5,6],�������Ľ��Ϊ[6, 5, 4, 1, 2, 3]
 */
public class Task03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//��������
		int[] arr = new int[6];
		//ѭ���������ÿһ��Ԫ�ؼ���¼�븳ֵ
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		reverse(arr);
		swap(arr);
		swapStart2End(arr);
		print(arr);
	}
	public static void print(int[] arr) {
		//shift + alt + m      ��ѡ�д����ȡ��һ��������
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length -1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}
	
	/*
	 * ��ת����
	 */
	public static void reverse(int[] arr) {
		for(int i = 0 ; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}
	
	/*
	 * ����ת�������Ǳ�Ϊ�����Ļ��ཻ�� 1��3��, 3��5��,�Դ�����
	 * �������顣�ж������ǲ�������������������ͺ͵�ǰ����+2��Ԫ�ؽ���
	 */
	public static void swap(int[] arr) {
		for(int i = 0; i < arr.length - 2; i++) {
			if(i % 2 == 1) {
				int temp = arr[i];
				arr[i] = arr[i + 2];
				arr[i + 2] = temp;
			}
		}
	}
	
	/*
	 * ���������һ���Ǳ�Ϊ������Ԫ�� �������е�һ���Ǳ�Ϊ������Ԫ�ؽ���
	 */
	public static void swapStart2End(int[] arr) {
		//��һ��Ϊ����������
		int startIndex = 1;
		// ���һ��
		int endIndex = 0;
		//������鳤��Ϊż����������������������һ������
		if(arr.length % 2 == 0) {
			endIndex = arr.length - 1;
		} else {
			endIndex = arr.length - 2;
		}
		
		int temp = arr[startIndex];
		arr[startIndex] = arr[endIndex];
		arr[endIndex] = temp;
	}
}
