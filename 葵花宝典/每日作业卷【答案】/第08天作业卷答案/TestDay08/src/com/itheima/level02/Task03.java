package com.itheima.level02;

import java.util.Scanner;

/*
	������������,���ô���ʵ��
		1.����¼��һ��Դ�ַ������ַ�������srcStr����
		2.����¼��һ��Ҫɾ�����ַ������ַ�������delStr����
		3.Ҫ��
			ɾ������srcStr�����е�����delStr�ַ��������յ��ַ����в��ܰ���delStr����Ҫ���ӡɾ����Ľ���Լ�ɾ���˼���delStr�ַ���
		4.�������д�ӡ��ʽ:
			������Դ�ַ���:java woaijava,i like jajavava i enjoy java
			������Ҫɾ�����ַ���:java
			����̨������:Դ�ַ������ܹ�����:4 �� java ,ɾ��java����ַ���Ϊ: woai,i like  i enjoy

 */
public class Task03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.����¼��һ��Դ�ַ������ַ�������scrStr����
		System.out.print("������Դ�ַ���:");
		String srcStr = sc.nextLine();
		// 2.����¼��һ��Ҫɾ�����ַ������ַ�������delStr����
		System.out.print("������Ҫɾ�����ַ���:");
		String delStr = sc.nextLine();
		// 3.ɾ������scrStr�����е�����delStr�ַ��������յ��ַ����в��ܰ���delStr����Ҫ���ӡɾ����Ľ���Լ�ɾ���˼���delStr�ַ���
		printCount(srcStr, delStr);
		
	}

	//ɾ������scrStr�����е�����delStr�ַ��������յ��ַ����в��ܰ���delStr����Ҫ���ӡɾ����Ľ���Լ�ɾ���˼���delStr�ַ���
	private static void printCount(String srcStr, String delStr) {
		//ɾ����Ľ��
		String resultStr = srcStr.replace(delStr, "");
		//ɾ���˼���delStr�ַ���
		int count = (srcStr.length() - resultStr.length()) / delStr.length();
		
		System.out.println("Դ�ַ������ܹ�����:"+ count +" �� "+ delStr +" ,ɾ��"+ delStr +"����ַ���Ϊ: "+ resultStr);
	}
}
