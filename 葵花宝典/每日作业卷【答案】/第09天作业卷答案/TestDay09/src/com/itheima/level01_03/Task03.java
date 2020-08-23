package com.itheima.level01_03;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 	ѧ��		����		�Ա�		����		���	
	it001	�Ʋ�		��		20		1.72		
	it002	�����	��		22		1.78		
	it003	������	Ů		18		1.64		

 */
public class Task03 {
	public static void main(String[] args) {
		//��ѧ������ļ���
		ArrayList<Student> list = new ArrayList<Student>();
		
		//1.��������3λѧԱ����Ϣ��ѧ�š��������Ա����䡢��ߣ�
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.print("�������"+i+"λѧԱ��ѧ�ţ�");
			String id = sc.next();//ѧ��
			System.out.print("�������"+i+"λѧԱ��������");
			String name = sc.next();//����
			System.out.print("�������"+i+"λѧԱ���Ա�");
			String sex = sc.next();//�Ա�
			System.out.print("�������"+i+"λѧԱ�����䣺");
			int age  = sc.nextInt();//����
			System.out.print("�������"+i+"λѧԱ����ߣ�");
			double height  = sc.nextDouble();//���
			
			//����Student���󣬴浽������
			Student s = new Student(id, name, sex, age, height);
			list.add(s);
		}
		//2.��ӡ����ѧԱ����Ϣ
		printAll(list);
		//3.�ҳ������ߵ�ѧԱ������ӡ������ϸ��Ϣ
		findMaxHeight(list);
	}
	
	/*
	 * ��ӡ����ѧԱ����Ϣ
	 */
	public static void printAll(ArrayList<Student> list){
		for (int i = 0; i < list.size(); i++) {
			//��ȡ������ÿ��ѧ������
			Student s = list.get(i);
			System.out.println(s.getId()+", "+ s.getName() + ", " + s.getSex() +", "+ + s.getAge() +", "+ + s.getHeight());
		}
	}
	
	/*
	 * �ҳ������ߵ�ѧԱ������ӡ������ϸ��Ϣ
	 */
	public static void findMaxHeight(ArrayList<Student> list){
		//��¼�����ߵ�ѧ��
		Student maxStu = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			//��ȡ�����е�ÿ��Student����
			Student thisStu = list.get(i);
			//���Ѽ�¼�������ߵ�ѧ�����бȽ�
			if (thisStu.getHeight() > maxStu.getHeight()) {
				//�������ѧ���ļ�¼��Ϣ
				maxStu = thisStu;
			}
		}
		//�õ��������ߵ�ѧ��  maxStu
		System.out.println("�����ߵ�ѧ��Ϊ��");
		System.out.println(maxStu.getId()+", "+ maxStu.getName() + ", " + maxStu.getSex() +", "+ + maxStu.getAge() +", "+ + maxStu.getHeight());
	}
}
