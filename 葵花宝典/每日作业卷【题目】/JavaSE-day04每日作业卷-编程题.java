package dailyhomework;

import java.util.Random;
import java.util.Scanner;

public class DH04 {
    public static void main(String[] args) {

        /*
            定义一个含有五个元素的数组,并为每个元素赋值,求数组中所有元素的最小值
         */
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 32;
        arr[2] = 21;
        arr[3] = 34;
        arr[4] = 8;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        System.out.println("数组最小值是：" + arr[arr.length - 1]);
        System.out.println("------------------------------");

        /*
            定义一个长度为3的一维数组,给每个元素赋值.
            (要求数组中每个元素的值是0-9的随机数)
            遍历数组打印每个元素的值
         */
        Random r = new Random();
        int[] arr1 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = r.nextInt(10);
            System.out.println(arr1[i]);
        }
        System.out.println("------------------------------");

        /*
            已知数组int[] nums = {5,10,15},,要求创建一个新数组
            1.新数组的长度和已知数组相同
            2.新数组每个元素的值 是已知数组对应位置元素的2倍
            3.在控制台中打印新数组的所有元素
         */
        int[] nums = {5, 10, 15};
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i] * 2;
            System.out.println(newNums[i]);
        }
        System.out.println("------------------------------");

        /*
            键盘录入一个整数，创建一个该长度的数组，为每一个元素赋值为1-10的随机整数，最后打印数组中所有值大于5且为偶数的元素.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数，代表数组长度：");
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.println("生成的数组是：");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = r.nextInt(10) + 1;
            System.out.print(arr2[i] + "   ");
        }
        System.out.println();
        int count = 0;
        System.out.println("数组中所有值大于5且为偶数的元素是：");
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0 && arr2[i] > 5) {
                count++;
                System.out.print(arr2[i] + "    ");
            }
        }
        if (count == 0) {
            System.out.print("无");
        }
        System.out.println();
        System.out.println("------------------------------");

        /*
            将数字1-10保存到一个长度为10的一维数组中
            定义一个新数组,长度为3,取出原来数组中随机三个元素(不考虑是否重复)
            给新数组的元素赋值
            求新数组所有元素的和
         */
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr4 = new int[3];
        for (int i = 0; i < 3; i++) {
            arr4[i] = arr3[r.nextInt(3)];
            System.out.println(arr4[i]);
        }
        int sum = 0;
        for (int i = 0; i < arr4.length; i++) {
            sum += arr4[i];
        }
        System.out.println("新数组所有元素的和是：" + sum);
        System.out.println("------------------------------");

        /*
            分析以下需求，并用代码实现
            1.键盘录入班级人数
            2.根据录入的班级人数创建数组
            3.利用随机数产生0-100的成绩(包含0和100)
            4.要求:
                (1)打印该班级的不及格人数
                (2)打印该班级的平均分
                (3)演示格式如下:
                    请输入班级人数:
                    键盘录入:100
                    控制台输出:
                        不及格人数:19
                        班级平均分:87
         */
        System.out.print("请输入班级人数：");
        int stu = sc.nextInt();
        int[] arr5 = new int[stu];
        int count1 = 0;
        double sum1 = 0;
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = r.nextInt(101);
            if (arr5[i] < 60) {
                count1++;
            }
            sum1 += arr5[i];
        }
        System.out.println("不及格人数：" + count1);
        System.out.println("班级平均分：" + (sum1 / stu));
        System.out.println("------------------------------");

        /*
            从键盘上输入10个整数，合法值为1、2或3，不是这3个数则为非法数字。
            试编程统计每个整数和非法数字的个数。
         */
        System.out.println("请输入10个整数：");
        int[] arr6 = new int[10];
        for (int i = 0; i < 10; i++) {
            arr6[i] = sc.nextInt();
        }
        int one = 0, two = 0, three = 0;
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] == 1) {
                one++;
            } else if (arr6[i] == 2) {
                two++;
            } else if (arr6[i] == 3) {
                three++;
            }
        }
        System.out.println("数字1的个数是：" + one);
        System.out.println("数字2的个数是：" + two);
        System.out.println("数字3的个数是：" + three);
        System.out.println("非法数字的个数是：" + (10 - one - two - three));
        System.out.println("------------------------------");

        /*
           假设有一个长度为5的数组，数组元素通过键盘录入，如下所示：
            int[] arr = {1,3,-1,5,-2}
            要求：
            创建一个新数组newArr[],新数组中元素的存放顺序与原数组中的元素逆序，
            并且如果原数组中的元素值小于0，
            在新数组中按0存储。最后输出原数组和新数组中的内容
         */
        System.out.println("请输入5个整数：");
        int[] arr7 = new int[5];
        for (int i = 0; i < 5; i++) {
            arr7[i] = sc.nextInt();
        }
        System.out.println("原数组内容：");
        int[] newArr7 = new int[arr7.length];
        for (int i = 0; i < arr7.length; i++) {
            System.out.print(arr7[i] + "  ");
            if (arr7[i] >= 0) {
                newArr7[newArr7.length-(i+1)] = arr7[i];
            }else
                newArr7[newArr7.length-(i+1)] = 0;
        }
        System.out.println();
        System.out.println("新数组内容：");
        for (int i = 0; i < newArr7.length; i++) {
            System.out.print(newArr7[i] + "   ");
        }
        System.out.println();
        System.out.println("------------------------------");
    	
        /*
			假设一个简单的在ATM的取款过程如下：首先提示用户输入密码（password），
			最多只能输入3次，超过3次则提示用户"密码错误，请取卡"交易结束。
			如果用户密码正确，再提示用户输入金额（amount），ATM只能输出100元的纸币，一次取钱数要求最低0元，最高1000元。
			如果用户输入的金额符合上述要求，则打印输出用户取的钱数，最后提示用户"交易完成，请取卡"，否则提示用户重新输入金额。假设用户密码是"111111"。

			打印格式：

			第一种情况：三次密码输入错误
			请输入密码：2
			密码错误，请重新输入：3
			密码错误，请重新输入：4
			密码错误，请取卡

			第二种情况：密码输入正确，可以取款
			请输入密码：2
			密码错误，请重新输入：111111
			请输入取款金额：3000
			您输入的取款金额有误，请重新输入：999
			请取走现金：999元
			交易完成，请取卡
        */
        boolean isError = false;
        System.out.print("请输入初始密码：");
        String password = sc.next();
        System.out.print("请输入密码：");
        for (int i = 0; i < 3; i++) {
            String input = sc.next();
            if (!password.equals(input)) {
                if (i < 2) {
                    System.out.print("密码错误，请重新输入:");
                } else
                    System.out.print("密码错误，请取卡");
            } else {
                isError = true;
                break;
            }
        }
        while (isError) {
            System.out.print("请输入取款金额：");
            int amount = sc.nextInt();
            if (amount > 0 && amount <= 1000 && amount % 100 == 0) {
                System.out.println("请取走现金:" + amount);
                System.out.println("交易完成，请取卡");
                break;
            } else {
                System.out.println("取款只能输出100的纸币，您输入有误，请重新输入：");
            }
        }
        System.out.println("------------------------------");
    }
}