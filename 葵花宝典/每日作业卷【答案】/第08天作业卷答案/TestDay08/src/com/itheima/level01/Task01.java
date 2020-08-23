package com.itheima.level01;

import java.util.Scanner;

/*
 * ����˵�������û�����һ����QQ���롱���������ж����QQ�����Ƿ���ȷ��
		Ҫ��ʹ�÷���������жϹ��ܡ�
		���巽����checkQQ (String qq)������ʵ����֤��
		��֤����
			1)	������5��12λ���֣�
			2)	��λ������0��
 */
public class Task01 {
	public static void main(String[] args) {
		//1.��������һ��qq�����ַ���
		Scanner sc = new Scanner(System.in);
		String qq = sc.next();
		//2.����checkQQ (String qq)������ʵ����֤��
		boolean isOK = checkQQ(qq);
		//3.��ӡ��֤�Ľ��
		System.out.println("���QQ�����Ƿ���ȷ:" + isOK);
	}
	
	/*
	 * ���巽����checkQQ (String qq)������ʵ����֤
	 * ָ�����������ƣ�checkQQ
	 * ָ�������Ĳ�����String qq
	 * ָ�������ķ���ֵ��boolean
	 */
	public static boolean checkQQ(String qq){
		//1.��֤�ַ����ĳ���5-12λ֮�䣻
		if (qq.length()<5 || qq.length()>12 ) {
			return false; //˵��qq����ĳ��Ȳ���ȷ
		}
		//2.��֤��λ�ַ��������ַ�0��ֻ�����ַ�'1'--'9'
		if (qq.charAt(0) == '0') {
			return false;
		}
		//3.��֤�ַ����е�ÿ���ַ��������������ַ���0��-��9��֮����ַ�
		for (int i = 0; i < qq.length(); i++) {
			char ch = qq.charAt(i);
			//�ж��ַ��Ƿ��� �����ַ���0��-��9��֮����ַ�
			if (ch<'0' || ch>'9') {
				return false;//˵��qq�����к��з������ַ�
			}
		}
		//4.������֤��ͨ���ˣ�˵��qq��������ȷ��
		return true;
	}
}	
