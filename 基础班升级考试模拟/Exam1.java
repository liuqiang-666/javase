import java.util.Random;

public class Exam1 {
    /*定义一个长度为5的数组arr1，用于存放5个1~9的随机整数（范围包含1和9），
    再定义一个长度为2的数组arr2，统计arr1中的元素对2求余等于0的个数,保存到arr2[0],
    统计arr1中的元素对3求余等于0的个数,保存到arr2[1],在控制台打印输出arr2的所有元素*/
    public static void main(String[] args) {
        Random random = new Random();
        //定义一个计数器用来统计arr1中的元素对2求余等于0的个数
        int count = 0;
        //定义一个计数器统计arr1中的元素对3求余等于0的个数
        int num = 0;
        //定义一个长度为2的数组arr2
        int[] arr2 = new int[2];
       // 定义一个长度为5的数组arr1
        int[] arr1 = new int[5];
//        用于存放5个1~9的随机整数（范围包含1和9），
        for (int i = 0; i < arr1.length; i++) {
            //随机生成5个1~9的随机整数，存放在x中
            int x = random.nextInt(9) + 1;
            arr1[i] = x;
        }
            //统计arr1中的元素对2求余等于0的个数,保存到arr2[0],
        for (int j = 0; j < arr1.length; j++) {
            if (arr1[j] % 2 == 0) {
                count++;
            }
        }
        arr2[0] = count;

//            统计arr1中的元素对3求余等于0的个数,保存到arr2[1]
        for (int j = 0; j < arr1.length; j++) {
            if (num % 3 == 0) {
                num++;
            }
        }
        arr2[1] = num;
//            在控制台打印输出arr2的所有元素
        for (int j = 0; j < arr2.length; j++) {
            System.out.println(arr2[j]);
        }


    }
}
