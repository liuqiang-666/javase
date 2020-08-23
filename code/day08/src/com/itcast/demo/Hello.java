package com.itcast.demo;



import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(check(arr));
    }

    // 返回值boolean类型，表示是否符合规则。参数列表：需要判断的字符串
    public static String check(int[] arr) {
        String s="";
        if (arr==null){
            return "null";
        }
        if(arr.length==0){
            return "[]";
        }else{
            s+="{";
            for (int i = 0; i < arr.length; i++) {
                
                if(i==arr.length-1){
                    s+=arr[i]+"}";
                }else{
                    s+=arr[i]+", ";
                }
            }
            return s;
        }
        
}

}
