### 一、选择题

~~~
1.D
2.C
3.C
4.B
5.D
6.B
~~~



### 二、编程题

~~~JAVA
1.
public class Demo1 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {11,22,33,44,55};
        //2.对数组遍历
        for (int i = 0; i < arr.length; i++) {
            //3.打印每一个元素
            System.out.print(arr[i] + " ");
        }
    }
}
~~~

~~~JAVA
2.
public class Demo2 {
    public static void main(String[] args) {
        //1.定义数组
        double[] arr = {12.9,53.54,75.0,99.1,3.14};
        //2.定义变量代表最小值
        double min = arr[0];
        //3.对数组遍历
        for (int i = 1; i < arr.length; i++) {
            //4.判断
            if(arr[i] < min){
                min = arr[i];
            }
        }
        //4.打印最小值
        System.out.println("最小值是" + min);
    }
}
~~~

~~~JAVA
3.
public class Demo3 {
    public static void main(String[] args) throws IOException {
        //1.创建随机数对象
        Random r = new Random();
        //2.定义长度为6的数组
        int[] arr = new int[6];
        //3.循环给数组赋值
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(101);
            arr[i] = num;
        }
        //4.定义求和变量
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //5.打印结果
        System.out.println("和是" + sum);
    }
}
~~~



~~~JAVA
4.
public class Demo5 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {72,89,65,87,91,82,71,93,76,68};
        //2.定义变量存储累加和
        double sum = 0;
        //3.遍历数组
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //4.通过和求出平均数
        double avg = sum / arr.length;
        //5.打印平均数
        System.out.println("平均值是" + avg);
    }
}
~~~

~~~JAVA
5.
public class Demo7 {
    public static void main(String[] args) {
        //1.定义数组
        double[] arr = {10.4,-3,-6.2,1.2,-6.1,-19,-3.8,0.9,-4.5,5.5};
        //2.定义统计赚钱个数的变量
        int count1 = 0;
        //3.定义统计赔钱个数的变量
        int count2 = 0;
        //4.遍历数组
        for (int i = 0; i < arr.length; i++) {
            //4.1判断股票是赔钱还是赚钱
            if(arr[i] > 0){
                count1++;
            }else{
                count2++;
            }
        }
        //5.打印结果
        System.out.println("赚钱的股票共：" + count1 + "只");
        System.out.println("赔钱的股票共：" + count2 + "只");
    }
}
~~~

~~~JAVA
6.
public class Demo8 {
    public static void main(String[] args) {
        //1.定义原数组
        int[] arr = {12,23,34,45,67,78,11,22};
        //2.定义空数组
        int[] brr = new int[arr.length];
        //3.定义变量代表奇数要存放的位置
        int left = 0;
        //4.定义变量代表偶数要存放的位置
        int right = arr.length-1;
        //5.对原数组进行遍历
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1){
                //5.1如果是奇数就往左边放
                brr[left] = arr[i];
                //5.2存放之后让索引向右移动
                left++;
            }else{
                //5.3如果是偶数就往右边放
                brr[right] = arr[i];
                //5.4存放之后让索引向左移动
                right--;
            }
        }
        //6.打印brr数组
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}
~~~

