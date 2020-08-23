package com.itheima.level02;
/*
 * 分析以下需求，并用代码实现
	1.求1-500之内能同时被2，5，7整除的所有数及个数并5个一行打印
	2.求100以内能被3整除的数加上能被5整除的数的和
 */
public class Task04 {
	public static void main(String[] args) {
//		fun1();
		fun2();
	}
	/*
	 * 求1-500之内能同时被2，5，7整除的所有数及个数并5个一行打印
	 */
	public static void fun1() {
		int count = 0;
		for(int i = 1; i <= 500;i++) {
			//判断这个数能否同时被2，5，7整除
			if(i % 2 == 0 && i % 5 == 0 && i % 7 == 0) {
				count++;//把计数器+1
				//先打印
				System.out.print(i+" ");
				if(count % 5 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("总个数为 "+ count);
	}
	/*
	 * 2.求100以内能被3整除的数加上能被5整除的数的和
	 *        之间判断 能否 被3 || 被5 整除     
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
