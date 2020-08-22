package test;

import java.util.Random;
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		Random r=new Random();
		System.out.println("随机数组:");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=r.nextInt(61)+7;	
			System.out.print(arr[i]+" ");
		}
	System.out.println("");
		System.out.println("请输入一个【3-5】之间的整数:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%a==0) {
				System.out.println(arr[i]);
				}						
	}
}
}
