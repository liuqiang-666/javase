package com.itheima.level02_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * �����������󣬲��ô���ʵ��
	1.��Ŀ��Ŀ¼�½����ļ��� user.txt���ļ��д���û����͵�¼���룬��ʽ���û���������,�磺aaa,123��
	2. user.txt�ļ��г�ʼ��ŵ��û���Ϣ�����£�
		jack,123
		rose,123
		tom,123
	3.Ҫ��������¹��ܣ�
	  ��������ʱ������̨��ʾ�û�����ע����û��������룻
	   ��֤����¼����û�����user.txt����ע����û����Ƿ��ظ���
	   �ǣ�����̨��ʾ���û����Ѵ���
	   �񣺽�����¼����û���������д��user.txt�ļ������ڿ���̨��ʾ��ע��ɹ���
	   
	  ˼·��
	  	1.�����û���������
	  	2.����һ����������ж��û��Ƿ�ע�������ʼֵfalse
	  	3.��ȡ�ļ����Ѷ�ȡ����ÿһ���û���������������û������Ƚϣ������ȣ��Ͱѱ�Ǹ�Ϊtrue
	  	4.�жϱ�ǣ�������Ϊtrue�������Ѿ�ע����ˣ��ʹ�ӡ�û����Ѵ��ڣ����򣬰��û�����������д�뵽user.txt
 */
public class Task02 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û���");
		String username = sc.nextLine();
		System.out.println("����������");
		String password = sc.nextLine();
		//������
		boolean flag = false;
//		��ȡ�ļ����Ѷ�ȡ����ÿһ���û���������������û������Ƚϣ������ȣ��Ͱѱ�Ǹ�Ϊtrue
		BufferedReader br = new BufferedReader(new FileReader("user.txt"));
		String line = null;
		//ѭ����
		while((line = br.readLine()) != null) {
			/*//���ݶ��ŷָ��û���������
			String[] strArr = line.split(",");
			//ÿһ���û���������������û������Ƚ�
			if(username.equals(strArr[0])) {
				flag = true;
			}*/
			//�õ��������ڵ�����
			int index = line.indexOf(",");
			//��ȡ�û���
			String user = line.substring(0, index);
			if(username.equals(user)) {
				flag = true;
			}
		}
		br.close();
		//�жϱ�ǣ�������Ϊtrue�������Ѿ�ע����ˣ��ʹ�ӡ�û����Ѵ��ڣ����򣬰��û�����������д�뵽user.txt
		if(flag) {
			System.out.println("������˼�û����Ѿ�����");
		} else {
			//���û�����������д�뵽user.txt
			BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt",true));
			//����
			bw.newLine();
			//д���û���������
			bw.write(username+","+password);
			bw.flush();
			bw.close();
			System.out.println("�û���������ע��ɹ�");
		}
	}
}









