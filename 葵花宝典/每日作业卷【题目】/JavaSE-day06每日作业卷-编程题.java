import java.util.Random;
import java.util.Scanner;

public class DH {
    public static void main(String[] args) {
        /*
            随机产生5个范围是[1,100]的整数,把这些数字中所有个位或十位为3的数字打印出来
         */
        Random r = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = r.nextInt(100) + 1;
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 3 || arr[i] / 10 == 3) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("-------------------------------------");

        int result = five() > senven() ? five() - senven() : senven() - five();
        System.out.println(result);
        System.out.println("-------------------------------------");

        int[] arr1 = {3, 5, 6, 7, 8, 12, 34, 7, 9};
        System.out.println("7在数组中出现的次数是：" + sum(7, arr1));
        System.out.println("-------------------------------------");

        System.out.print("7在数组中的出现的位置是：");
        m1(7, arr1);
        System.out.println("\n" + "-------------------------------------");


        int[] arr2 = m2(20, 5);
        System.out.println("20 和 5 相加、减、乘、除的结果是：");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "    ");
        }
        System.out.println("\n" + "-------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入10个整数：");
        int[] arr3 = new int[10];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = sc.nextInt();
        }
       System.out.println("原数组是：");
        m4(arr3);
        System.out.println("\n" + "排序之后的数组是：");
        m4(m3(arr3));
        System.out.println("\n" + "-------------------------------------");

        System.out.println("数组中只出现一次的元素有：");
        m5(arr3);
        System.out.println("\n" + "-------------------------------------");

    }

    /*
        计算出5位数的回文数和7位数的回文数相差了多少个?
        回文数是一种数字如：98789倒读也为98789正读倒读都一样这种数字就叫回文数
     */
    public static int five() {
        int count = 0;
        for (int i = 10000; i <= 99999; i++) {
            if (i / 10000 == i % 10 && i / 1000 % 10 == i / 10 % 10) {
                count++;
            }
        }
        return count;
    }

    public static int senven() {
        int count = 0; // 9876789
        for (int i = 1000000; i <= 9999999; i++) {
            if (i / 1000000 == i % 10 && i / 100000 % 10 == i / 10 % 10 && i / 100000 == i / 100 % 10) {
                count++;
            }
        }
        return count;
    }

    /*
        定义一个方法,求出给定的数字在给定int型数组中出现的次数,如果一次没有出现则返回0.
     */
    public static int sum(int key, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        return count;
    }

    /*
        定义一个方法，查找指定数字在数组中出现的位置(若出现多次，多次打印)
     */
    public static void m1(int n, int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n){
                count++;
                System.out.print(i + "   ");
            }
        }
        if (count == 0){
            System.out.println("数组中没有这个数字");
        }
    }

    /*
        定义一个方法,实现同时求出两个整数的加、减、乘、除的结果
        并同时把这个四个结果返回(把四个数放入到一个数组中并返回)
     */
    public static int[] m2(int a, int b){
        int[] arr = new int[4];
        arr[0] = a + b;
        arr[1] = a - b;
        arr[2] = a * b;
        arr[3] = a / b;
        return arr;
    }

    /*
        定义一个方法将奇数放在数组的左侧,偶数放在数组的右侧
     */
    public static void m3(int[] arr){
        int[] newArr = new int[10];
        int m = 0, n = 9;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                newArr[m] = arr[i];
                m++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newArr[m] = arr[i];
                m++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

     /*
        定义一个方法打印原数组和处理后的数组
     */
    public static void m4(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    /*
        定义一个方法传入一个int类型数组，输出这个数组中只出现一次的数字及个数
     */
    public static void m5(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int count1 = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count1++;
                }
            }
            if (count1 == 1) {
                System.out.print(arr[i] + " ");
                count += 1;
            }
        }
        System.out.println("\n" + "数组中只出现一次的数字有" + count + "个");
    }
}
