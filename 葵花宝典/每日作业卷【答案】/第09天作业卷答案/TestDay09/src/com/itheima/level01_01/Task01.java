package com.itheima.level01_01;

import java.util.ArrayList;

/*
 * �����������
   1.����һ��ֻ�ܴ洢�ַ����ļ��϶���
   2.�򼯺�������������ݣ�������ա�������˽䡱����ɳ���С��������ȹ�����
   3.���ñ�����ֱ�Ӵ�ӡ���ϣ�
   4.��ȡ��4��Ԫ�أ�ע�⣬��--��4��Ԫ�أ����������ǣ���
   5.��ӡһ�¼��ϴ�С��
   6.ɾ��Ԫ�ء����ȹ�����
   7.ɾ����3��Ԫ�أ�ע�⣺��--��3��Ԫ�أ�
   8.��Ԫ�ء���˽䡱��Ϊ�������ܡ�
   9.�ٴδ�ӡ���ϣ�
 */
public class Task01 {
	public static void main(String[] args) {
		// 1.����һ��ֻ�ܴ洢�ַ����ļ��϶���
		ArrayList<String> list =new ArrayList<String>();
		// 2.�򼯺�������������ݣ�������ա�������˽䡱����ɳ���С��������ȹ�����
		list.add("�����");
		list.add("��˽�");
		list.add("ɳ����");
		list.add("���ȹ���");
		// 3.���ñ�����ֱ�Ӵ�ӡ���ϣ�
		System.out.println(list);
		// 4.��ȡ��4��Ԫ�أ�ע�⣬��--��4��Ԫ�أ����������ǣ���
		String ele = list.get(3);
		System.out.println("��ȡ��4��Ԫ��:" + ele);
		// 5.��ӡһ�¼��ϴ�С��
		int size = list.size();
		System.out.println("���ϴ�С:" + size);
		// 6.ɾ��Ԫ�ء����ȹ�����
		list.remove("���ȹ���");
		// 7.ɾ����3��Ԫ�أ�ע�⣺��--��3��Ԫ�أ�
		list.remove(2);
		// 8.��Ԫ�ء���˽䡱��Ϊ�������ܡ�
		for (int i = 0; i < list.size(); i++) {
			if ("��˽�".equals(list.get(i))) {
				//����˽䡱��Ϊ�������ܡ�
				list.set(i, "������");
			}
		}
		// 9.�ٴδ�ӡ���ϣ�
		System.out.println(list);
	}
}
