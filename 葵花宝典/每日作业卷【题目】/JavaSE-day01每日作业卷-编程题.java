package dailyhomework;

public class DH01 {
    public static void main(String[] args) {
        /*
            在主方法中,使用输出语句,输出如下变量
            (1)整数变量i1: 88, i2:-88
            (2)小数变量d: 88.888
            (3)字符变量ch1: 'A', ch2:'8'
            (4)布尔变量flag1: true, flag2:false
         */
        int i1 = 88, i2 = -88;
        double d = 88.888;
        char ch1 = 'A', ch2 = '8';
        boolean flag1 = true, flag2 = false;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(d);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println("--------------------------------------------");

        /*
            输出效果如下:
            好好学习~
            天天向上~
            键盘敲烂,月薪过万~~
         */
        System.out.print("好好学习~" + "\n" + "天天向上~" + "\n" + "键盘敲烂，月薪过万~");
        System.out.println("--------------------------------------------");

        /*
            打印：
                    *
                   * *
                  *   *
                 *     *
                  *   *
                   * *
                    *
         */
        int k = 4;
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                if (j == k || j == 8 - k) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            if (k == 1 || i > 4) {
                k++;
            } else
                k--;
            System.out.println();
        }
        System.out.println("--------------------------------------------");

        /*
            {@}
            /|\
             |
         */
        System.out.println("{@}");
        System.out.println("/|\\");
        System.out.println(" |");
        System.out.println("--------------------------------------------");

        /*
         *
         **
         ***
         ****
         */
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");

        /*
            定义字符串变量 s , 并把值初始化为: “不忘初心,方得始终”，并输出
         */
        String s = "不忘初心，方得始终";
        System.out.println(s);
        System.out.println("--------------------------------------------");

        /*
            在控制台输出以下内容：
            姓名：王洋
            年龄：22
            性别：男
            职业：学生
            住址：北京市昌平区北七家镇宏福科技园修正大厦
         */
        System.out.println("姓名：王洋");
        System.out.println("年龄：22");
        System.out.println("性别：男");
        System.out.println("职业：学生");
        System.out.println("住址：北京市昌平区北七家镇宏福科技园修正大厦");
        System.out.println("--------------------------------------------");

        String name = "王洋";
        int age = 22;
        char gender = '男';
        String work = "学生";
        String addr = "北京市昌平区北七家镇宏福科技园修正大厦";
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("性别：" + gender);
        System.out.println("职业：" + work);
        System.out.println("住址：" + addr);
    }
}
