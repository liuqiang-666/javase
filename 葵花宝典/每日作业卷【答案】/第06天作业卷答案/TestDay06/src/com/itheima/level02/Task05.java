package com.itheima.level02;
/*
 * 分析以下需求，并用代码实现
	有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13... 定义一个方法求出这个数列的前20 项之和。
 */
public class Task05 {
	public static void main(String[] args) {
		double sum = getSum();
		System.out.println(sum);
	}
	
	public static double getSum() {
		//2/1，3/2，5/3，8/5，13/8，21/13
		//分子     2 3 5 8 13 21
		//分母     1 2 3 5 8 13
		//定义两个数组，一个存储分子，另一个存储分母
		int[] fzArr = new int[20];
		int[] fmArr = new int[20];
		
		fzArr[0] = 2;
		fzArr[1] = 3;
		fmArr[0] = 1;
		fmArr[1] = 2;
		//求分子分母每一项
		for(int i = 2; i < fzArr.length; i++) {
			fzArr[i] = fzArr[i - 1] + fzArr[i - 2];
			fmArr[i] = fmArr[i - 1] + fmArr[i - 2];
		}
		//定义求和变量
		double sum = 0;
		
		for(int i = 0; i < fzArr.length; i++) {
			sum += fzArr[i]/(fmArr[i] + 0.0);
		}
		return sum;
	}
}
