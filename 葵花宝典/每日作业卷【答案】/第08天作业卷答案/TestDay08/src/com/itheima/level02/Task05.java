package com.itheima.level02;

import java.util.Random;

/*
	������������,���ô���ʵ��
		1.����String getStr(char[] chs)����
			������������ȡ����Ϊ5������ַ������ַ����������4����дӢ����ĸ��1��0-9֮�䣨����0��9�����������
		2.����main��������������ɣ�
			(1)���峤��Ϊ26��Ԫ��ֵΪ26����дӢ����ĸ������chs
			(2)��������chs����getStr(char[] chs)��������ȡ����ֵ,���ڿ���̨��ӡ����ֵ
 */
public class Task05 {
	public static void main(String[] args) {
		// 1.���峤��Ϊ26��Ԫ��ֵΪ26����дӢ����ĸ������chs
		char[] chs = new char[26];
		for (int i = 0; i < chs.length; i++) {
			chs[i] = (char)('A' + i);
		}
		// 2.��������chs����getStr(char[] chs)��������ȡ����ֵ,���ڿ���̨��ӡ����ֵ
		String result = getStr(chs);
		System.out.println(result);
	}

	/*
	 * ������������ȡ����Ϊ5������ַ������ַ����������4����дӢ����ĸ��1��0-9֮�䣨����0��9�����������
	 * String getStr(char[] chs)
	 */
	public static String getStr(char[] chs) {
		Random r = new Random();
		//1��0-9֮�䣨����0��9��������
		String result = r.nextInt(10) + "";
		//�����4����дӢ����ĸ
		for (int i = 0; i < 4; i++) {
			int index = r.nextInt(chs.length);
			result += chs[index];
		}
		return result;
	}
	
	
}
