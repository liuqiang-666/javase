package com.itcast;

import java.util.Arrays;
import java.util.Scanner;

import jdk.javadoc.internal.tool.Main;

// class e{
//     public static void main(String[] args) {
//         // int[] arr={11,23,44,2,12};
//         // Arrays.sort(arr);
//         // String s=Arrays.toString(arr);
//         // System.out.println(s);
//         // String a="ashoawqu212434Alskdoaho";
//         // char[]  S= a.toCharArray();
//         // Arrays.sort(S);
//         // for (int i = S.length-1; i > 0; i--) {
//         //     System.out.println(S[i]);
//         // } 

//         // System.out.println(Math.abs(-2.5));  //2.5
//         // System.out.println(Math.ceil(59.3)); //向上取整  60.0
//         // System.out.println(Math.ceil(3.0)); //向上取整 3.0
//         // System.out.println(Math.round(3.24)); //四舍五入 3
//         // System.out.println(Math.floor(3.24)); //向下取整 3.0

//         // 在-10.8到5.9之间的所有绝对值大于6或者小于2.1的整数
//     for(int i=(int)-10.8;i<5.9;i++){
    //     if(Math.abs(i)>6 || Math.abs(i)<2.1){
    //         System.out.println(i);
    //     }
    // }
    //     Scanner s=new Scanner(System.in);
    //     String  sa=s.next();

        
       




//     //     int[] arr3=find2(arr);
//     //     for (int i = 0; i < arr3.length; i++) {
//     //         it(arr3[i]==3){
//     //             System.out.println(arr3[i]);  
//     //         }else{
//     //             System.out.println("没有发现");
//     //         }
    
//     //     }

//     // }
//     // public static int[] find2(int[] arr){
//     //     int b=0;
//     //     int[] arr1=new int[arr.length];
//     //     for (int i = 0; i < arr.length; i++) {
//     //         if(arr[i]==2){
//     //             arr1[b]=i;
//     //             b++;

//     //         }
//     //     }
//     //     return arr1;
//     }
// }
// class  E{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
// //        Scanner sc =new Scanner(System.in);
//         for (int i = 0; i <3 ; i++) {
//             String username=sc.nextLine();
//             String passowrd=sc.nextLine();
//             String name="12345";
//             String name1="12345";
//             if(username.equals(name)& passowrd.equals(name1)){
//                 System.out.println("输入正确");
//                 break;
//             }else {
//                 System.out.println("登录失败");
//             }
//             if(i==2){
//                 System.out.println("您的登录次数已经没了，下次再来");
//             }else {
//                 System.out.println("您的输入错误，您还有"+(3-1-i)+"次机会");
//             }
//         }
//     }
// }
abstract class E{
    static int a=0;
    private int b=0;
    protected int c=0;
    public abstract void namae();
}

class ES extends E{
    
    @Override
    public void namae(){
        
        System.out.println("chiaas");
    }
}



class X{
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s= sc.nextLine();
        char[] arr=s.toCharArray();
        String ss=  s.substring(2,6);
        System.out.println(ss);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >='a' & arr[i]<='z'){
                    a++;
            }else if (arr[i] >='A' & arr[i]<='Z'){
                b++;
            }else{
            c++;
            }
        }
    System.out.println("小写字母有："+a);
    System.out.println("大写字母有："+b);
    System.out.println("数字有："+c);
}
}