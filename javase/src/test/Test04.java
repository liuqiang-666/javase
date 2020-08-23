package test;

import java.util.Random;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r= new Random();
		int a=r.nextInt(91)+10;
		System.out.println("随机数："+a);
		System.out.println("随机数："+a);
		int count=0;
		for (int i = 10; i < a; i++) {
			if(i%2==1) {
				count+=1;
				System.out.println(i);
				
		}		
	}
		System.out.println("10到"+a+"的奇数有："+count);
}
}
