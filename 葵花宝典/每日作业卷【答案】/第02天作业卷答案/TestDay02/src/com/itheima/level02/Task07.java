package com.itheima.level02;

/*
 * 看程序说结果，请不要提前运行？
 */
public class Task07 {
	public static void main(String[] args) {
		short s = 30;
		int i = 50;
		//s+=i 相当于s = (short)( s+i) = 80
		s += i;
		System.out.println("s="+s);//s = 80
		int x = 0;
		int y = 0;
		int z = 0;
		boolean a,b;
		//x>0 -> 0>0 false
		//& 不管左侧的值是什么，都要进行右侧的计算
		//y++表达式的值是0，然后要进行+1编程1，0>1 false 
		//最终a = false,x=0,y=1
		a = x>0 & y++>1;
		System.out.println("a="+a);
		System.out.println("y="+y);
		//x>0 -> 0>0 false
		//&&为短路与，左边为false，不计算右侧
		//最终结果： b = false ,z=0 
		b = x>0 && z++>1;
		System.out.println("b="+b);
		System.out.println("z="+z);
		//x>0 -> 0>0 false
		//| 不管左侧的值是什么，都要进行右侧的计算
		//y++>1  先计算y++的值，因++在后面先试用y的值作为y++表达式的值（1），然后y执行+1运算，变成2，但不管y变成几，都不会影响前面已经计算出来的y++表达式的值
		//y++>1 -> 1>1 false
		//最终a=false,x=0,y = 2
		a = x>0 | y++>1;
		System.out.println("a="+a);
		System.out.println("y="+y);
		//x>0 -> 0>0 false
		//|| 只有左侧为true时，不计算右侧，但此时左侧为false，仍然需要计算右侧
		//z++>1 ,先计算z++的值，因++在后面先使用z的值作为z++表达式的值（0），然后z执行+1运算，变成1，但不管z变成几，都不会影响前面已经计算出来的z++表达式的值
		//z++>1 -> 0>1 false
		//最终： b=false,x = 0,z=1
		b = x>0 || z++>1; 
		System.out.println("b="+b);
		System.out.println("z="+z);			
	}
}

