package com.itheima.level02;

import java.util.Scanner;

/*
	������һ������Ϊ5�����飬����Ԫ��ͨ������¼�룬������ʾ��
	int[] arr = {1,3,-1,5,-2}
	Ҫ��
		����һ��������newArr[],��������Ԫ�صĴ��˳����ԭ�����е�Ԫ�����򣬲������ԭ�����е�Ԫ��ֵС��0��
		���������а�0�洢��������ԭ������������е�����
	������
		1.��������¼�����
		2.���峤��Ϊ5��int���͵�����arr
		3.����forѭ��ͨ������¼�������Ԫ�ظ�ֵ
		4.���峤��Ϊ5��int���͵�������newArr������int���͵ı���index=0��������ʾ�������Ԫ������
		5.���ű���ԭ����
			(1)����int���͵ı���num���������鵱ǰԪ�ص�ֵ��ֵ��num
			(2)ʹ��if�ж�num��ֵ
				a.���num>=0,ֱ�ӽ�num��ֵ��������ĵ�ǰԪ�أ�index++
				b.����ֱ�ӽ�0���Ƹ�������ĵ�ǰԪ�أ�index++
		6.��ӡԭ���������������ݣ�����forѭ����
 */
public class Task04 {
	public static void main(String[] args) {
//		1.��������¼�����
		Scanner sc = new Scanner(System.in);
//		2.���峤��Ϊ5��int���͵�����arr
		int[] arr = new int[5];
//		3.����forѭ��ͨ������¼�������Ԫ�ظ�ֵ
		System.out.println("������5��������");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
//		4.���峤��Ϊ5��int���͵�������newArr������int���͵ı���index=0��������ʾ�������Ԫ������
		int[] newArr = new int[5];
		int index = 0;
//		5.���ű���ԭ����
		for(int i = arr.length-1;i>=0;i--) {
//			(1)����int���͵ı���num���������鵱ǰԪ�ص�ֵ��ֵ��num
			int num = arr[i];
//			(2)ʹ��if�ж�num��ֵ
			if(num>=0) {//a.���num>=0,ֱ�ӽ�num��ֵ��������ĵ�ǰԪ�أ�index++
				newArr[index] = num;
//				index++;
			} else {
//				b.����ֱ�ӽ�0���Ƹ�������ĵ�ǰԪ�أ�index++
				newArr[index] = 0;
//				index++;
			}
			index++;
		}
//		6.��ӡԭ���������������ݣ�����forѭ����
		System.out.println("ԭ�������ݣ�");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("���������ݣ�");
		for(int i = 0;i<newArr.length;i++) {
			System.out.print(newArr[i]+" ");
		}
		System.out.println();
		
	}
}
