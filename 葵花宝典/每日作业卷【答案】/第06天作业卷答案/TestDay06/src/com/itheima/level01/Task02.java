package com.itheima.level01;
/*
 * 计算出5位数的回文数和7位数的回文数相差了多少个
 */
public class Task02 {
	public static void main(String[] args) {
		//1. 计算出5位数的回文数 有多少个
		int count5 = get5Count();
		//2. 计算出7位数的回文数 有多少个
		int count7 = get7Count();
		//3. 相差了多少个
		System.out.println("相差了多少个:" + (count7 - count5));
	}
	
	/*
	 * 计算出5位数的回文数 有多少个
	 * 指定方法的名称： get5Count
	 * 指定方法的参数： 无
	 * 指定方法的返回值： int
	 */
	public static int get5Count(){
		int count = 0;//记录5位数的回文数个数
		//12321
		for (int i = 10000; i <= 99999; i++) {
			//分别获取个十百千万位的数字
			int g = i % 10;
			int s = i / 10 %10;
			int b = i / 100 % 10;
			int q = i / 1000 % 10;
			int w = i / 10000 % 10;
			if (g==w && s==q) {
				//5位数的回文数 + 1
				count++;
			}
		}
		return count;
	}
	
	/*
	 * 计算出7位数的回文数 有多少个
	 * 指定方法的名称： get7Count
	 * 指定方法的参数： 无
	 * 指定方法的返回值： int
	 */
	public static int get7Count(){
		int count = 0;//记录7位数的回文数个数
		//1234321
		for (int i = 1000000; i <= 9999999; i++) {
			//分别获取个、十、百、千、万、十万、百万位的数字
			int g = i % 10;
			int s = i / 10 %10;
			int b = i / 100 % 10;
			int q = i / 1000 % 10;
			int w = i / 10000 % 10;
			int sw = i / 100000 % 10;
			int bw = i / 1000000 % 10;
			if (g==bw && s==sw && b==w) {
				//7位数的回文数 + 1
				count++;
			}
		}
		return count;
	}
}
