package dailyhomework;

import java.util.Scanner;

public class DH02 {
    public static void main(String[] args) {
        /*
            键盘录入一个int类型的数据,使用三元运算符判断这个数是奇数还是偶数
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个int型的整数：");
        int num = sc.nextInt();
        String s = num % 2 == 0 ? "是偶数" : "是奇数";
        System.out.println(num + s);
        System.out.println("--------------------------------------------");

        /*
           键盘录入一个学生成绩(int类型)
           如果成绩大于等于60输出”及格”,如果成绩小于60输出”不及格”
         */
        System.out.print("请输入学生的成绩：");
        int n = sc.nextInt();
        String str = n >= 60 ? "及格" : "不及格";
        System.out.println(n + str);
        System.out.println("--------------------------------------------");

        /*
            键盘录入自己的姓名(String),年龄(int),身高(int)保存到对应的变量中
            输出结果如:我的姓名是张三,年龄25岁,身高180CM
            (提示姓名是String类型，需要使用Scanner的next()方法.)
         */
        System.out.print("请输入您的姓名：");
        String name = sc.next();
        System.out.print("请输入您的年龄：");
        int age = sc.nextInt();
        System.out.print("请输入您的身高：");
        int height = sc.nextInt();
        System.out.println("我的姓名是" + name + ",年龄" + age + "岁,身高" + height + "CM");
        System.out.println("--------------------------------------------");

        /*
            定义一个int类型的变量,初始化值为123,求这个数的个位,十位,百位分别是多少,输出结果:123的个位是3,十位是2,百位是1
         */
        int m = 123;
        int ones = m % 10;
        int tens = m / 10 % 10;
        int hundreds = m / 100;
        System.out.println(m + "的个位是" + ones + ",十位是" + tens + ",百位是" + hundreds);
        System.out.println("--------------------------------------------");

        /*
            键盘录入一个长方形的长和宽(长和宽为int类型),计算长方形的面积和周长
         */
        System.out.print("请输入长方形的长：");
        int length = sc.nextInt();
        System.out.print("请输入长方形的宽：");
        int width = sc.nextInt();
        int area = length * width;
        int perimeter = (length + width) * 2;
        System.out.println("长方形的面积是: " + area + ", 周长是: " + perimeter);
        System.out.println("--------------------------------------------");

        /*
            定义int类型的变量a,定义int类型的变量b,使用三元运算符判断如果a大于b返回a与b的和,否则返回a与b的乘积,打印结果
         */
        int a = 3, b = 4;
        int x = a > b ? a + b : a * b;
        System.out.println(x);
        System.out.println("--------------------------------------------");

        /*
            定义int类型的变量i,初始化值为5.再定义double类型的变量d ,初始化值为3.14.
            将变量i和变量d相加再赋值给另一个short类型的变量s.输出s的值.
         */
        int i = 5;
        double d = 3.14;
        short s2 = (short)(i + d);
        System.out.println(s2);
        System.out.println("--------------------------------------------");

        /*
            1.小明左、右手中分别拿两张纸牌（比如：黑桃10和红桃8，数字10和8可通过键盘录入），要求编写代码交换小明手中的牌
            2.程序运行的结果如下：

            请输入小明左手中的纸牌：10
            请输入小明右手中的纸牌：8

            互换前小明手中的纸牌：
            左手中的纸牌：10
            右手中的纸牌：8

            互换后小明手中的纸牌：
            左手中的纸牌：8
            右手中的纸牌：10
         */
        System.out.print("请输入小明左手纸牌：");
        int left = sc.nextInt();
        System.out.print("请输入小明右手纸牌：");
        int right = sc.nextInt();
        System.out.println("交换前，小明左手的牌是：" + left + ",右手中的牌是：" + right);
        int temp = left;
        left = right;
        right = temp;
        System.out.println("交换后，小明左手的牌是：" + left + ",右手中的牌是：" + right);
        System.out.println("--------------------------------------------");
    }
}
