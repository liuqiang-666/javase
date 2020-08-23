package com.itheima.level02;

/*
 * 看程序说结果，请不要提前运行？
 */

public class Task06 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] temp1 = arr1;//temp1和arr1指向的是同一个数组
		int[] temp2 = arr1;//temp2和arr1指向的是同一个数组
		//通过以上操作arr1，temp1，temp2指向的是同一个数组
		System.out.println("通过temp1取出数组值: ");
		
		for(int i = 0;i<temp1.length;i++) {
			//通过temp1打印数组元素，最终结果1 2 3 4 5
			System.out.print(temp1[i]+" ");
		}
		System.out.println();
		System.out.println("通过temp2取出数组值: ");
		for(int i = 0;i<temp2.length;i++) {
			//通过temp2打印数组元素，最终结果1 2 3 4 5
			System.out.print(temp2[i]+" ");
		}
		System.out.println();
		//通过temp1将其指向的索引为2的元素变为9，即数组的元素值{1,2,9,4,5}
		temp1[2] = 9;
		
		System.out.println("通过temp1取出数组值: ");
		for(int i = 0;i<temp1.length;i++) {
			//通过temp1打印数组元素，最终结果1 2 9 4 5
			System.out.print(temp1[i]+" ");
		}
		System.out.println();
		System.out.println("通过temp2取出数组值: ");
		for(int i = 0;i<temp2.length;i++) {
			//通过temp2打印数组元素，最终结果1 2 9 4 5
			System.out.print(temp2[i]+" ");
		}
		System.out.println();
		
	}
}
