package com.itheima.level02;

import java.util.Random;
import java.util.Scanner;

/*
 * 分析以下需求，并用代码实现		
	1.提示用户输入10个整数，存入到int数组中；根据以下要求实现相关功能
	2.提示用户输入一个数字作为数组索引，查找数组中该索引对应的元素，
		（需要判断输入的数字是否在0-9之间包含临界值，如果该数字不符合要求则随机生成一个符合要求的索引）
	3.将a中得到的索引对应的元素的左右两边元素进行互换，若对应的元素是第一个或最后一个则不做任何操作
 */
public class Task07 {
	public static void main(String[] args) {
		//创建数组
		int[] arr = new int[10];
		//键盘录入给数组元素赋值
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("请您键盘录入第"+ (i + 1) + "个数");
			arr[i] = sc.nextInt();
		}
		//要获得的索引
		int index = 9;
		//调用获得数组元素方法
		int elment = getArrayElment(arr, index);
		System.out.println("获得到的元素为" + elment);
		//
		swap(arr, index);
		printArr(arr);
	}
	
	/*
	 * 提示用户输入一个数字作为数组索引，查找数组中该索引对应的元素，
	 * 参数 arr
	 * 参数 index
	 */
	public static int getArrayElment(int[] arr,int index) {
		//创建随机数对象
		Random r = new Random();
		//判断索引是否在0-9 之间
		if(index > 9 || index < 0) {//如果没有在0到9之间
//			随机生成一个0到9的数字赋值给索引变量
			index = r.nextInt(10);
		}
		//返回这个索引位置的变量
		return arr[index];
	}
	
	/*
	 * 将上步中得到的索引对应的元素的左右两边元素进行互换，若对应的元素是第一个或最后一个则不做任何操作
	 * 参数 arr 要交换的数组
	 * 参数 index 索引对应的元素的左右两边元素进行互换
	 */
	public static void swap(int[] arr, int index) {
		//如果是第一个或者最后一个元素，不交换
		if(index == 0 || index == arr.length - 1) {
			return;//直接返回，结束swap方法
		}
		//将索引两边的元素进行交换
		int temp = arr[index - 1];
		arr[index - 1] = arr[index + 1];
		arr[index + 1] = temp;
	}
	
	/*
	 * 遍历数组
	 */
	public static void printArr(int[] arr) {
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i]+", ");
			}
		}
	}
}
