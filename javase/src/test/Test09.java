package test;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={19,28,37,46,50};
		int a=fetindex(arr);
		if(a==-1) {
			System.out.println("数组没有这个数");
		}else {
			System.out.println("数组有这个数,这个数的索引是："+a); 
		}
	}

	private static int fetindex(int[] arr) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int index=-1;
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==a) {
				index=i;
				
			}
			
		}
		return index;
	}

}
