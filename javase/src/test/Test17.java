package test;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
//		
//	    1.提示用户录入一个字符串，要求字符串中必须存在字母（可以定义方法）
//	    2.不符合要求：提示录入有误！重新录入
//	    3.符合要求：判断字符串中大写字母出现次数并打印（可以定义方法）
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("请输入一段字符串：");
			String s=sc.nextLine();
			char[]  arr=s.toCharArray();
			boolean a=judge(s);
			if (a==true) {
				int b=dealstr(arr);
				System.out.println("您的字符串大写字母有"+b+"个");
				
			}else {				
				System.out.println("您的字符串没有字母");
			}
		}
	}

	private static boolean judge(String s) {
		// TODO Auto-generated method stub
		
		return s.matches(".*[a-zA-z].*");
	}

	private static int dealstr(char[] arr) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>='A' && arr[i]<='Z') {
				count++;
			}
		}
		
		return count;
	}

}
