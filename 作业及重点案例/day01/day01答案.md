### 一、选择题

~~~java
1.D
2.D
3.B
4.B
5.B
6.C
7.B
8.C
9.C
10.C
~~~

### 二、简答及编程题

~~~java
1.Java程序并非是直接运行的，Java编译器将Java源程序编译成与平台无关的字节码文件(class文件)，然后由Java虚拟机（JVM）对字节码文件解释执行。所以在不同的操作系统下，只需安装不同的Java虚拟机即可实现java程序的跨平台。
~~~

~~~java
2.Java程序开发运行流程：编写程序，编译程序，运行程序
~~~

~~~java
3.public class Test01 {
    public static void main(String[] args) {
        System.out.println("java是一门跨平台的计算机语言");
        System.out.println("被称为一次编写，处处运行");
    }
}
~~~

~~~java
4./*
	常量：
		在程序运行过程中，其值不可以发生改变的量。

	常量分类：
		字符串常量：		用双引号括起来的内容。"HelloWorld","黑马程序员"
		整数常量：		不带小数的数字。666,-88
		小数常量：		带小数的数字。13.14,-5.21
		字符常量：		用单引号括起来的内容。'A','0','我'
		布尔常量：		布尔值，表示真假。true,false
		空常量：		一个特殊的值，空值。null
*/
public class Test02 {
	public static void main(String[] args) {
		//字符串常量
		System.out.println("HelloWorld");
		System.out.println("黑马程序员");
		System.out.println("");//字符创长度是任意的
		System.out.println("--------");
		
		
		//整数常量
		System.out.println(666);
		System.out.println(-88);
		System.out.println("--------");
		
		//小数常量
		System.out.println(13.14);
		System.out.println(-5.21);
		System.out.println("--------");
		
		//字符常量
		System.out.println('A'); 
		System.out.println('0');
		System.out.println('我');
		System.out.println(' ');//字符单引号里边要么是一个字符要么是多个字符
		System.out.println("--------");
		
		//布尔常量
		System.out.println(true);
		System.out.println(false);
		System.out.println("--------");
		
		//空常量
		//空常量是不能直接输出的
		//System.out.println(null);
	}
}
~~~

~~~java
5.public class Test03 {
    public static void main(String[] args) {
        System.out.println("科比"); // 输出字符串常量，姓名
        System.out.println('男'); // 输出字符常量，性别
        System.out.println(41); // 输出整数常量，年龄
        System.out.println(1.98); // 输出小数常量，身高
        System.out.println(true); // 输出布尔常量，婚否
    }
}
~~~

