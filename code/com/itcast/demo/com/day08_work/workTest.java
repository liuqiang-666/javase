import java.util.Scanner;
public class workTest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请录入工人姓名:");
        String name1=sc.nextLine();
        System.out.println("请录入工人工龄:");
        int a=sc.nextInt();
        WorKer man1=new WorKer();
        man1.setName(name1);
        man1.setYear(a);
        man1.toString();
    }
}