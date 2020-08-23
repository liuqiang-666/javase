package com.itheima.level02_03;

import java.util.ArrayList;

/*
		�����������󣬲��ô���ʵ��
		1.����ArrayList���ϣ��������ַ���
		   ��:"ab1" "123ad"  "bca" "dadfadf"  "dddaaa"  "��ð�"  "������"  "���ܰ�"
		2.��������,ɾ�����ȴ���5���ַ���,��ӡɾ����ļ��϶���
			��ʾ:���Խ�ԭ���������г��ȴ���5���ַ������뵽�¼�����,�����¼���,�¼����е�Ԫ�ؾ���Ҫɾ����Ԫ��
			
		3.������һ��,ɾ��������Ԫ�ذ���0-9���ֵ��ַ���(ֻҪ�ַ����а���0-9�е�����һ�����־���Ҫɾ���������ַ���)
			��ʾ:
				(1)����public static boolean myContains(String str)����
					����:
						�ж�str���Ƿ����0��9������
						����:����true
						������:����false
				(2)����ԭ��������myContains���������а���0-9���ַ��������¼�����
				(3)�¼����е�Ԫ�ؾ���Ҫɾ����Ԫ��
 */
public class Task03 {
	
	public static void main(String[] args) {
		ArrayList<String> list = getArrayList();
		//ɾ�������г��ȴ���5��Ԫ��
		delStrsFromList01(list);
		System.out.println(list);
		//ɾ��������Ԫ���а���0��9֮�����ֵ�Ԫ��
		delStrsFromList02(list);
		System.out.println(list);
	}

	//���ش洢����ַ�����ArrayList����
	private static ArrayList<String> getArrayList() {
		ArrayList<String> list = new ArrayList<>();
		list.add("ab1");
		list.add("123ad");
		list.add("bca");
		list.add("dadfadf");
		list.add("dddaaa");
		list.add("��ð�");
		list.add("������");
		list.add("���ܰ�");
		return list;
	}
	
	//�ж��ַ������Ƿ����0��9������
	public static boolean contains(String str) {
		//�����ַ���
		for(int i = 0;i<str.length();i++) {
			//��ȡ��ǰ�ַ�
			char ch = str.charAt(i);
			//ֻҪ��һ���ַ���0-9�����־ͷ���true
			if(ch>='0'&&ch<='9')
				return true;
		}
		//�ַ�����һ��0-9���ַ���û�з���false
		return false;
	}
	
	//ɾ��list���������г���>5���ַ���
	private static void delStrsFromList01(ArrayList<String> list) {
		//����ArrayList���϶���
		ArrayList<String> newList =  new ArrayList<String>();
		//����ԭ���϶���
		for(int i = 0;i<list.size();i++) {
			//��ȡ��ǰԪ��
			String str = list.get(i);
			//���str�ĳ��ȴ��ڵ���5
			if(str.length()>5) {
				newList.add(str);//��str��ӵ��¼�����
			}
		}
		//�����¼���
		for(Object str : newList) {
			//��Ϊ�¼����е�Ԫ�ؾ���Ҫɾ����Ԫ��
			list.remove(str);
		}
//		System.out.println(list);
	}
	//ɾ��������Ԫ�ذ���0-9���ֵ��ַ���
	private static void delStrsFromList02(ArrayList<String> list) {
		ArrayList<String> newList =  new ArrayList<String>();
		for(int i = 0;i<list.size();i++) {
			String str = list.get(i);
			if(contains(str)) {
				newList.add(str);
			}
		}
		for(Object str : newList) {
			list.remove(str);
		}
	}
	
}
