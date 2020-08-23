package com.itheima.level02;

import java.util.Scanner;
import java.util.Arrays;

/*
 * 	1.����¼��10����������������
	2.����һ������������������������,ż������������Ҳ�
	3.����һ��������ӡԭ����ʹ���������
 */
public class Task01 {
	public static void main(String[] args) {
//		����¼��10����������������
		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		int[] arr = {1,2,3,4,5,6,7,8,9,10,10,1};
		
		print(arr);
		swap(arr);
		print(arr);
		count(arr);
	}
	
	/*
	 * ��ӡ����
	 */
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
	 * ����һ������������������������,ż������������Ҳ�
	 */
	public static void swap(int[] arr) {
		//������� i �� j���ڼ��� 
		int i = 0;
		int j = arr.length - 1;
		//ѭ������
		while(i < j) {//���i < j һֱ����        //����������
			//j�ȴ����������
			while(arr[j] % 2 == 0 && i < j) {//���������ż������һֱ��������             //�ڲ���� i ��  j �ƶ��Ĵ���
				j--;
			}
			while(arr[i] % 2 == 1   && i < j) {//���������������һֱ�������� 
				i++;
			}
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			
		}
	}
	/**
	 * 
	 * @param arr int���͵�����
	 * @param num ��Ҫͳ�ƴ���������
	 * @return int ��������num������arr�г��ֵĴ���
	 */
	public static int count(int[] arr,int num) {
		//���������
		int count = 0;
		//��������
		for(int i = 0;i<arr.length;i++) {
			if(num==arr[i]) {//������鵱ǰԪ�غ�Ҫͳ�Ƶ�����num��ֵ���
				count++;//������+1
			}
		}
		//����count
		return count;
	}
	
	//������������ֻ����һ�ε����ּ�����
	/**
	 * 
	 * @param arr int���͵�����
	 * @return void ��ӡ����arr��ֻ����һ�ε����ּ�����
	 */
	public static void count(int[] arr) {
		int count = 0;//��¼ֻ����һ�ε����ֵĸ���
		//��������
		for(int i = 0;i<arr.length;i++) {
			if(count(arr,arr[i])==1) {//��������е�ǰԪ���������г��ֵĴ�������1
				if(count==0){//˵�������˵�һ������һ�ε����֣�Ҫ��ӡ������ʾ��Ϣ���Ժ��ٳ��ֲ��ô�ӡ��
					System.out.print("���飺"+Arrays.toString(arr)+"�У�ֻ����һ�ε����ְ�����");	
				}
				System.out.print(arr[i]+" ");//��ӡ��Ԫ��
				count++;//������+1
			}
		}
		System.out.println();
		System.out.println("���飺"+Arrays.toString(arr)+" ��ֻ����һ�ε����ֵ�����Ϊ��"+count+" ��");
	}
}
