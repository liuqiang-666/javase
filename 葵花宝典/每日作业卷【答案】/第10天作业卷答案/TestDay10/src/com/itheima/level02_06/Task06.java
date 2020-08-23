package com.itheima.level02_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * �����������󣬲��ô���ʵ��
	ʵ��һ����֤��С����Ҫ�����£�
	1. ����Ŀ��Ŀ¼���½�һ���ļ���data.txt,����¼��3���ַ�����֤�룬������data.txt�У�Ҫ��һ����֤��ռһ�У�
	2. ����¼��һ����Ҫ��У�����֤�룬����������֤����data.txt�д��ڣ��ڿ���̨��ʾ��֤�ɹ�����������ڿ���̨��ʾ��֤ʧ�� 

 */
public class Task06 {

	public static void main(String[] args) throws Exception {
		//����¼��3���ַ�����д����Ŀ��·���µ�data.txt�ļ���
		writeString2File();
		//��֤����֤
		verifyCode();
	}
	/**
	 * ��֤����֤
	 * @throws Exception 
	 */
	private static void verifyCode() throws Exception {
		//����ArrayList���ϣ����ڴ洢�ļ��е�3����֤��
		ArrayList<String> list = new ArrayList<>();
		//������Ч�ַ���������������,����data.txt�ļ�����
		BufferedReader br = new BufferedReader(new FileReader(new File("data.txt")));
		String line = null;
		//ѭ����ȡÿһ��
		while(null!=(line = br.readLine())) {
			//��������ÿһ����Ϣ���뵽list������
			list.add(line);
		}
		//�ر�������
		br.close();
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		//��ʾ�û�������֤��
		System.out.println("������һ����֤��");
		String code = sc.nextLine();
		if(list.contains(code)) {
			System.out.println("��֤�ɹ�");
		} else {
			System.out.println("��֤ʧ��");
		}
	}
	/**
	 * ����¼��3���ַ�����д����Ŀ��·���µ�data.txt�ļ���
	 * @throws Exception 
	 */
	private static void writeString2File() throws Exception {
		//������Ч�ַ�������������󲢺�data.txt�ļ�����
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("data.txt")));
		String line = null;
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<3;i++) {
			System.out.println("�������"+(i+1)+"���ַ�����֤��");
			//��ȡ�û�����¼���һ����֤����Ϣ
			line = sc.nextLine();
			//����ȡ����һ����֤��д�뵽�ļ���
			bw.write(line);
			//д�뻻�з�
			bw.newLine();
		}
		//�ر�������
		bw.close();
	}
}