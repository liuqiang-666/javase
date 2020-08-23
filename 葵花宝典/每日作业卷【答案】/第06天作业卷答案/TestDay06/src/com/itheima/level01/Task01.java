package com.itheima.level01;

import java.util.Random;

/*
 * 随机产生5个范围是[1,100]的整数,把这些数字中所有个位或十位为3的数字打印出来
 * 
 * 20 30 50 63 90
 * 30 63
 */
public class Task01 {
	public static void main(String[] args) {
		//1. 随机产生5个范围是[1,100]的整数
		Random r = new Random();
		//把数字存放到数组中
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = r.nextInt(100) + 1; //[1,100]
		}
		
		//打印所有的随机数
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//2. 个位或十位为3的数字打印
		for (int i = 0; i < arr.length; i++) {
			//获取十位与个位的数字
			int ge = arr[i] % 10;
			int shi = arr[i] /10 % 10;
			if (ge == 3 || shi == 3) {
				System.out.print(arr[i] + " ");
			}
			
		}
	}
}
