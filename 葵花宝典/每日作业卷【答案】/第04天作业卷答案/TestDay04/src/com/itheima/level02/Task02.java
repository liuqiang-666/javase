package com.itheima.level02;

import java.util.Random;
import java.util.Scanner;

/*
 	�����������󣬲��ô���ʵ��
	1.����¼��༶����
	2.����¼��İ༶������������
	3.�������������0-100�ĳɼ�(����0��100)
	4.Ҫ��:
		(1)��ӡ�ð༶�Ĳ���������
		(2)��ӡ�ð༶��ƽ����
		(3)��ʾ��ʽ����:
			������༶����:
			����¼��:100
			����̨���:
				����������:19
				�༶ƽ����:87
	������
		1.��������¼�����
		2.����int���͵ı���num����ͨ������¼���num��ֵ
		3.����int���͵����飬���鳤��Ϊnum
		4.����Random����
		5.��������
			(1)�������[0-100]��ֵ
			(2)�������������ֵ��ֵ�������еĵ�ǰԪ��
		6.�������count����ͳ�Ʋ�����ѧԱ�������������sum����ͳ���ܷ�
		7.��������
			(1)����ǰԪ�ص�ֵ�ۼӵ�sum��
			(2)�жϵ�ǰԪ�ص�ֵ���<60,count++
		8.��ӡ������������ƽ���֣�sum/num��
 
 */
public class Task02 {
	public static void main(String[] args) {
//		1.��������¼�����
		Scanner sc = new Scanner(System.in);
//		2.����int���͵ı���num����ͨ������¼���num��ֵ
		System.out.println("������༶����:");
		int num = sc.nextInt();
//		3.����int���͵����飬���鳤��Ϊnum
		int[] arr = new int[num];
//		4.����Random����
		Random r = new Random();
//		5.��������
		for(int i = 0;i<arr.length;i++) {
//			(1)�������[0-100]��ֵ
			int score = r.nextInt(101);
//			(2)�������������ֵ��ֵ�������еĵ�ǰԪ��
			arr[i] = score;
		}
//		6.�������count����ͳ�Ʋ�����ѧԱ�������������sum����ͳ���ܷ�
		int count = 0;
		int sum = 0;
//		7.��������
		for(int i = 0;i<arr.length;i++) {
//			(1)����ǰԪ�ص�ֵ�ۼӵ�sum��
			sum+=arr[i];
//			(2)�жϵ�ǰԪ�ص�ֵ���<60,count++
			if(arr[i]<60)
				count++;
		}
//		8.��ӡ������������ƽ���֣�sum/num��
		System.out.println("����������:"+count);
		System.out.println("�༶ƽ����:"+sum/num);
		
	}
}
