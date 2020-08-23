package com.itheima.level01_02;

import java.util.ArrayList;

/*
	�밴����Ҫ���д���룺
	1.	����Student�࣬�����������ԣ�
		ѧ�š����������
	2.	����MainApp�࣬����main()������
	3.	��main()�����У�����һ�����Դ洢Student����ļ��϶���
	4.	�������¼���Student����
		ѧ��		����		���	
		it001	�Ʋ�		1.72
		it002	�����	1.78
		it003	������	1.64
		it004	��ӱ		1.68
	5.	�����漸��������ӵ�������
	6.	�������ϴ�ӡÿ�����������ֵ��
	7.	��ȡ����ӡ���ϴ�С��
	8.	��ȡ��3��ѧԱ���󣬲���ӡ������ֵ��
	9.	�Ƴ�����4��ѧԱ����
	10.	�ٴλ�ȡ����ӡ���ϴ�С��
	11.	����һ�������滻Ϊ���¶���
		it005	������	1.67
	12.	�������ϣ���ӡ�������1.70���ϵ�ѧԱ��Ϣ��
	13.	�������ϣ���ӡ������յ�ѧԱ��Ϣ��

 */
public class Task02 {
	public static void main(String[] args) {
		//3.��main()�����У�����һ�����Դ洢Student����ļ��϶���
		ArrayList<Student> list = new ArrayList<Student>();
		//4.�������¼���Student����
		//5.�����漸��������ӵ�������
		list.add(new Student("it001","�Ʋ�", 1.72));
		list.add(new Student("it002","�����", 1.78));
		list.add(new Student("it003","������", 1.64));
		list.add(new Student("it004","��ӱ", 1.68));
		//6.�������ϴ�ӡÿ�����������ֵ��
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s.getId()+","+s.getName()+","+s.getHeight());
		}
		//7.��ȡ����ӡ���ϴ�С��
		int size = list.size();
		System.out.println("��ӡ���ϴ�С:" + size);
		//8.��ȡ��3��ѧԱ���󣬲���ӡ������ֵ��
		Student stu = list.get(2);
		System.out.println("��3��ѧԱ����:"+stu.getId()+","+stu.getName()+","+stu.getHeight());
		//9.�Ƴ�����4��ѧԱ����
		list.remove(3);
		//10.�ٴλ�ȡ����ӡ���ϴ�С��
		size = list.size();
		System.out.println("��ӡ���ϴ�С:" + size);
		//	11.	����һ�������滻Ϊ���¶��� it005	������	1.67
		Student student = new Student("it0005", "������", 1.67);
		list.set(0, student);
		//12.�������ϣ���ӡ�������1.70���ϵ�ѧԱ��Ϣ��
		//13.�������ϣ���ӡ������յ�ѧԱ��Ϣ��
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			//��ӡ�������1.70���ϵ�ѧԱ��Ϣ
			if (s.getHeight() > 1.70) {
				System.out.println("�����1.70���ϵ�ѧԱ��Ϣ:"+s.getId()+","+s.getName()+","+s.getHeight());
			}
			//��ӡ������յ�ѧԱ��Ϣ��
			if (s.getName().startsWith("��")) {
				System.out.println("����յ�ѧԱ��Ϣ:"+s.getId()+","+s.getName()+","+s.getHeight());
			}
		}
	}
}
