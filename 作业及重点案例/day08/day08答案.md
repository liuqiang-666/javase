# 选择器

1.B

2.C

3.C

4.D

5.C

6.C



# 编程题

**第一题**

```java
public class Worker {
    // 成员变量
    private String name;
    private int year;

    // 构造方法
    public Worker() {

    }
    public Worker(String name, int age) {
        this.name = name;
        this.year = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

import java.util.Scanner;
public class Test01 {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入工人姓名：");
        String name = sc.nextLine();
        System.out.println("请输入工人工龄：");
        int year = sc.nextInt();
        // 创建对象
        Worker w = new Worker(name, year);
        // 输出信息
        System.out.println("该工人对象的信息如下：");
        System.out.println("姓名：" + w.getName());
        System.out.println("工龄：" + w.getYear());
    }
}
```



**第二题**

```java
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        //键盘录入一个字符串，用 Scanner 实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        // 为方便统计，将字符串中的字母都转为小写
        line = line.toLowerCase();
        //要统计两种类型的字符个数，需定义两个统计变量，初始值都为0
        int letterCount = 0;
        int numberCount = 0;
        // 遍历字符串，得到每一个字符
        for(int i=0; i<line.length(); i++) {
            char ch = line.charAt(i);
            // 判断该字符属于哪种类型，然后对应类型的统计变量+1
            if (ch >= 'a' && ch <= 'z') {
                letterCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }
        //输出两种类型的字符个数
        System.out.println("英文字母：" + letterCount + "个");
        System.out.println("数字：" + numberCount + "个");
    }
}
```



**第三题**

```java
public class Test05 {
    public static void main(String[] args) {
        String str = "上海自来水来自海上";
        System.out.println(isSym(str));
    }

    public static boolean isSym(String str) {
        // 为了程序的健壮，如果传递的是空值，返回false
        if (str == null) {
            return false;
        }
        // 转换为StringBuilder
        StringBuilder sb = new StringBuilder(str);
        // 反转，再转成String
        String reStr = sb.reverse().toString();
        // 比较与原字符串是否相等
        // 相等返回true，不相等返回false，正好与equals的返回值一致，直接返回即可。
        return reStr.equals(str);
    }
}
```



**第四题**

```java
import java.util.Scanner;
public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号：");
        String id = sc.nextLine();
        System.out.println(check(id));
    }

    // 返回值boolean类型，表示是否符合规则。参数列表：需要判断的字符串
    public static boolean check(String id) {
        // 如果传递了空参数，返回false
        if (id == null) {
            return false;
        }
        // 如果是数字0开头，返回false
        if (id.startsWith("0")) {
            return false;
        }
        // 如果不是18位，返回false
        if (id.length() != 18) {
            return false;
        }
        // 遍历判断每一位
        for (int i = 0; i < id.length(); i++) {
            char ch = id.charAt(i);
            // 前17位都是数字,最后一位可以是数字或者大写字母X
            if (i == id.length() - 1) { // 最后一位
                if (ch < '0' || ch > '9' && ch != 'X') { // 不是数字或者X
                    return false;
                }
            } else { // 其他位
                if (ch < '0' || ch > '9') { // 不是数字
                    return false;
                }
            }
        }
        // 所有的规则都符合，返回true
        return true;
    }
}
```



**第五题**

```java
public class Test07 {
    public static void main(String[] args) {
        // 定义一个 int 类型的数组，用静态初始化完成数组元素的初始化
        int[] arr = {1, 2, 3};
        // 调用方法，输出结果
        System.out.println(arrayToString(arr));
    }

    /*定义一个方法，用于把 int 数组中的数据按照指定格式拼接成一个字符串返回
		返回值类型：String
		参数：int[] arr
     */
    public static String arrayToString(int[] arr) {
        // 健壮性判断
        if (arr == null) {
            return null;
        }
        //在方法中用 StringBuilder 按照要求进行拼接，并把结果转成 String 返回
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            // 拼接元素
            sb.append(arr[i]);
            // 如果不是最后一个元素，再拼接逗号和空格
            if (i != arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
```



