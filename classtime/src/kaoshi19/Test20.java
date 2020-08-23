package kaoshi19;

import java.util.Scanner;

public class Test20 {
//

//提示用户键盘录入一个包含数字和字母的字符串（不做是否包含数字和字母的判断），遍历字符串分别筛选出数字和字母（如有符号不包含在字母里），按照数字在前字母在后的规则组成一个新的字符串，把组成的新字符串打印在控制台。
//
//
//例如


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请录入一个包含数字和字母的字符串:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] arr=s.toCharArray();
		String s1="";
		String num="";
		for (int i = 0; i < arr.length; i++) {
			if((arr[i]<='z' && arr[i]>='a') || (arr[i]<='Z' && arr[i]>='A')) {
				s1+=arr[i];
			}else if(arr[i]<='9' && arr[i]>='0' ) {
				num+=arr[i];
			}
		}
		System.out.println("新的字符串为："+num+s1);
	}

}
