package test;

public class Test14 {

	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55,66};
		arr=chageslocal(1, 5, arr);
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
	}

	private static int[] chageslocal(int b,int a,int[] arr) {
		// TODO Auto-generated method stub
		int tem=0;
		tem=arr[a];
		arr[a]=arr[b];
		arr[b]=tem;
		return arr;
	}



}
