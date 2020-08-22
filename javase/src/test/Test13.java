package test;

import java.util.Random;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int[] arr=new int[8];
		System.out.println("随机数组");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=r.nextInt(100)+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		int avg=getavg(arr);
		System.out.println("平均值为 "+avg);
		int a=getleavg(avg,arr);
		System.out.println("小于"+avg+"的值元素有 "+a);
	}
	
	private static int getleavg(int a,int[] arr) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<a) {
				count++;
			}
		}
		return count;
	}

	private static int getavg(int[] arr) {
		// TODO Auto-generated method stub
		int j = 0;
		for (int i = 0; i < arr.length; i++) {	
				j+=arr[i];
		}
		j=j/8;
		return j;
	}

}
