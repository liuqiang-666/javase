package test;

import java.util.Random;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		Random r =new Random();
		int a= r.nextInt(100)+1;
		Scanner sc =new Scanner(System.in);
		
		while (true) {
			System.out.println("请猜测;");
			int  c= sc.nextInt();
			if(a>c) {
				System.out.println("小了");
			}else if(a<c) {
				System.out.println("大了");
			}else {
				System.out.println("恭喜你！猜对了");
				break;
			}
		}

}
}
