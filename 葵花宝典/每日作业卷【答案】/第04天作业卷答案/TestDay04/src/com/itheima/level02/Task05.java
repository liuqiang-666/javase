package com.itheima.level02;

import java.util.Scanner;

/*
	����һ���򵥵���ATM��ȡ��������£�������ʾ�û��������루password����
	���ֻ������3�Σ�����3������ʾ�û�"���������ȡ��"���׽�����
	����û�������ȷ������ʾ�û������amount����ATMֻ�����100Ԫ��ֽ�ң�һ��ȡǮ��Ҫ�����0Ԫ�����1000Ԫ��
	����û�����Ľ���������Ҫ�����ӡ����û�ȡ��Ǯ���������ʾ�û�"������ɣ���ȡ��"��������ʾ�û���������������û�������"111111"��
	������
		1.��������¼�����
		2.����boolean���͵ı���isError����ʾ�Ƿ���ȷȡ���ʼֵΪtrue����ʾȡ��ʧ�ܣ�
		3.����forѭ����ѭ��¼�����루������Σ�
			(1)����String���͵ı���password����ͨ������¼���password��ֵ
			(2)ʹ��if�ж�password��ֵ
				a.���password������111111��continue��ǰ��������ѭ�������������´����������
				b.���password����111111������ȡ�����
					A.ͨ��whileѭ��¼��ȡ����
						aa.����int���͵ı���amount����ͨ������¼���amount������ֵ
						bb.ʹ��if�жϣ����amount��ֵ��0��1000֮��
							��ӡ"ȡ���ֽ�XXԪ"
							isError��ֵΪfalse
							break;//ȡ��ɹ�����ֹwhileѭ��
						cc.���amount��ֵ����0��1000֮��
							��ʾ"�������ȡ�����������������룺",whileѭ������ִ��
				
		4.ʹ��if�ж�isError��ֵ
			(1)���isErrorΪtrue����ӡ"���������ȡ��"
			(2)���isErrorΪfalse����ӡ"������ɣ���ȡ��"
 */
public class Task05 {
	public static void main(String[] args) {
//		1.��������¼�����
		Scanner sc = new Scanner(System.in);
//		2.����boolean���͵ı���isError����ʾ�Ƿ���ȷȡ���ʼֵΪtrue����ʾȡ��ʧ�ܣ�
		boolean isError = true;
		System.out.print("���������룺");
//		3.����forѭ����ѭ��¼�����루������Σ�
		for(int i = 0;i<3;i++) {
//			(1)����String���͵ı���password����ͨ������¼���password��ֵ
			String password = sc.nextLine();
//			(2)ʹ��if�ж�password��ֵ
//			a.���password������111111��continue��ǰ��������ѭ�������������´����������
			if(!"111111".equals(password)) {
				System.out.print("����������������룺");
				continue;
			}
			System.out.print("������ȡ���");
//			b.���password����111111������ȡ�����
//			A.ͨ��whileѭ��¼��ȡ����
			while(true) {
//				aa.����int���͵ı���amount����ͨ������¼���amount������ֵ
				int amount = sc.nextInt();
//				bb.ʹ��if�жϣ����amount��ֵ��0��1000֮��
				if(amount>=0&&amount<=1000) {
//					��ӡ"ȡ���ֽ�XXԪ"
//					isError��ֵΪfalse
//					break;//ȡ��ɹ�����ֹwhileѭ��
					System.out.println("��ȡ���ֽ�"+ amount + "Ԫ");
					isError = false;
					break;
				}
//				cc.���amount��ֵ����0��1000֮��
//				��ʾ"�������ȡ�����������������룺",whileѭ������ִ��
				System.out.print("�������ȡ�����������������룺");
				
			}
			
		}
//		4.ʹ��if�ж�isError��ֵ
//		(1)���isErrorΪtrue����ӡ"���������ȡ��"
		if(isError) {
			System.out.println("���������ȡ��");			
		} else {
//			(2)���isErrorΪfalse����ӡ"������ɣ���ȡ��"
			System.out.println("������ɣ���ȡ��");
		}
	}
}
