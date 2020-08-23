package com.itheima.level02_02;

import java.util.ArrayList;


/*
 * �����������󣬲��ô���ʵ��
		1.����Student��
			����:
				������String name
				���䣺int age
				�ɼ���int score
			��Ϊ:
				�ղι��췽��
				�вι��췽��
				set��get����
		2.���������,���в���
			(1)����5��ѧ���������ArrayList������
			(2)��ӡ��߷ֵ�ѧԱ���������䡢�ɼ�  [Ҫ���װһ���������]
			(3)��ӡ5��ѧ�����ܳɼ���ƽ����	 [Ҫ���װ�����������]
			(4)��ӡ�������ѧԱ��Ϣ������		 [Ҫ���װһ���������]
 */
public class Task02 {
	public static void main(String[] args) {
		//(1)����5��ѧ���������ArrayList������
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("С��", 34, 78));
		list.add(new Student("С��", 32, 59));
		list.add(new Student("С��", 20, 45));
		list.add(new Student("С��", 25, 98));
		list.add(new Student("����", 28, 100));
		
		//(2)��ӡ��߷ֵ�ѧԱ���������䡢�ɼ�  [Ҫ���װһ���������]
		printMaxScore(list);
		//(3)��ӡ5��ѧ�����ܳɼ���ƽ����	 [Ҫ���װ�����������]
		int sum = getSumScore(list);
		double avg = getAvgScore(list);
		System.out.println("����ѧ�����ܳɼ�:"+ sum +",ƽ����:" + avg);
		//(4)��ӡ�������ѧԱ��Ϣ������	[Ҫ���װһ���������]
		printInfo(list);
	}

	//��ӡ�������ѧԱ��Ϣ������
	public static void printInfo(ArrayList<Student> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			if (s.getScore() < 60) {
				System.out.println("�������ѧԱ��Ϣ: "+s.getName() +"," + s.getAge() +","+ s.getScore());
				count++;
			}
		}
		System.out.println("�������ѧԱ������" + count);
	}

	//��������ѧ����ƽ����
	public static double getAvgScore(ArrayList<Student> list) {
		int sum = getSumScore(list);
		return sum * 1.0 / list.size();
	}
	
	//��������ѧ�����ܳɼ�
	public static int getSumScore(ArrayList<Student> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			sum += s.getScore();
		}
		return sum;
	}

	//��ӡ��߷ֵ�ѧԱ���������䡢�ɼ�
	public static void printMaxScore(ArrayList<Student> list) {
		Student max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).getScore() > max.getScore()) {
				max = list.get(i);
			}
		}
		System.out.println("��߷ֵ�ѧԱ:" + max.getName() +"," + max.getAge() +","+ max.getScore());
	}
}
