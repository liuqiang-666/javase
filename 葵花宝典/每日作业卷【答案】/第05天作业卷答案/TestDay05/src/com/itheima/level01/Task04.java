package com.itheima.level01;
/*
 * �������и�������int[] arr= {10,20,30,40,50,60};����һ���������Խ����������������
	���������������Ԫ�ص���Сֵ
 */
public class Task04 {
	public static void main(String[] args) {
		//1. ��������int[] arr= {10,20,30,40,50,60}
		int[] arr= {10,20,30,40,50,60};
		//3. ���÷�������ӡ������Ԫ�ص���Сֵ
		System.out.println( getMin(arr) );
	}
	
	//2. ����һ���������Խ����������������,���������������Ԫ�ص���Сֵ
	/*
	 * ָ�����������ƣ� getMin
	 * ָ�������Ĳ�����int[] 
	 * ָ�������ķ���ֵ��int
	 */
	public static int getMin(int[] att){
		//����һ��������������¼�ҵ�����Сֵ
		int min = att[0];
		//ʹ��ѭ��������������Ԫ�����αȽϣ����յõ���Сֵ
		for (int i = 1; i < att.length; i++) {
			if (min > att[i]) {
				//������СֵΪ��ǰ����Ԫ��ֵ
				min = att[i];
			}
		}
		return min;
	}

	
}
