package com.itheima.level02;

import java.util.Random;
import java.util.Scanner;

/*
 * �����������󣬲��ô���ʵ��		
	1.��ʾ�û�����10�����������뵽int�����У���������Ҫ��ʵ����ع���
	2.��ʾ�û�����һ��������Ϊ�������������������и�������Ӧ��Ԫ�أ�
		����Ҫ�ж�����������Ƿ���0-9֮������ٽ�ֵ����������ֲ�����Ҫ�����������һ������Ҫ���������
	3.��a�еõ���������Ӧ��Ԫ�ص���������Ԫ�ؽ��л���������Ӧ��Ԫ���ǵ�һ�������һ�������κβ���
 */
public class Task07 {
	public static void main(String[] args) {
		//��������
		int[] arr = new int[10];
		//����¼�������Ԫ�ظ�ֵ
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("��������¼���"+ (i + 1) + "����");
			arr[i] = sc.nextInt();
		}
		//Ҫ��õ�����
		int index = 9;
		//���û������Ԫ�ط���
		int elment = getArrayElment(arr, index);
		System.out.println("��õ���Ԫ��Ϊ" + elment);
		//
		swap(arr, index);
		printArr(arr);
	}
	
	/*
	 * ��ʾ�û�����һ��������Ϊ�������������������и�������Ӧ��Ԫ�أ�
	 * ���� arr
	 * ���� index
	 */
	public static int getArrayElment(int[] arr,int index) {
		//�������������
		Random r = new Random();
		//�ж������Ƿ���0-9 ֮��
		if(index > 9 || index < 0) {//���û����0��9֮��
//			�������һ��0��9�����ָ�ֵ����������
			index = r.nextInt(10);
		}
		//�����������λ�õı���
		return arr[index];
	}
	
	/*
	 * ���ϲ��еõ���������Ӧ��Ԫ�ص���������Ԫ�ؽ��л���������Ӧ��Ԫ���ǵ�һ�������һ�������κβ���
	 * ���� arr Ҫ����������
	 * ���� index ������Ӧ��Ԫ�ص���������Ԫ�ؽ��л���
	 */
	public static void swap(int[] arr, int index) {
		//����ǵ�һ���������һ��Ԫ�أ�������
		if(index == 0 || index == arr.length - 1) {
			return;//ֱ�ӷ��أ�����swap����
		}
		//���������ߵ�Ԫ�ؽ��н���
		int temp = arr[index - 1];
		arr[index - 1] = arr[index + 1];
		arr[index + 1] = temp;
	}
	
	/*
	 * ��������
	 */
	public static void printArr(int[] arr) {
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i]+", ");
			}
		}
	}
}
