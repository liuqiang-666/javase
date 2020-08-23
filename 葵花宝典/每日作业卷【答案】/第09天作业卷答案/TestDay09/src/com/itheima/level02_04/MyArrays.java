package com.itheima.level02_04;

import java.util.ArrayList;

/*
 * �����������󣬲��ô���ʵ��
		����MyArrays�࣬�����������·����������������£�
		1.public static void reverse(ArrayList<Integer> list);
			����ArrayList<Integer> list:Ҫ���в����ļ��϶���		
			Ҫ�󣺶�list���϶����е�Ԫ�ؽ��з�ת(��һ�������һ���������ڶ����͵����ڶ����������������͵�������������...)
		2.public static Integer max(ArrayList<Integer> list);
			����ArrayList<Integer> list:Ҫ���в����ļ��϶���		
			Ҫ�����list���϶����е����ֵ������
		3.public static Integer min(ArrayList<Integer> list);
			����ArrayList<Integer> list:Ҫ���в����ļ��϶���		
			Ҫ�����list���϶����е���Сֵ������

		4.public static int indexOf(ArrayList<Integer> list,Integer i);
			����ArrayList<Integer> list:Ҫ���в����ļ��϶���
			����Integer i:��Ҫ�ڼ����в��ҵ�Ԫ��
			Ҫ�����Ԫ��i��list�����е�һ�γ��ֵ����������û�з���-1
		5.public static void replaceAll(ArrayList<Integer> list,Integer oldValue,Integer newValue);
			����ArrayList<Integer> list:Ҫ���в����ļ��϶���
			����Integer oldValue:��Ҫ���滻����ԭֵ
			����Integer newValue���滻�����ֵ
			Ҫ�󣺽�list�����е�����ֵΪoldValue��Ԫ���滻ΪnewValue
 */
public class MyArrays {
	/*
	 * 1.public static void reverse(ArrayList<Integer> list);
			����ArrayList<Integer> list:Ҫ���в����ļ��϶���		
			Ҫ�󣺶�list���϶����е�Ԫ�ؽ��з�ת(��һ�������һ���������ڶ����͵����ڶ����������������͵�������������...)
	 */
	public static void reverse(ArrayList<Integer> list){
		for (int i = 0, j=list.size()-1; i < j; i++,j--) {
			int temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
	}
	
	/*
	 *	2.public static Integer max(ArrayList<Integer> list);
		����ArrayList<Integer> list:Ҫ���в����ļ��϶���		
		Ҫ�����list���϶����е����ֵ������
	 */
	public static Integer max(ArrayList<Integer> list){
		int max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		return max;
	}
	
	/*
	 *	3.public static Integer min(ArrayList<Integer> list);
			����ArrayList<Integer> list:Ҫ���в����ļ��϶���		
			Ҫ�����list���϶����е���Сֵ������
	 */
	public static Integer min(ArrayList<Integer> list){
		int min = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min) {
				min = list.get(i);
			}
		}
		return min;
	}
	
	/*
	 * 	4.public static int indexOf(ArrayList<Integer> list,Integer i);
		����ArrayList<Integer> list:Ҫ���в����ļ��϶���
		����Integer i:��Ҫ�ڼ����в��ҵ�Ԫ��
		Ҫ�����Ԫ��i��list�����е�һ�γ��ֵ����������û�з���-1
	 */
	public static int indexOf(ArrayList<Integer> list,Integer i){
		int index = -1;
		for (int j = 0; j < list.size(); j++) {
			if (list.get(j) == i) {
				index = j;
				break;
			}
		}
		return index;
	}
	
	/*
	 * 5.public static void replaceAll(ArrayList<Integer> list,Integer oldValue,Integer newValue);
			����ArrayList<Integer> list:Ҫ���в����ļ��϶���
			����Integer oldValue:��Ҫ���滻����ԭֵ
			����Integer newValue���滻�����ֵ
			Ҫ�󣺽�list�����е�����ֵΪoldValue��Ԫ���滻ΪnewValue
	 */
	public static void replaceAll(ArrayList<Integer> list,Integer oldValue,Integer newValue){
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == oldValue) {
				list.set(i, newValue);
			}
		}
	}
}
