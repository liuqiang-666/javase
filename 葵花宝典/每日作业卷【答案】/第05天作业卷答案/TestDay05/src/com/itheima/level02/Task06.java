package com.itheima.level02;
/*
�����������󣬲��ô���ʵ��(ÿ��С������Ҫ��װ�ɷ���)
	1.����������֮��(������С��)
	2.�ж����������Ƿ����(������С��)
	3.��ȡ�������нϴ��ֵ(������С��)
	4.��ȡ�������н�С��ֵ(������С��)
	5.������һ������ʵ��3��4����������
	
	������
		1.����������֮��(������С��)
			(1)�������ͣ�int����double
			(2)����ֵ���ͣ�int����double
			������Ҫ�����������صķ�����һ��Ϊ������int���ݵĺͣ�һ��Ϊ������double���ݵĺ�
		2.�ж����������Ƿ����(������С��)
			(1)�������ͣ�int����double
			(2)����ֵ���ͣ�boolean
			������Ҫ�����������صķ�����һ��Ϊ�ж�����int�����Ƿ���ȣ�һ��Ϊ�ж�����double�����Ƿ����
		3.��ȡ�������нϴ��ֵ(������С��)
			(1)�������ͣ�int����double
			(2)����ֵ���ͣ�int����double
			������Ҫ�����������صķ�����һ��Ϊ������int���ݵ����ֵ��һ��Ϊ������double���ݵ����ֵ
		4.��ȡ�������н�С��ֵ(������С��)	
			(1)�������ͣ�int����double
			(2)����ֵ���ͣ�int����double
			������Ҫ�����������صķ�����һ��Ϊ������int���ݵ���Уֵ��һ��Ϊ������double���ݵ���Сֵ
		5.������һ������ʵ��3��4����������
			(1)�������ͣ�int����double���������и�flag������ڱ�ʾ�����������ֵ������Сֵ(boolean����)
			(2)����ֵ���ͣ�int����double
			������Ҫ�����������صķ�����һ��Ϊ������int���ݵ���Уֵ��һ��Ϊ������double���ݵ���Сֵ
 */	
public class Task06 {
	public static void main(String[] args) {
		//���Դ���ʡ�ԡ���������
	}
	/**
	 * 
	 * @param num1 int ����
	 * @param num2 int ����
	 * @return ��num1��num2�ĺͣ�����Ϊint����
	 */
	public static int sum(int num1,int num2) {
		return num1 + num2;
	}
	/**
	 * 
	 * @param num1 double ����
	 * @param num2 double ����
	 * @return ��num1��num2�ĺͣ�����Ϊdouble����
	 */
	public static double sum(double num1,double num2) {
		return num1 + num2;
	}
	
	/**
	 * 
	 * @param num1 int ����
	 * @param num2 int ����
	 * @return �ж�num1��num2�Ƿ���ȣ�����Ϊboolean����
	 */
	public static boolean equals(int num1,int num2) {
		return num1 == num2;
	}
	
	/**
	 * 
	 * @param num1 double ����
	 * @param num2 double ����
	 * @return �ж�num1��num2�Ƿ���ȣ�����Ϊboolean����
	 */
	public static boolean equals(double num1,double num2) {
		
		return num1 == num2;
	}
	/**
	 * 
	 * @param num1 int ����
	 * @param num2 int ����
	 * @return ����num1��num2�еĽϴ�ֵ������Ϊint����
	 */
	public static int max(int num1,int num2) {
		
		return num1>num2?num1:num2;
	}
	
	/**
	 * 
	 * @param num1 double ����
	 * @param num2 double ����
	 * @return ����num1��num2�еĽϴ�ֵ������Ϊdouble����
	 */
	public static double max(double num1,double num2) {
		
		return num1>num2?num1:num2;
	}
	
	/**
	 * 
	 * @param num1 int ����
	 * @param num2 int ����
	 * @return ����num1��num2�еĽ�Сֵ������Ϊint����
	 */
	public static int min(int num1,int num2) {
		
		return num1>num2?num1:num2;
	}
	
	/**
	 * 
	 * @param num1 double ����
	 * @param num2 double ����
	 * @return ����num1��num2�еĽ�Сֵ������Ϊdouble����
	 */
	public static double min(double num1,double num2) {
		
		return num1>num2?num2:num1;
	}
	/**
	 * 
	 * @param num1 int ����
	 * @param num2 int ����
	 * @param flag true��ʾ�����ֵ��false��ʾ����Сֵ
	 * @return ����num1��num2�еĽϴ�ֵ������Сֵ������Ϊint����
	 */
	public static int maxOrMin(int num1,int num2,boolean flag) {
		if(flag)
			return num1>num2?num1:num2;
		return num1>num2?num2:num1;	
	}
	
	/**
	 * 
	 * @param num1 double ����
	 * @param num2 double ����
	 * @param flag true��ʾ�����ֵ��false��ʾ����Сֵ
	 * @return ����num1��num2�еĽϴ�ֵ������Сֵ������Ϊdouble����
	 */
	public static double maxOrMin(double num1,double num2,boolean flag) {
		if(flag)
			return num1>num2?num1:num2;
		return num1>num2?num2:num1;	
	}
}
