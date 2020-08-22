package test;

import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一段字符串：");
		String s=sc.nextLine();
		char[]  arr1=s.toCharArray();
		s=dealstr(s,arr1);
		System.out.println(s);
		

	}

	private static String dealstr(String s,char[] arr) {
		// TODO Auto-generated method stub
		String a="";
		String b="";
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<='9' && arr[i]>='0'){
				a+=arr[i];
			}else {
				b+=arr[i];
			}
		}
		a+=b;
		return a;
	}

}
