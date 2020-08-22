package test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你的消费金额：");
		int a=sc.nextInt();
		if(a<=0) {
			System.out.println("您的输入有误！");
		}else {
			if(a<500) {
				System.out.println("不打折！消费金额是："+a);
			}else if(a>=500 && a<1000){
				System.out.println("您的消费金额是"+a+",折扣是9.5，您应该付"+a*0.95);
				
			}else if(a>=1000 && a<2000){
				System.out.println("您的消费金额是"+a+",折扣是8.0，您应该付"+a*0.8);
				
			}else {
				System.out.println("您的消费金额是"+a+",折扣是7.0，您应该付"+a*0.7);
			}
		}
	}

}
