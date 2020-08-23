# 选择题

1.D

2.C

3.A



# 编程题

1.

```java
猫类：
public class Cat {
    private String color;
    private String breed;
    public Cat(){}
    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void eat(){
        System.out.println(color+"的"+breed+"正在吃鱼.....");
    }
    public void catchMouse(){
        System.out.println(color + "的"+ breed +"正在逮老鼠....");
    }
}
狗类：
public class Dog {
	private String color;
    private String breed;
    public Dog(){}
    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void eat(){
        System.out.println(color + "的"+ breed +"正在啃骨头.....");
    }
    public void lookhome(){
        System.out.println(color + "的"+ breed +"正在看家.....");
    }
}
测试类：
public class Demo4 {
    public static void main(String[] args) {
        //创建猫对象
        Cat c = new Cat("花色","波斯猫");
        //调用猫的方法
        c.eat();
        c.catchMouse();
        //创建狗对象
        Dog d = new Dog("黑色","藏獒");
        d.eat();
        d.lookhome();
    }
}
```



2.

```java
public class Clock {
    int hour, minute, second;


    public Clock() {
    }

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}

//测试类
public class Test {
    public static void main(String[] args)  {

        Clock clock1 = new Clock();
        clock1.setHour(1);
        clock1.setMinute(1);
        clock1.setSecond(1);
        System.out.println(clock1.getHour()+"时"+clock1.getMinute()+"分"+clock1.getSecond()+"秒");
        System.out.println("------------------------------------------------------------");

        Clock clock2 = new Clock(2,2,2);
        System.out.println(clock2.getHour()+"时"+clock2.getMinute()+"分"+clock2.getSecond()+"秒");
    }
}
```



