package com.itheima.level01;

/*
 * ����������int[] arr={10,20};
 * ����һ���������������ֵĺ�,ʹ����������������������Ԫ����ӵĽ������ӡ
 */
public class Task03 {
	public static void main(String[] args) {
		//1. ��������
		int[] arr={10,20};
		//3. ���÷�����ʹ����������������������Ԫ����ӵĽ��,��ӡ�ۼƺ�
		int sum = add( arr[0], arr[1] );
		System.out.println("sum=" + sum);
	}
	
	//2. ����һ���������������ֵĺ�
	/*
	 * ָ���������ƣ�add
	 * ָ������������int a, int b
	 * ָ������ֵ��int
	 */
	public static int add(int a, int b){
		//���������ֵĺ�
		return a+b;
	}
}
