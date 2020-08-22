package test;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int count=1;
		for (int i = 0; i <=1000; i++) {
			if(i%5==0 || i%10==5 || i/10%10==5 || i/10/10%10==5) {
				continue;
			}else {
				if(count%7==0) {
					System.out.println(" ");
					count=1;
				}else {
					System.out.print(i+" ");
					count+=1;
				}	
			}
		}
	}

}
