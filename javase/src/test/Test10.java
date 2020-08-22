package test;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("请输入起始值");
			int a=sc.nextInt();
			System.out.println("请输入结束值");
			int b=sc.nextInt();
			if(a>b) {
				System.out.println("错误");
				continue;
			}
			System.out.println(getsum(a,b));
		}
		
	}

	private static  int getsum(int a,int b) {
		// TODO Auto-generated method stub
		int sum=0;
		for(;a<=b;a++) {
			sum+=a;
		}
		return sum;
	}

}
