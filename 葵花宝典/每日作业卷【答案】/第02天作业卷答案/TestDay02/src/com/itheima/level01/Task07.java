package com.itheima.level01;
/*
 * ����int���͵ı���i,��ʼ��ֵΪ5.
 * �ٶ���double���͵ı���d ,��ʼ��ֵΪ3.14.
 * ������i�ͱ���d����ٸ�ֵ����һ��short���͵ı���s.���s��ֵ.
 */
public class Task07 {
	public static void main(String[] args) {
		//1.�������int i�� ֵ5
		int i = 5;
		//2.�������double d�� ֵ 3.14
		double d = 3.14;
		//3.�ѱ���i�����d�е�ֵ��ӣ�5+3.14 = 8.14; �ٸ�ֵ����һ��short���͵ı���s
		
		
		short s = (short)(i + d);//��Ҫ����ǿ������ת������Ϊint������double���ͼ���Ľ��Ϊdouble���͡���double���͵����ݸ���short���ͣ���Ҫǿ������ת��
		//4.���s��ֵ
		System.out.println("���s��ֵ:" + s);
	}
}
