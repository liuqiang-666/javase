package com.itheima.level02;

import java.util.Scanner;

/*
 * �����������󣬲��ô���ʵ�֣�
	1.���������߶�Ϊ8848�ף���һ���㹻���ֽ�����Ϊ0.0001�ס�
	2.���ʣ����۵����ٴΣ������۳����������ĸ߶ȡ�
 */
public class Task03 {
	public static void main(String[] args) {
		int count = 0;
		int mountainHigh = 8848000;//����
		int paperHigh = 1;//����
		while(paperHigh<mountainHigh) {
			paperHigh*=2;
			count++;
//			System.out.println(paperHigh);
		}
		System.out.println("�ܹ����� "+ count+" �Σ����ֽ�ŵĸ߶ȣ�"+paperHigh);
	}
}
