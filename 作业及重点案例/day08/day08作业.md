# 选择题

**1.下面是关于String类 API 当中与判断相关的方法，如果用于忽略大小写验证码的判断，最佳的方法是（B）**

A：

public boolean equals(Object anObject){  ... }

 

B：

public boolean equalsIgnoreCase(String anotherString){ ... }

 

C：

public boolean endsWith(String suffix){ ... }

 

D：

public boolean startsWith(String prefix){ ... }

**2.下列能够正确获取字符串对象长度的操作是（ C）**

A:size（）

B:lengtha

C:length（）

D:charAt()



**3.下列代码的运行结果是（c）**

```java
public static void main(String[] args) {

    String str = "ilovejavalovelife";

    int index = str.indexOf("love");

    String newStr = str.replace("love","miss");

    System.out.println("index的值是：" + index);

    System.out.println("newStr的值是：" + newStr);

}
```

A:  

index的值是：5

newStr的值是：imissjavamisslife 

 

B:  

index的值是：5

newStr的值是：imissjavalovelife

 

C:  

index的值是：1

newStr的值是：imissjavamisslife

 

D:  

index的值是：1

newStr的值是：imissjavalovelife



**4.下列代码片段的运行结果是（ d）**

```java
public static void main(String[] args) {

    String str1 = "chengxuyuan@heima";

    String str2 = "com-itcast-cn";

    String[] strs1 = str1.split("@");

    String[] strs2 = str2.split("-");

    System.out.println("strs1[1]结果是：" + strs1[1]);

    System.out.println("strs2[1]结果是：" + strs2[1]);

}
```

A:  

strs1[1]结果是：chengxuyuan

strs2[1]结果是：com 反馈

 

B:  

strs1[1]结果是：chengxuyuan

strs2[1]结果是：itcast

 

C:  

strs1[1]结果是：heima

报异常：ArrayIndexOutOfBoundsException

 

D:  

strs1[1]结果是：heima

strs2[1]结果是：itcast



**5.下列选项中,关于StringBuilder的说法正确的是(c)** 

A:  StringBuilder和String都是字符串类，所以它们所有方法都是相同的

B:  StringBuilder和String都是字符串类，它们所有的构造方法都是相同的

C:  可以通过构造方法public StringBuilder(String str)把一个String对象转为StringBuilder对象

D:  StringBuilder的对象可以使用字符串赋值，如：StringBuilder sb = "abc";



**6.请看代码,结果是(  c )** 

```java
StringBuilder sb = new StringBuilder(); 
sb.append("a"); 
sb.append("b"); 
sb.append("c"); 
System.out.println(sb.toString()); 
```



A:  cba

B:  ABC

C:  abc

D:  以上都不对



# 编程题

**第一题 **

现已知工人（Worker）类，属性包含姓名（name）、工龄（year），请编写该类，提供构造方法和get、set方法。在测试类中，请查看键盘录入Scanner类的API，创建工人类对象，属性值由键盘录入，打印对象的属性值。输出效果如下：

```java
请录入工人姓名：
张三
请录入工人工龄：
5
该工人对象的属性信息如下：
姓名：张三
工龄：5
```

~~~java
public class WorKer{
    private String name;
    private int year;

    public WorKer() {
    }

    public WorKer(String name, int year) {
        this.name = name;
        this.year = year;
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

    @Override
    public String toString() {
        return "WorKer [name=" + name + ", year=" + year + "]";
    }
    
    
    
}
~~~



~~~java
public class TestWorker{
    
}
~~~



**第二题**

请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。比如：Hello12345World中字母：10个，数字：5个。



**第三题**

请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。例如："abcba"、"上海自来水来自海上"均为对称字符串。



**第四题**

我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。



**第五题**

定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。

要求：

​	1、如果传递的参数为空，返回null

​	2、如果传递的数组元素个数为0，返回[]

​	3、如果数组为int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]

