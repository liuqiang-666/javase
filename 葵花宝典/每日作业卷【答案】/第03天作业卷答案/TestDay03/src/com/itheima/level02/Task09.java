package com.itheima.level02;

import java.util.Scanner;

/*
	ѭ��¼��ĳѧ����5�ſγ̵ĳɼ�������ƽ���֡����ĳ����¼��Ϊ������ֹͣ¼�벢��ʾ¼�����
	������
		1.��������¼�����
		2.����int���͵ı���sum(�ܷ�)��avg(ƽ����)�����������ĳ�ʼֵλ0,String���͵ı���name����ʾѧԱ����
		3.����boolean���͵ı���flag(��ʾ��ѧ����5�ųɼ��Ƿ���ȷ¼�룬�����һ��Ϊ��ֵ����ֵΪtrue����ʾ¼�����)����ʼֵΪfalse
		4.����forѭ����¼��5���ɼ�
			(1)�жϵ�ǰ�ĳɼ����С��0��flag��ֵΪtrue����ֹforѭ��
			(2)���������ǰ¼��ĳɼ�>=0,�ۼ����
		5.��ӡ���
			(1)���flagΪtrue����ӡ¼�����
			(2)�������flagΪfalse����ӡ�ֺܷ�ƽ����
 */
public class Task09 {
	public static void main(String[] args) {
//		1.��������¼�����
		Scanner sc = new Scanner(System.in);
//		2.����int���͵ı���sum(�ܷ�)��double���͵ı���avg(ƽ����)�����������ĳ�ʼֵλ0,String���͵ı���name����ʾѧԱ����
		int sum = 0;
		double avg = 0;
		String name;
//		3.����boolean���͵ı���flag(��ʾ��ѧ����5�ųɼ��Ƿ���ȷ¼�룬�����һ��Ϊ��ֵ����ֵΪtrue����ʾ¼�����)����ʼֵΪfalse
		boolean flag = false;
		System.out.print("������ѧԱ������");
		name = sc.nextLine();//¼��ѧԱ����
//		4.����forѭ����¼��5���ɼ�
		for(int i = 0;i < 5; i++) {
			System.out.print("�������"+(i+1)+"�ſγ̵ĳɼ��� ");
			int score = sc.nextInt();
//			(1)�жϵ�ǰ�ĳɼ����С��0��flag��ֵΪtrue����ֹforѭ��
			if(score < 0) {
				flag = true;
				break;
			}
//			(2)���������ǰ¼��ĳɼ�>=0,�ۼ����
			sum = sum + score;
		}
//		5.��ӡ���
		if(flag) {
//			(1)���flagΪtrue����ӡ¼�����
			System.out.println("��Ǹ������¼����������½���¼�룡");
		} else {
			avg = (double)sum / 5;//����ƽ����
//			(2)�������flagΪfalse����ӡ�ֺܷ�ƽ����
			System.out.println(name + "��ƽ�����ǣ�" + avg);
		}
	}
}
