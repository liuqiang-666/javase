package test;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[6];
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第"+(i+1)+"评委打分：");
			int a=sc.nextInt();
			if(a>100 || a<0) {
				System.out.println("您的分数有误！");
				i--;
			}else {
				arr[i]=a;
			}
		}
		int max=arr[0];
		int min=arr[0];
		int sum=0;
		for (int i = 1; i < arr.length; i++) {
			sum+=arr[i];
			if(arr[i]>max) {
				max=arr[i];
			} 
			if(arr[i]<min){
				min=arr[i];                            
			}
		}
		System.out.println("最高分"+max);
		System.out.println("最低分"+min);
		System.out.println("得分"+(sum));
		System.out.println("平均分"+((sum+arr[0]-max-min)/4.0));
	}

}
