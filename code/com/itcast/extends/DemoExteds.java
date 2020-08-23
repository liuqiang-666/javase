import java.util.Random;
import java.util.Scanner;

import jdk.javadoc.internal.tool.Main;

public class DemoExteds {
    int name=123;
    int age=40;
    
    public void name() {
        System.out.println("方法执行");
        System.out.println("显示数据");
    }

    public DemoExteds() {
        System.out.println("我是父类");
    }
}

class es extends DemoExteds{
    int age=20;  //defult  //稍大
    public int c; //最大
    protected int as ; //次大
    private int d; //最小
    
    @Override
    public void name() {
        super.name(); //在子类重写中需要对原来的代码进行改进将父类的数据迁移过来
        int age=0; 
        System.out.println(this.age);  //访问子类的成员变量 
        System.out.println(age);  //子类的局部变量
        System.out.println(super.age); //父类的变量
    }

    public es() {
        super();
        System.out.println("我是子类构造");
    }

    public es(int age, int c, int as, int d) {
        this();
        this.age = age;
        this.c = c;
        this.as = as;
        this.d = d;
    }


}

class a{
    public static void main(String[] args) {
        DemoExteds demoExteds =new DemoExteds();
        // System.out.println(demoExteds.age); //父类用自己的
        es a= new es();
        System.out.println(a.name);
        a.name();

        // a.name1();
    }
}

// 6  6-66随机数  打印元素 输入[3-6] num的倍数


class e{
    public static void main(String[] args) {
        Random r=new Random();
        int[] arr=new int[6];
        System.out.println("随机数组为");
        for (int i = 0; i < arr.length; i++) {
            
            arr[i]=r.nextInt(61)+6;
            System.out.print(arr[i]+" ");
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个num；");
        int num=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%num==0){
                System.out.println(arr[i]);
            }
            
        }


    }
}

class Method{
    
    public static void main(String[] args) {       
       System.out.println(getmax()); 
    }
    public static int  getmax() {
        int a=0;
        Random r=new Random();
        int[] arr=new int[6];
        System.out.println("随机数组为");
        double avg=0;
        for (int i = 0; i < arr.length; i++) {
            
            if(i==arr.length-1){
                arr[arr.length-1]=r.nextInt(100)+1;
                System.out.println(arr[i]+" ");
            }else{
                arr[i]=r.nextInt(100)+1;
                System.out.print(arr[i]+" ");
            }
            avg+=arr[i];
        }
        avg=Math.round(avg/6.0);
    System.out.println("平均值为："+avg);
    for (int j = 0; j < arr.length; j++) {
        if(arr[j]<avg){
            a++;
        }            
    }       
    System.out.println("当前小于avg的数有三个；"); 
    return a;
}
}

class Class{
    private int age;
    private String name;
    private String like;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public Class() {
    }

    public Class(int age, String name, String like) {
        this.age = age;
        this.name = name;
        this.like = like;
    }

    @Override
    public String toString() {
        return "A [age=" + age + ", like=" + like + ", name=" + name + "]";
    }
    public void show() {
        System.out.println(name+","+age+","+like);
    }
    
}

class TestA{
    public static void main(String[] args) {
        Class a1=new Class(20,"夏诗韵","读书");
        Class a2=new Class(21,"慕容学痕","弹钢琴");
        Class a3=new Class(18,"燕舞清","跳舞");
        Class[] arr={a1,a2,a3};
        a1.toString();
        for (int i = 0; i < arr.length; i++) {
            arr[i].setLike("敲代码");
            System.out.println(arr[i].toString());
            
        }




    }
}
