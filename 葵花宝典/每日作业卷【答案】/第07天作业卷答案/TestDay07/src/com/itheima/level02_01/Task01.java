package com.itheima.level02_01;
/*
 * �����������󣬲��ô���ʵ��
	1.��Ŀ������Manager 
		���ԣ�
			����name
			����id
			����salary
			����bonus
		��Ϊ��
			����work()
	2.����Ա��Coder
		���ԣ�
			����name
			����id
			����salary
		��Ϊ��
			����work()
	Ҫ��:
		1.��������Ҫ����Manager���Coder��,����Ҫ˽��,���ɿղΡ��вι��죬setter��getter����
		2.���������,��main�����д�������Ķ��󲢸����Ը�ֵ(��ʾ���ַ���:setter�����͹��췽��)
		3.���ó�Ա����,��ӡ��ʽ����:
			����Ϊ123��������Ϊ15000����Ϊ6000����Ŀ��������Ŭ�������Ź�����,��������,���Ա���ύ�����Ĵ���.....
			����Ϊ135��������Ϊ10000�ĳ���Ա����Ŭ����д�Ŵ���......
			
 */
public class Task01 {
	public static void main(String[] args) {
		Manager m1 = new Manager("һ��","123",15000,6000);
		m1.work();
		Manager m2 = new Manager();
		m2.setName("һ��");
		m2.setId("123");
		m2.setSalary(15000);
		m2.setBonus(6000);
		m2.work();
		
		Coder c1 = new Coder("����","135",10000);
		c1.work();
		
		Coder c2 = new Coder();
		c2.setName("����");
		c2.setId("135");
		c2.setSalary(10000);
		c2.work();
	}
}














