package com.itheima.level01;
/*
 * ����int���͵ı���a,����int���͵ı���b,
 * ʹ����Ԫ������ж����a����b����a��b�ĺ�,
 * ���򷵻�a��b�ĳ˻�,��ӡ���
 */
public class Task06 {
	public static void main(String[] args) {
		//1.����int���͵ı���a��b
		int a = 10;
		int b = 20;
		//2.�Ƚϱ���a�����b��ֵ�Ĵ�С
			//���a�󣬷���a+b�� ���b�󣬷���a*b
		int result = (a>b) ? (a+b) : (a*b);
		//3.��ӡ���
		System.out.println(result);
	}
}
