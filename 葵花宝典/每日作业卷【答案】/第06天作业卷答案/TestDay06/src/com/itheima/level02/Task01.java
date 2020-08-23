package com.itheima.level02;

import java.util.Scanner;
import java.util.Arrays;

/*
 * 	1.键盘录入10个整数存入数组中
	2.定义一个方法将奇数放在数组的左侧,偶数放在数组的右侧
	3.定义一个方法打印原数组和处理后的数组
 */
public class Task01 {
	public static void main(String[] args) {
//		键盘录入10个整数存入数组中
		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		int[] arr = {1,2,3,4,5,6,7,8,9,10,10,1};
		
		print(arr);
		swap(arr);
		print(arr);
		count(arr);
	}
	
	/*
	 * 打印数组
	 */
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
	 * 定义一个方法将奇数放在数组的左侧,偶数放在数组的右侧
	 */
	public static void swap(int[] arr) {
		//定义变量 i 和 j用于检索 
		int i = 0;
		int j = arr.length - 1;
		//循环检索
		while(i < j) {//如果i < j 一直检索        //外层控制轮数
			//j先从右往左检索
			while(arr[j] % 2 == 0 && i < j) {//如果检索到偶数，就一直继续检索             //内层控制 i 和  j 移动的次数
				j--;
			}
			while(arr[i] % 2 == 1   && i < j) {//如果检索到数，就一直继续检索 
				i++;
			}
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			
		}
	}
	/**
	 * 
	 * @param arr int类型的数组
	 * @param num 需要统计次数的数字
	 * @return int 返回数字num在数组arr中出现的次数
	 */
	public static int count(int[] arr,int num) {
		//定义计数器
		int count = 0;
		//遍历数组
		for(int i = 0;i<arr.length;i++) {
			if(num==arr[i]) {//如果数组当前元素和要统计的数字num的值相等
				count++;//计数器+1
			}
		}
		//返回count
		return count;
	}
	
	//输出这个数组中只出现一次的数字及个数
	/**
	 * 
	 * @param arr int类型的数组
	 * @return void 打印数组arr中只出现一次的数字及个数
	 */
	public static void count(int[] arr) {
		int count = 0;//记录只出现一次的数字的个数
		//遍历数组
		for(int i = 0;i<arr.length;i++) {
			if(count(arr,arr[i])==1) {//如果数组中当前元素在数组中出现的次数等于1
				if(count==0){//说明出现了第一个出现一次的数字，要打印以下提示信息，以后再出现不用打印了
					System.out.print("数组："+Arrays.toString(arr)+"中，只出现一次的数字包括：");	
				}
				System.out.print(arr[i]+" ");//打印该元素
				count++;//计数器+1
			}
		}
		System.out.println();
		System.out.println("数组："+Arrays.toString(arr)+" 中只出现一次的数字的数量为："+count+" 个");
	}
}
