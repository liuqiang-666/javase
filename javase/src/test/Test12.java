package test;

import java.util.Random;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int[] arr=new int[10];
		System.out.println("随机数组");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=r.nextInt(100)+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");

		System.out.println("最大值："+getmax(arr));
		System.out.println("最小值："+getmin(arr));
		System.out.println("平均值："+getavg(arr));
	}

	

	private static int getavg(int[] arr) {
		// TODO Auto-generated method stub
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>j) {
				j+=arr[i];
			}
		}
		j=j/arr.length;
		return j;
	}



	private static int getmin(int[] arr) {
		// TODO Auto-generated method stub
		int j = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<j) {
				j=arr[i];
			}
		}
		return j;
	}



	private static int getmax(int[] arr) {
		// TODO Auto-generated method stub
		int j = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>j) {
				j=arr[i];
			}
		}
		return j;
	}

}
