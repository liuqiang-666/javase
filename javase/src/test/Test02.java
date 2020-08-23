package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("@@欢迎来到黑马计算器@@");
		System.out.println("@@欢迎来到黑马计算器@@");
		System.out.println("请选择你的选择【1 加法 2 减法 3 乘法 4取余 5 退出 】");
		Scanner sc =new Scanner(System.in );
		int k =sc.nextInt();
		System.out.println("请输入第一个数：");
		int a=sc.nextInt();
		System.out.println("请输入第一个数：");
		int b =sc.nextInt();
		switch (k) {
			case 1:
				System.out.println("用户选择加法："+(a+b));
				break;
			case 2:
				System.out.println("用户选择减法："+(a-b));
				break;
			case 3:
				System.out.println("用户选择乘法："+(a*b));
				break;
			case 4:
				System.out.println("用户选择除法："+(a/b));
				break;				
			case 5:
				System.out.println("用户选择取余："+(a%b));
				break;
			default:
				System.out.println("您的输入有误！");
				break;
				
		}
	}

}
