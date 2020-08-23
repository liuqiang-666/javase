package com.itheima.level01;

/*
 * 	����˵�������������ַ�����
		String str = ��javajfiewjavajfiowfjavagkljjava��;
	��ֱ��巽��ͳ�Ƴ���
		1.	�ַ����У��ַ�j������
		2.	�ַ����У��ַ���java������
 */
public class Task02 {
	public static void main(String[] args) {
		//1.�����ַ���
		String str = "javajfiewjavajfiowfjavagkljjava";
		//2.���÷������õ��ַ�j������
		int count = getCount(str, 'j');
		int count2 = getCount(str, "java");//�õ��ַ�j������
		//3.��ӡ����
		System.out.println("�ַ�j������:" + count);
		System.out.println("�ַ���java������:" + count2);
	}
	
	/*
	 * ���󣺼�����ַ����а���ָ���ַ����ַ���������
	 * ָ�����������ƣ� getCount
	 * ָ�������Ĳ���: String str, char ch
	 * ָ�������ķ���ֵ�� int
	 */
	public static int getCount(String str, char ch){
		//1.����һ��������������¼���ҵ�ch�Ĵ���
		int count = 0;
		//2.����str�ַ����г���ch�ַ��Ĵ���
		int index = 0;
		while ((index = str.indexOf(ch)) != -1) {//˵�����ҵ����ַ�ch���ֵ�λ��
			count++; //���ֵĴ����ۼ�1
			str = str.substring(index + 1);//����str�ַ����е�����
		}
		return count;
	}
	
	/*
	 * ���󣺼�����ַ����а���ָ���ַ����ַ���������
	 * ָ�����������ƣ� getCount
	 * ָ�������Ĳ���: String str, String ch
	 * ָ�������ķ���ֵ�� int
	 */
	public static int getCount(String str, String ch){
		//1.����һ��������������¼���ҵ�ch�Ĵ���
		int count = 0;
		//2.����str�ַ����г���ch�ַ��Ĵ���
		int index = 0;
		while ((index = str.indexOf(ch)) != -1) {//˵�����ҵ����ַ�ch���ֵ�λ��
			count++; //���ֵĴ����ۼ�1
			str = str.substring(index + 1);//����str�ַ����е�����
		}
		return count;
	}
}	