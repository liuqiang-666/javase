package com.itheima.level01;

/*
 * ʹ��ѭ�����,���1-100֮�������֮��.
 * 
 */
public class Task02 {
	public static void main(String[] args) {
		// 1.����һ����������¼�������ۼӺ�
		int sum = 0;
		// 2.ʹ��ѭ����䣬�õ�1-100֮���ÿһ����
		for (int i = 1; i <= 100; i++) {
			// �жϵ�ǰ�������Ƿ�Ϊ���� ��1��3��5��7��9�� ����%2 == 1
			if (i % 2 == 1) {
				// �����������ۼƺ�
				//sum = sum + i;
				sum += i;
			}	
		}
		// 3.��ӡ������
		System.out.println("1-100�������ۼӺͣ�" + sum);
	}
}
