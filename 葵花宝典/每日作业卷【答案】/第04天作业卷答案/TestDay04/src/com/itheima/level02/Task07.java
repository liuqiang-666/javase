package com.itheima.level02;

/*
 * ������˵������벻Ҫ��ǰ���У�
 */
public class Task07 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {5,6,7};
		int[] temp = arr1;//temp��arr1ָ�����ͬһ������{1,2,3,4,5}
		
		System.out.println("ͨ��tempȡ��arr1�е�Ԫ��: ");
		
		for(int i = 0;i<temp.length;i++) {
			//ͨ��temp��ӡ����Ԫ�أ����ս��1 2 3 4 5
			System.out.print(temp[i]+" ");
		}
		
		temp = arr2;//temp��arr2ָ��ͬһ������{5,6,7}����ʱtemp����ָ��{1,2,3,4,5}
		System.out.println();
		System.out.println("ͨ��tempȡ��arr2�е�Ԫ��: ");
		
		for(int i = 0;i<temp.length;i++) {
			//ͨ��temp��ӡ����Ԫ�أ����ս��5 6 7
			System.out.print(temp[i]+" ");
		}
			
	}
}
