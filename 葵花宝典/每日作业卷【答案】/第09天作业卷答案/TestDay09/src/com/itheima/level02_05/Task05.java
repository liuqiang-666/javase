package com.itheima.level02_05;

import java.util.ArrayList;

/*
 * �����������󣬲��ô���ʵ��		
		1.����ArrayList���ϣ��������ַ���"abc" "def"  "efg" "def" "def" "qwe" "def" "def" "swd" "wwe" "def" "def"
		2.ʹ����ͨforѭ����ȡ����������Ϊ3��Ԫ�ز���ӡ
		3.ͳ�Ƽ����а����ַ���"def"������
		4.���巽��public static boolean myContains(ArrayList list,String str)
			(1)����
				a.ArrayList list: ��ʾ�洢���String���ݵļ���
				b.String str: ��ʾһ���ַ���
			(2)����ֵ
				true: ��ʾlist�����а����ַ���str
				false: ��ʾlist�����в������ַ���str
		
		5.ɾ�������е������ַ���"def"(˼·:ѭ���жϼ������Ƿ����"def"�ַ���,������ɾ��,�����������涨���myContains����)
		6.��������ÿ��Ԫ���е�Сд��ĸ��ɴ�д��ĸ
		7.������ӡ���յļ����е�Ԫ��
 */
public class Task05{
	public static void main(String[] args) {
		ArrayList<String> list = getArrayList();
		//��ȡ����������Ϊ3��Ԫ��
		int index = 3;
		String element = getElementByIndex(list, index);
		System.out.println("����Ϊ "+index+"��Ԫ���� "+ element);
		//ͳ�Ƽ����а����ַ���def�ĸ���
		String str = "def";
		int count = getCountStr(list,str);
		System.out.println("�����а����ַ���"+str+"������Ϊ "+count + " ��");
		//ɾ�������е������ַ���def
		delAllStr(list,str);
		System.out.println(list);
		//��������Ԫ���е�Сд��ĸ��ɴ�д��ĸ
		toUpperCase(list);
		//��ӡ����Ԫ��
		printArrayList(list);
		
		
	}

	//getArrayList���������ش洢����ַ�����ArrayList���϶���
	public static ArrayList<String> getArrayList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("efg");
		list.add("def");
		list.add("def");
		list.add("qwe");
		list.add("def");
		list.add("def");
		list.add("swd");
		list.add("wwe");
		list.add("swd");
		list.add("def");
		list.add("def");
		list.add("swd");
		return list;
	}
	//������������ȡlist�����и�������Ӧ��Ԫ��
	public static String getElementByIndex(ArrayList<String> list,int index) {
		//��ʵ����������ȡԪ�أ���������ѭ������ֱ�ӵ���get����
//		return list.get(index);
		for(int i = 0;i<list.size();i++) {
			if(i==index)
				return list.get(index);
		}
		return null;
		//���ϴ���������������Ƿ�Խ�磬����Ҫ��Ӷ�����ж�
	}
	/**
	 * �жϼ���list���Ƿ����str����������true������������false
	 * @param list
	 * @param str
	 * @return
	 */
	public static boolean myContains(ArrayList<String> list,String str) {
		//��������
		for(int i = 0;i<list.size();i++) {
			//��ȡ��ǰԪ��
			String thisStr = list.get(i);
			//�жϵ�ǰԪ�غ�Ҫ���ҵ�Ԫ���Ƿ����
			if(thisStr.equals(str))
				return true;
		}
		//���������ɺ���Ȼû�з���true������Ϊû���ҵ�������false
		return false;
	}
	//��list������ͳ��str������
	private static int getCountStr(ArrayList<String> list, String str) {
		int count = 0;
		for(int i = 0;i<list.size();i++) {
			//��ȡ��ǰԪ��
			String thisStr = list.get(i);
			//�жϵ�ǰԪ�غ�Ҫ���ҵ�Ԫ���Ƿ����
			if(thisStr.equals(str))
				count++;
		}
		return count;
	}
	//ɾ������list�е������ַ���str
	private static void delAllStr(ArrayList<String> list, String str) {
		while(myContains(list, str)) {
			list.remove(str);
		}
	}
	//���������е�Ԫ��
	public static void printArrayList(ArrayList<String> list) {
		System.out.print("[");
		for(int i = 0;i<list.size();i++) {
			System.out.print(list.get(i));
			if(i==list.size()-1) {
				System.out.println("]");
				return ;
			}
			System.out.print(", ");				
		}
	}
	//�Ѽ����е�ÿ���ַ����е�Сд��ĸ��ɴ�д��ĸ
	private static void toUpperCase(ArrayList<String> list) {
		//����list����
		for(int i = 0;i<list.size();i++) {
			/*//��ȡ��ǰ�ַ���
			String str = list.get(i);
			//���ַ�������ַ�����
			char[] chars = str.toCharArray();
			//����StringBuilder����
			StringBuilder sb = new StringBuilder();
			//�����ַ�����
			for(int j = 0;j<chars.length;j++) {
				//��ȡ��ǰ�ַ�
				char ch = chars[j];
				//�����Сд��ĸ���ɴ�д
				if(ch>='a'&&ch<='z')
					ch-=32;
				//����д��ĸ��ӵ�StringBuilder������
				sb.append(ch);
			}
			//��sb�е����д�д��ĸ����ַ��������¸�ֵ��str������str�е��ַ����ͱ����ȫ��Ϊ��д����
			str = sb.toString();*/
			//���÷����������еĵ�ǰ�ַ�����ɴ�д���ַ���
			String str = toUpperCase(list.get(i));
			//������������Ϊi��������������Ϊstr������ʱ��str��������Ĵ���ȫ������˴�д
			list.set(i, str);
			//String���ж����˷���toUpperCase():���ַ�����ɴ�д�������Ͳ���������ô�鷳��
//			list.set(i, list.get(i).toUpperCase());
		}
	}
	//���ַ���str�е�Сд��ĸ��ɴ�д��ĸ
	private static String toUpperCase(String str) {
		//���ַ�������ַ�����
		char[] chars = str.toCharArray();
		//����StringBuilder����
		StringBuilder sb = new StringBuilder();
		//�����ַ�����
		for(int j = 0;j<chars.length;j++) {
			//��ȡ��ǰ�ַ�
			char ch = chars[j];
			//�����Сд��ĸ���ɴ�д
			if(ch>='a'&&ch<='z')
				ch-=32;
			//����д��ĸ��ӵ�StringBuilder������
			sb.append(ch);
		}
		//��sb�е����д�д��ĸ����ַ��������¸�ֵ��str������str�е��ַ����ͱ����ȫ��Ϊ��д����
		return sb.toString();
	}
}
