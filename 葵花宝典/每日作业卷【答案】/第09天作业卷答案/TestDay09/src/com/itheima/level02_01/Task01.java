package com.itheima.level02_01;

import java.util.ArrayList;

/*
 * �����������󣬲��ô���ʵ��	
	1.�����������������Ķ��塣
		ѧ����
			���ԣ�
				����name
				����age
				�ɼ�score
			
	2.�������·�������,��������
		public void listStudents(ArrayList<Student> stus):������ӡѧ����Ϣ
		public int getMaxScore(ArrayList<Student> stus):��ȡѧ���ɼ�����߷�
		public Student getMaxStudent(ArrayList<Student> stus):��ȡ�ɼ���ߵ�ѧԱ
		public int getAverageScore(ArrayList<Student> stus):��ȡѧ���ɼ���ƽ��ֵ
		public int getCount(ArrayList<Student> stus):��ȡ�������ѧԱ����
	3.�ڲ������н��в��ԣ���main���������ȴ�������Ϊ5��Student���ϲ��������,Ȼ���ٵ������Ϸ������в���	
 */
public class Task01 {
	public static void main(String[] args) {
		Student s1 = new Student("С��", 34, 78);
		Student s2 = new Student("С��", 32, 59);
		Student s3 = new Student("С��", 20, 45);
		Student s4 = new Student("С��", 25, 98);
		Student s5 = new Student("����", 28, 100);
		ArrayList<Student> list = new ArrayList<>();
		//��ѧ��������뼯��
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		//����
//		listStudents(list);
//		int maxScore = getMaxScore(list);
//		System.out.println("���ɼ�:"+maxScore);
//		Student stu = getMaxStudent(list);
//		System.out.println("������"+stu.getName()+"   ���䣺"+stu.getAge() + "   ������"+stu.getScore());
//		int avg = getAverageScore(list);
//		System.out.println(avg);
		int count = getCount(list);
		System.out.println(count);
	}
	
	/*
	 * ������ӡѧ����Ϣ
	 */
	public static void listStudents(ArrayList<Student> stus) {
		for(int i = 0; i < stus.size(); i++) {
			Student stu = stus.get(i);
			System.out.println("������"+stu.getName()+"   ���䣺"+stu.getAge() + "   ������"+stu.getScore());
		}
	}
	/*
	 * public int getMaxScore(ArrayList<Student> stus):��ȡѧ���ɼ�����߷�
	 */
	public static int getMaxScore(ArrayList<Student> stus) {
		//���ȶ�����ձ��� �����洢���ķ�����������Ϊ0��ѧ���ĳɼ���������
		int max = stus.get(0).getScore();
		//��������
		for(int i = 1; i < stus.size(); i++) {
			//�õ�ѧ������
			Student stu = stus.get(i);
			//�ü����е�ÿһ��ѧ���ķ���ȥ�Ͳ��������Ա�
			if(stu.getScore() > max) {
				max = stu.getScore();
			}
		}
		return max;
	}
	/*
	 * public Student getMaxStudent(ArrayList<Student> stus):��ȡ�ɼ���ߵ�ѧԱ
	 */
	
	public static Student getMaxStudent(ArrayList<Student> stus) {
		//������������������ɼ���ߵ�ѧ��������
		int maxIndex = 0;
		//�������ϣ��õ�ǰ��������ѧ���ĳɼ������ǲ�������λ����ѧ���ĳɼ����Ա�
		for(int i = 1; i < stus.size(); i++) {
			//�����ǰ��������ѧ���ĳɼ����ڲ�������λ����ѧ���ĳɼ����Ͱѵ�ǰ������ֵ��maxIndex
			Student stu = stus.get(i);
			if(stu.getScore() > stus.get(maxIndex).getScore()) {
				maxIndex = i;
			}
		}
		return stus.get(maxIndex);
	}
	
	/*
	 * public int getAverageScore(ArrayList<Student> stus):��ȡѧ���ɼ���ƽ��ֵ
	 */
	public static int getAverageScore(ArrayList<Student> stus) {
		//����������洢�ܷ�
		int sum = 0;
		//�������ϣ���ÿ��ѧ���ĳɼ��ۼӵ�sum��
		for(int i = 0; i < stus.size(); i++) {
			//�õ�ÿһ��ѧ������
			Student stu = stus.get(i);
			//��ÿ��ѧ���ĳɼ��ۼӵ�sum��
			sum+= stu.getScore();
		}
		//��ƽ����
		int avgScore = sum/stus.size();
		return avgScore;
	}
	/*
	 * public int getCount(ArrayList<Student> stus):��ȡ�������ѧԱ����
	 */
	public static int getCount(ArrayList<Student> stus) {
		//������������洢����������
		int count = 0;
		//�������ϣ��ж�ÿһ��ѧ���ĳɼ��Ƿ񼰸���������񣬡��ͰѼ�����+1
		for(int i = 0; i < stus.size(); i++) {
			//�õ�ÿһ��ѧ��
			Student stu = stus.get(i);
			//�ж��Ƿ񼰸�
			if(stu.getScore() < 60) {
				count++;
			}
		}
		return count;
	}
	
}













