package com.itheima.level02;
/*
 * �����������󣬲��ô���ʵ��
	1.��1-500֮����ͬʱ��2��5��7��������������������5��һ�д�ӡ
	2.��100�����ܱ�3�������������ܱ�5���������ĺ�
 */
public class Task04 {
	public static void main(String[] args) {
//		fun1();
		fun2();
	}
	/*
	 * ��1-500֮����ͬʱ��2��5��7��������������������5��һ�д�ӡ
	 */
	public static void fun1() {
		int count = 0;
		for(int i = 1; i <= 500;i++) {
			//�ж�������ܷ�ͬʱ��2��5��7����
			if(i % 2 == 0 && i % 5 == 0 && i % 7 == 0) {
				count++;//�Ѽ�����+1
				//�ȴ�ӡ
				System.out.print(i+" ");
				if(count % 5 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("�ܸ���Ϊ "+ count);
	}
	/*
	 * 2.��100�����ܱ�3�������������ܱ�5���������ĺ�
	 *        ֮���ж� �ܷ� ��3 || ��5 ����     
	 */
	public static void fun2() {
		int sum = 0;
		for(int i = 0; i < 100; i++) { // 15
			if(i % 3==0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
