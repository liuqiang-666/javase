package com.itheima.level02;

import java.util.Scanner;

/*
	������������,���ô���ʵ��
		1.����¼��һ���ַ���
		2.�����ַ�������ַ�����(����ʹ��toCharArray()����)
		3.���ַ������е����д�д��ĸ���Сд��ĸ(����ʹ��toLowerCase()����)
		4.�����һλ�����һλ�����ݲ���ͬ,�򽻻�
		5.���ַ�����������Ϊż����Ԫ�ر��'~'
		6.��ӡ����Ԫ�ص�����
 */
public class Task04 {
	public static void main(String[] args) {
		// 1.����¼��һ���ַ���
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		// 2.�����ַ�������ַ�����(����ʹ��toCharArray()����)
		char[] chs = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			chs[i] = str.charAt(i);
			// 3.���ַ������е����д�д��ĸ���Сд��ĸ(����ʹ��toLowerCase()����)
			if (chs[i]>='A' && chs[i] <='Z' ) {
				chs[i] += 32;
			}
		}
		// 4.�����һλ�����һλ�����ݲ���ͬ,�򽻻�
		if (chs[0] != chs[chs.length-1]) {
			char temp = chs[0];
			chs[0] = chs[chs.length-1];
			chs[chs.length-1] = temp;
		}
		
		for (int i = 0; i < chs.length; i++) {
			// 5.���ַ�����������Ϊż����Ԫ�ر��'~'
			if (i%2==0) {
				chs[i] = '~';
			}
			// 6.��ӡ����Ԫ�ص�����
			System.out.print(chs[i] + " ");
		}
	}
}
