package com.itheima.level02_05;


/*
	�����������󣬲��ô���ʵ��
	�ֻ���Phone
	����:
		Ʒ��brand
		�۸�price
	��Ϊ:
		��绰call()
		������sendMessage()
		����ϷplayGame()
		
	Ҫ��:
		1.��������Ҫ������,����Ҫ˽��,���ɿղΡ��вι��죬setter��getter����
		2.���������,��main�����д�������Ķ��󲢸����Ը�ֵ(��ʾ���ַ���:setter�����͹��췽��)
		3.����������Ա����,��ӡ��ʽ����:
			����ʹ�ü۸�Ϊ998Ԫ��С��Ʒ�Ƶ��ֻ���绰....
			����ʹ�ü۸�Ϊ998Ԫ��С��Ʒ�Ƶ��ֻ�������....
			����ʹ�ü۸�Ϊ998Ԫ��С��Ʒ�Ƶ��ֻ�����Ϸ....
 */
public class Task05 {
	public static void main(String[] args) {
		Phone phone1 = new Phone("С��",998);
		phone1.call();
		phone1.sendMessage();
		phone1.playGame();
		
		Phone phone2 = new Phone();
		phone2.setBrand("С��");
		phone2.setPrice(998);
		phone2.call();
		phone2.sendMessage();
		phone2.playGame();
		
	}
}
