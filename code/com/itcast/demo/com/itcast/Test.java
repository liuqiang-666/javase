import java.util.ArrayList;
import java.util.Scanner;

import org.graalvm.compiler.lir.sparc.SPARCByteSwapOp;



public class Test {
    public static void main(String[] args) {

        System.out.println("请输入红包个数：");
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        System.out.println("请输入红包金额：");
        int money=sc.nextInt();
        Userzi qunzhu=new Userzi("群主",2400);
        Userzi2 chengyuan=new Userzi2("成员",0);
        System.out.println(qunzhu.toString());
        System.out.println(chengyuan.toString());
        ArrayList<Integer> list =qunzhu.send(count,money);
        System.out.println(qunzhu.toString());
        chengyuan.recive(list);
        System.out.println(chengyuan.toString());
        
        

        // StringBuilder sb=new StringBuilder("123asd");
        // sb.append("asd").append("123").append("123sz");

        // System.out.println(sb);
        // sb.reverse();
        // System.out.println(sb);
        // System.out.println(sb.toString());



    }
}




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
        return "WorKer [姓名=" + name + ", 工龄=" + year + "]";
    }
    
    
    
}
public class TestWorker{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请录入工人姓名:");
        String name1=sc.nextLine();
        System.out.println("请录入工人工龄:");
        int a=sc.nextInt();
        WorKer man1=new WorKer(name1,a);
        man1.toString();
    }
}