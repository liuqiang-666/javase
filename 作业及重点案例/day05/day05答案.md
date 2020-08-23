# 选择题

1. B
2. C
3. C
4. D
5. B
6. B



# 编程题

1.

```java
public class Demo1 {
    public static void main(String[] args) {
        //调用方法
        double min = getMin(3.14, 4.13);
        //打印结果
        System.out.println("较小值是" + min);
    }

    //定义求较小值的方法
    public static double getMin(double a ,double b){
        //对两个小数进行判断
        if(a < b){
            return a;
        }else{
            return b;
        }
    }
}
```

2.

```java
public class Demo2 {
    public static void main(String[] args) {
        //调用方法传入参数
        int max = getMax(33, 44, 11);
        //打印最大值
        System.out.println("最大值是" + max);


    }
    //定义获取最大值的方法
    public static int getMax(int a ,int b ,int c){
        //判断出最大值并返回
        if(a > b && a > c){
            return a;
        }else if(b > a && b > c){
            return b;
        }else{
            return c;
        }
    }
}
```

3.

```java
public class Demo3 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //输入行数
        System.out.println("请输入行数：");
        int n = sc.nextInt();
        //输入列数
        System.out.println("请输入列数：");
        int m = sc.nextInt();
        //调用方法
        print(n,m);
    }
    //定义打印的方法
    public static void print(int n, int m){
        //循环输入n行
        for (int i = 0; i < n; i++) {
            //循环输出m列
            for (int j = 0; j < m; j++) {
                System.out.print("@");
            }
            //每一行的最后输出换行符
            System.out.println();
        }
    }
}
```

4.

```java
public class Demo4 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //分别输入三个整数
        System.out.println("请输入第一个整数:");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数:");
        int c = sc.nextInt();
        //调用方法
        method(a,b,c);
    }

    //定义方法
    public static void method(int a, int b, int c) {
        //定义变量存储最大值
        int max = 0;
        //定义变量存储最小值
        int min = 0;
        //判断最大值
        if(a > b && a > c ){
            max = a;
        }else if(b > a && b > c){
            max = b;
        }else{
            max = c;
        }
        //判断最小值
        if(a < b && a < c ){
            min = a;
        }else if(b < a && b < c){
            min = b;
        }else{
            min = c;
        }
        //计算中间值
        int mid = a + b + c - max - min;
        //按照从大到小的顺序输出
        System.out.println("从大到小的顺序是：" + max + " "+ mid + " " + min);
    }
}
```

5.

```java
public class Demo6 {
    public static void main(String[] args) {
        double num = -3.14;
        //调用方法
        double abs = abs(num);
        //打印结果
        System.out.println(num +"的绝对值是" + abs);
    }
    //定义绝对值方法
    public static double abs(double num){
        if(num < 0){
            //如果数字是负数则取反
            return -num;
        }else{
            //如果是非负数则返回本身
            return num;
        }
    }
}
```

