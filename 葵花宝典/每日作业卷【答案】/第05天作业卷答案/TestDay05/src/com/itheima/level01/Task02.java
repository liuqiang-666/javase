package com.itheima.level01;

import java.util.Random;

/*
 * ���������������,������ķ�Χ����[1,100],���巽���������������ĺͲ���ӡ��ֵ
 */
public class Task02 {
	public static void main(String[] args) {
		//1.���������������
		//������ķ�Χ����[1,100]
		Random r = new Random();
		int x = r.nextInt(100) + 1;//[1,100]
		int y = r.nextInt(100) + 1;//[1,100]
		//3.���÷�������ӡ��ֵ
		System.out.println( add(x, y) );
	}
	
	//2.���巽���������������ĺ�
	/*
	 * ָ������������ add
	 * ָ�������Ĳ��� int a, int b
	 * ����ֵ��int
	 */
	public static int add(int a, int b){
		System.out.println("a="+a);
		System.out.println("b="+b);
		return a+b;
	}
}
