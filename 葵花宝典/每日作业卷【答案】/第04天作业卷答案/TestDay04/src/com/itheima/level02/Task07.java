package com.itheima.level02;

/*
 * 看程序说结果，请不要提前运行？
 */
public class Task07 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {5,6,7};
		int[] temp = arr1;//temp和arr1指向的是同一个数组{1,2,3,4,5}
		
		System.out.println("通过temp取出arr1中的元素: ");
		
		for(int i = 0;i<temp.length;i++) {
			//通过temp打印数组元素，最终结果1 2 3 4 5
			System.out.print(temp[i]+" ");
		}
		
		temp = arr2;//temp和arr2指向同一个数组{5,6,7}，此时temp不再指向{1,2,3,4,5}
		System.out.println();
		System.out.println("通过temp取出arr2中的元素: ");
		
		for(int i = 0;i<temp.length;i++) {
			//通过temp打印数组元素，最终结果5 6 7
			System.out.print(temp[i]+" ");
		}
			
	}
}
