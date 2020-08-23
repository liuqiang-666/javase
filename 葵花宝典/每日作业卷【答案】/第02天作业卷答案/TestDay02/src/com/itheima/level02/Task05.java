package com.itheima.level02;

/*
 * 看程序说结果，请不要提前运行？
 */
public class Task05 {
	public static void main(String[] args) {
		 int a = 10;
		 int b = 20;
		 /*
		  	x = a + b++;等价于a + (b++)
		  	是加法运算符进行了两个表达式的运算，运算顺序从左到右
		  	a=10，已经确定，只需要确定b++的值就可以计算最终的结果
		  	b++表达式的值，因++在后面，先使用b(20)的值作为b++表达式的值（20），再执行++操作，b变成21，但不管b的值是多少都不会影响b++表达式的值
		  	x = a + b++ = 10 + 20 = 30，a=10,b=21
		  */
		 int x = a + b++;
		 System.out.println("b=" + b);
		 System.out.println("x=" + x);
	}
}

