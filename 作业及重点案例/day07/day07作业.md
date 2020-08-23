# 选择题

**1.关于private关键字，下列哪些选项的描述是错误的？（D）**

A:  被private修饰的成员变量，不能在其他类中直接访问。  

B:  private关键字，可以体现面向对象的封装特性。  

C:  如果一个成员变量被private修饰符修饰，如果在其他的类中要访问这个变量，那么在定义这个变量的类中，需要提供对应的setter/getter方法。

D:  成员方法不能被private修饰符修饰。 

**2.下列代码的运行结果是（ a）**

```java
public class Person{

       private String name;
       private int age;
       public void setAge(int age){
              this.age = age;          //请重点关注
       }

       public int getAge(){
              return age;                //请重点关注
       }

       public void setName(String name){
              name = name;          //请重点关注
       }

       public String getName(){
              return name;             //请重点关注
       }

       public void show(){
              System.out.println(age + "::"+ name);
       }
}

public class Test{

       public static void main(String[] args){
              Person p = new Person();
              p.setAge(10);
              p.setName("播仔");
              p.show();

       }

}

```



A:  10::播仔

B:  0::播仔

C:  10::null

D:  null::null



**3.下列描述正确的是（a ）**

A:  构造方法名必须和类名一致。

B:  同一个类的多个构造方法，不能构成方法重载。  

C:  构造方法的返回值类型必须是void。

D:  定义一个类，如果没有定义构造方法，那么这个类没有构造方法。



# 编程题

**第一题**

1.定义猫类Cat。属性:毛的颜色color，品种breed。行为:吃饭eat()，抓老鼠catchMouse()
2.定义狗类Dog。属性:毛的颜色color，品种breed。行为:吃饭eat()，看家lookHome()
要求:
	1.按照以上要求定义Cat类和Dog类,属性要私有,生成空参、有参构造，set和get方法
	2.定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)
	3.调用成员方法,打印格式如下:

```
花色的波斯猫正在吃鱼.....
花色的波斯猫正在逮老鼠....
黑色的藏獒正在啃骨头.....
黑色的藏獒正在看家.....
```

~~~java
package com.itheima.demo.homework;

import java.security.PrivateKey;

 class Cat {
    private String color;
    private String bread;

    public Cat () {
    }

    public Cat (String color, String bread) {
        this.color = color;
        this.bread = bread;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }
    public void eat(){
        System.out.println(color+"的"+bread+"正在吃鱼。。。。。。");
    }
    public void catchMouse(){
        System.out.println(color+"的"+bread+"正在抓老鼠。。。。。");
    }
}

class  Dog{
    private String color;
    private String bread;

    public Dog() {
    }

    public Dog(String color, String bread) {
        this.color = color;
        this.bread = bread;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }
    public void eat(){
        System.out.println(color+"的"+bread+"吃饭。。。。。");
    }
    public void lookHome(){
        System.out.println(color+"的"+bread+"看家。。。。。");
    }
}


package com.itheima.demo.homework;

public class Test {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.setColor("花色");
        cat.setBread("波斯猫");
        cat.eat();
        cat.catchMouse();
        Dog dog=new Dog();
        dog.setColor("黑色");
        dog.setBread("藏獒");
        dog.eat();
        dog.lookHome();


    }
}


~~~



**第二题**

​	1.定义一个时钟(Clock)类，描述三个属性 时、分秒：
​		提供空参构造；
​		提供带参构造；
​		提供setter/getter方法；
​	2.在测试类中创建Clock对象，设置时分秒，并测试

~~~java
package com.itheima.demo.homework;

public class Clock {
    private int hour;
    private int mintinue;
    private int mis;

    public Clock() {
    }

    public Clock(int hour, int mintinue, int mis) {
        this.hour = hour;
        this.mintinue = mintinue;
        this.mis = mis;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMintinue() {
        return mintinue;
    }

    public void setMintinue(int mintinue) {
        this.mintinue = mintinue;
    }

    public int getMis() {
        return mis;
    }

    public void setMis(int mis) {
        this.mis = mis;
    }
    public void show(){
        System.out.println("当前是"+hour+"时"
                +mintinue+"分"+mis+"秒");
    }
}


package com.itheima.demo.homework;

public class Testclock {
    public static void main(String[] args) {
        Clock clock=new Clock(15,25,40);
        clock.show();

    }
}
~~~

