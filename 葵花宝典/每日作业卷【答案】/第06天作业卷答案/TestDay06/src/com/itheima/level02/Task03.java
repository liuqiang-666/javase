package com.itheima.level02;

import java.util.Scanner;

/*
 * 分析以下需求，并用代码实现
	1.键盘录入6个int类型的数据存数数组arr中
	2.将arr数组中的内容反转
	3.将翻转后的数组角标为奇数的互相交换 1和3换, 3和5换,以此类推
	4.最后将数组最后一个角标为奇数的元素 和数组中第一个角标为奇数的元素交换
	5.打印最终的数组(实现了1-4步之后的数组)
	6.如：用户输入的6个int数字为[1,2,3,4,5,6],最后输出的结果为[6, 5, 4, 1, 2, 3]
 */
public class Task03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//创建数组
		int[] arr = new int[6];
		//循环给数组的每一个元素键盘录入赋值
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		reverse(arr);
		swap(arr);
		swapStart2End(arr);
		print(arr);
	}
	public static void print(int[] arr) {
		//shift + alt + m      将选中代码抽取到一个方法中
		System.out.print("[");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length -1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}
	
	/*
	 * 反转数组
	 */
	public static void reverse(int[] arr) {
		for(int i = 0 ; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}
	
	/*
	 * 将翻转后的数组角标为奇数的互相交换 1和3换, 3和5换,以此类推
	 * 遍历数组。判断索引是不是奇数，如果是奇数和和当前索引+2的元素交换
	 */
	public static void swap(int[] arr) {
		for(int i = 0; i < arr.length - 2; i++) {
			if(i % 2 == 1) {
				int temp = arr[i];
				arr[i] = arr[i + 2];
				arr[i + 2] = temp;
			}
		}
	}
	
	/*
	 * 将数组最后一个角标为奇数的元素 和数组中第一个角标为奇数的元素交换
	 */
	public static void swapStart2End(int[] arr) {
		//第一个为奇数的索引
		int startIndex = 1;
		// 最后一个
		int endIndex = 0;
		//如果数组长度为偶数，最大奇数索引就是最后一个索引
		if(arr.length % 2 == 0) {
			endIndex = arr.length - 1;
		} else {
			endIndex = arr.length - 2;
		}
		
		int temp = arr[startIndex];
		arr[startIndex] = arr[endIndex];
		arr[endIndex] = temp;
	}
}
