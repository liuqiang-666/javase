package com.itheima.level01_01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * �������û��ӿ���̨������Ϣ��������Ϣ�洢���ļ�Info.txt�С�
 * 		�������������Ϣ��ÿ����Ϣ�洢һ�С����û����룺��886��ʱ�����������
 * 
 *    	123456
 *    	abcdef
 *    	886
 */
public class Task01 {
	public static void main(String[] args) throws IOException {
		//1. ָ��������� ��Ӧ���ļ�Info.txt
		BufferedWriter bw = new BufferedWriter(new FileWriter("Info.txt"));
		//2.����ѭ���ķ�ʽ����ÿ����Ϣ�洢һ�е�Info.txt��
		Scanner sc = new Scanner(System.in);
		while(true){
			//��ȡ���������һ������
			System.out.print("���������ݣ�");
			String str = sc.next();
			
			//���û����룺��886��ʱ�����������
			if ("886".equals(str)) {
				break;//����ѭ��
			}
			
			//������д�뵽Info.txt�ļ���
			bw.write(str);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
	}
}
