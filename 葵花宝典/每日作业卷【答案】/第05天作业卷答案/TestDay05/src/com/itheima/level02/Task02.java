package com.itheima.level02;

import java.util.Scanner;

/*
 * �����������󣬲��ô���ʵ��
	1.����¼�볤���εĳ��Ϳ�
		���巽������ó����ε��ܳ�,����main�����д�ӡ�ܳ�
	2.����¼�볤���εĳ��Ϳ�
		���巽������ó����ε����,����main�����д�ӡ���
	3.����¼��Բ�İ뾶
		���巽�������Բ���ܳ�,����main�����д�ӡ�ܳ�
	4.����¼��Բ�İ뾶
		���巽�������Բ�����,����main�����д�ӡ���
 */
public class Task02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����볤���εĳ�");
		int length = sc.nextInt();
		System.out.println("�����볤���εĿ�");
		int width = sc.nextInt();
		int zc = getRectZhouChang(length, width);
		System.out.println("�������ܳ���"+zc);
		int area = getRectArea(length, width);
		System.out.println("�����������"+area);
		
		System.out.println("������Բ�İ뾶");
		int r = sc.nextInt();
		double area2 = getCirlArea(r);
		System.out.println("Բ�������"+area2);
		double zc2 = getCirlZhouChang(r);
		System.out.println("Բ���ܳ���"+zc2);
	}
	/*
	 * ����ֵ��double �ܳ�
	 * ������������
	 */
	public static int getRectZhouChang(int length, int width) {
		int zc = (length + width) * 2;
		return zc;
	}
	/*
	 *  �����
	 *  ������������
	 */
	public static int getRectArea(int length, int width) {
		return length * width;
	}
	/*
	 * ����ֵ��double �ܳ�
	 * �������뾶
	 */
	public static double getCirlZhouChang(double r) {
		double zc = 2 * 3.14159265358979323846 * r;
		return zc;
	}
	/*
	 *  �����
	 */
	public static double getCirlArea(double r) {
		return 3.14159265358979323846 * r * r;
	}
}
