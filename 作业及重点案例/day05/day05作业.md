# 选择题

**1.下列描述正确的是（）**

A:  方法可以提升Java程序的执行效率，优化Java程序的运行过程。

B:  方法可以提高java代码的复用性，方法定义后，可以重复使用。

C:  程序员定义的方法，只能在main方法当中进行调用。

D:  在保证方法格式书写正确的情况下，方法当中也可以定义方法。



**2.以下选项中，方法的定义与使用正确的是()**

```java
A:

public class Demo{

    public static void main(String[] args){

    //调用

        show;

    }

  

    public static void show{

        System.out.println("正确定义方法");

    }

}

B:

public class Demo{

    public static void main(String[] args){

      //调用

        show();

        public static void show(){

            System.out.println("正确定义方法");

        }

    }

}

C:

public class Demo{

    public static void main(String[] args){

    //调用

        show();

    }

  

    public static void show(){

        System.out.println("正确定义方法");

    }

}

D:

public class Demo{

    public static void main(String[] args){

    //调用

        show();

    }

  

    public static  show(){

        System.out.println("正确定义方法");

    }

}      

```



**3.下面关于方法的参数和返回值描述，正确的是（ ）**

A:  方法的参数列表是在定义方法的时候，写在方法名称前面的内容

B:  方法可以不写返回值类型，直接留空

C:  方法的返回值必须写在 return 关键字的后面

D:  方法如果没有参数列表，可以省略小括号不写



**4.观察以下代码，请选出方法调用过程的正确顺序（ ）**

```java
public static void main(String[] args) {

    System.out.println("开始执行");       //1

    int a = print(10);                //2

    System.out.println(a);                 //3

}

public static int print(int n){      //4

    n += 10;                         //5

    return n;                              //6

}

```



A:  1，2，3，4，5，6

B:  1，2，4，6，5，3

C:  1，4，5，6，2，3

D:  1，2，4，5，6，3

 

**5.下列程序执行时，会引发报错的代码行是（ ）**

```java
public static void main(String[] args) {

       method1();                                       //第1行

    System.out.println( method2() );    //第2行

    double d = method3();               //第3行

    int num = method3();                      //第4行

}

public static void method1() {

       System.out.println("天天开心");

}

 

public static void method2() {

       System.out.println("代码so easy!");

}

 

public static int method3() {

       return 3*5;

}
```

A:  第1行

B:  第2行

C:  第3行

D:  第4行

 

**6.以下选项中，方法定义的注意事项描述不正确的是（ ）**

A:  方法定义的位置，在类中方法外      

B:  方法的参数的数据类型要和返回值类型一致，否则编译失败

C:  方法的返回值类型，必须要和return语句中返回值的数据类型匹配，否则编译失败

D:  不能在return后面写代码,return 意味着方法结束，所有后面的代码永远不会执行，属于无效代码

 

# 编程题

1.定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。

  

2.定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。



3.通过键盘录入两个整数n和m。n代表行数，m代表列数。定义一个方法，方法的功能是打印n行m列的@符号。执行效果如下：

```
请输入行数：
4
请输入列数：
5
@@@@@
@@@@@
@@@@@
@@@@@
```



4.在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。执行效果如下：

```
请输入第一个整数：10
请输入第二个整数：30
请输入第三个整数：20
从大到小的顺序是： 30 20 10 
```



5.数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试。



