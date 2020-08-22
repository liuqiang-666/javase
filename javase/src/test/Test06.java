package test;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1988; i <= 2019; i++) {
			if((i%4==0 && i%100!=0) || i%400==0) {
				System.out.println(i);
			}
		}
	}

}
