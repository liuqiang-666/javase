package com.itheima.level01;

import java.util.Scanner;

/*
 * �밴����Ҫ���д����,��ӡ�˵�:
  		1.�Ӽ�����¼��һ��1��5������;
  		2.������Ϊ1ʱ��ӡ�˵�"�½�";
  		  ������Ϊ2ʱ��ӡ�˵�"���ļ�";
  		  ������Ϊ3ʱ��ӡ�˵�"����";
  		  ������Ϊ4ʱ��ӡ�˵�"ˢ��";
  		  ������Ϊ5ʱ��ӡ�˵�"�˳�",���˳�����;
		  	�˳��������: System.exit(0);
 */
public class Task05 {
	public static void main(String[] args) {
		while(true){
			//1.�Ӽ�����¼��һ��1��5������;
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			//�ж��������1-5֮����ĸ����֣���Ӧ�����ִ�ӡ��ͬ������
			switch (n) {
			case 1://1 -- �½�
				System.out.println("�½�");
				break;
			case 2://2 -- ���ļ�
				System.out.println("���ļ�");
				break;
			case 3://3 -- ����
				System.out.println("����");
				break;
			case 4://4 -- ˢ��
				System.out.println("ˢ��");
				break;
			case 5://5 -- �˳�
				System.out.println("����java���������");
				//�˳��������: System.exit(0);
				System.exit(0);
				break;
			}
		}
	}
}
