package com.itheima.level01_01;
/*
 * 1. ���������
 * 	Teacher(��ʦ��)��Course(�γ���)
 * 
 * 	Teacher(��ʦ��)
 * 		��ʦ���	����		�Ա�		����		��Ŀ
 * 		id		name	sex		age		course
 * 		�ṩ���췽����get��set����
 * 
 * Course(�γ���)
 * 		�γ̱��	����		����ʱ��		�γ�����
 * 		id		name	createtime	desc
 * 		�ṩ���췽����get��set����
 */
public class Task01 {
	public static void main(String[] args) {
		/*2.������Ӧ����,ͨ�����췽������Ա������ֵ��
		 * ��ʦ���	����		�Ա�		����		��Ŀ
			t001	Ѧ֮ǫ	��		26		Java
			t002	�ű̳�	Ů		24		IOS
			t003	�Ž�		��		28		Java

			�γ̱��	����		����ʱ��		�γ�����
			s001	Java	2007-02-08	Javaѧ�ƣ�����JavaSE��JavaEE
			s002	IOS		2007-02-09	IOSϵͳ����
		 */
		Teacher t1 = new Teacher("t001", "Ѧ֮ǫ", "��", 26, "Java");
		Teacher t2 = new Teacher("t002", "�ű̳�", "Ů", 24, "IOS");
		Teacher t3 = new Teacher("t003", "�Ž�", "��", 28, "Java");
		
		Course c1 = new Course("s001", "Java", "2007-02-08", "Javaѧ�ƣ�����JavaSE��JavaEE");
		Course c2 = new Course("s002", "IOS", "2007-02-09", "IOSϵͳ����");
		
		//3. ��ӡÿ��������������ԡ�
		System.out.println(t1.getId() + ", " + t1.getName() + ", " + t1.getSex() +", "+ t1.getAge() +", "+ t1.getCource());
	}
}
