package com.itheima.level01;

import java.util.Random;

/*
 * �������5����Χ��[1,100]������,����Щ���������и�λ��ʮλΪ3�����ִ�ӡ����
 * 
 * 20 30 50 63 90
 * 30 63
 */
public class Task01 {
	public static void main(String[] args) {
		//1. �������5����Χ��[1,100]������
		Random r = new Random();
		//�����ִ�ŵ�������
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = r.nextInt(100) + 1; //[1,100]
		}
		
		//��ӡ���е������
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//2. ��λ��ʮλΪ3�����ִ�ӡ
		for (int i = 0; i < arr.length; i++) {
			//��ȡʮλ���λ������
			int ge = arr[i] % 10;
			int shi = arr[i] /10 % 10;
			if (ge == 3 || shi == 3) {
				System.out.print(arr[i] + " ");
			}
			
		}
	}
}
