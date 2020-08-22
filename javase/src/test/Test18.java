//package test;
//
//import java.util.Scanner;
//
//public class Test18 {
//
//	public static void main(String[] args) {
//// TODO Auto-generated method stub
////分析并完成以下需求:
//
////	1.我国的居民身份证号码，由17位数字本体码，和1位数字校验码组成
////	2.请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果
//// 规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X
//		Scanner sc=new Scanner(System.in);
//		while(true) {
//			System.out.println("请输入一段字符串：");
//			String s=sc.nextLine();
//			char[]  arr=s.toCharArray();
//			boolean a=judge(s);
//			if (a==true) {
//				int b=dealstr(arr);
//				System.out.println("您的字符串大写字母有"+b+"个");
//				
//			}else {				
//				System.out.println("您的字符串没有字母");
//			}
//		}
//	}
//	}
//
//}
