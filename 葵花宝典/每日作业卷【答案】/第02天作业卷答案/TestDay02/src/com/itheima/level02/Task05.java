package com.itheima.level02;

/*
 * ������˵������벻Ҫ��ǰ���У�
 */
public class Task05 {
	public static void main(String[] args) {
		 int a = 10;
		 int b = 20;
		 /*
		  	x = a + b++;�ȼ���a + (b++)
		  	�Ǽӷ�������������������ʽ�����㣬����˳�������
		  	a=10���Ѿ�ȷ����ֻ��Ҫȷ��b++��ֵ�Ϳ��Լ������յĽ��
		  	b++���ʽ��ֵ����++�ں��棬��ʹ��b(20)��ֵ��Ϊb++���ʽ��ֵ��20������ִ��++������b���21��������b��ֵ�Ƕ��ٶ�����Ӱ��b++���ʽ��ֵ
		  	x = a + b++ = 10 + 20 = 30��a=10,b=21
		  */
		 int x = a + b++;
		 System.out.println("b=" + b);
		 System.out.println("x=" + x);
	}
}

