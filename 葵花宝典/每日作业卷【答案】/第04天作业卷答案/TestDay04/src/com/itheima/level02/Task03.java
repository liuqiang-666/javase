package com.itheima.level02;

import java.util.Scanner;

/*
	�Ӽ���������10���������Ϸ�ֵλ1��2��3��������3������Ϊ�Ƿ����֡��Ա��ͳ��ÿ�������ͷǷ����ֵĸ�����
	������
		1.��������¼�����
		2.���峤��Ϊ10��int���͵�����
		3.����int���͵ı���count1��ͳ��1�ĸ�������count2��ͳ��2�ĸ�������count3��ͳ��3�ĸ�������count4��ͳ�ƷǷ����ֵĸ�����
		4.����forѭ��������Ԫ�ظ�ֵ
		5.����forѭ����������
			(1)��ȡ��ǰԪ��
			(2)ʹ��if�����ж�
				a.�������1 count1++
				b.�����������2 count2++
				c.�����������3 count3++
				d.���� count4++
				
		6.��ӡͳ�ƽ��
		
 */
public class Task03 {
	public static void main(String[] args) {
//		1.��������¼�����
		Scanner sc = new Scanner(System.in);
//		2.���峤��Ϊ10��int���͵�����
		int[] arr = new int[10];
//		3.����int���͵ı���count1��ͳ��1�ĸ�������count2��ͳ��2�ĸ�������count3��ͳ��3�ĸ�������count4��ͳ�ƷǷ����ֵĸ�����
		int count1 = 0,count2 = 0,count3 = 0,count4 = 0;
//		4.����forѭ��������Ԫ�ظ�ֵ
		System.out.println("������10��������");
		for(int i = 0;i < arr.length; i++)  {
			arr[i] = sc.nextInt();
		}
//		5.����forѭ����������
		for(int i = 0;i < arr.length;i++) {
//			(1)��ȡ��ǰԪ��
			int num = arr[i];
//			(2)ʹ��if�����ж�
			if(num == 1) { //a.�������1 count1++
				count1++;
			} else if(num == 2) {//b.�����������2 count2++
				count2++;
			} else if(num == 3) {//c.�����������3 count3++
				count3++;
			} else {//d.���� count4++
				count4++;
			}
		}
//		6.��ӡͳ�ƽ��
		System.out.println("����1�ĸ�����" + count1);
		System.out.println("����2�ĸ�����" + count2);
		System.out.println("����3�ĸ�����" + count3);
		System.out.println("�Ƿ����ֵĸ�����" + count4);
	}
}





