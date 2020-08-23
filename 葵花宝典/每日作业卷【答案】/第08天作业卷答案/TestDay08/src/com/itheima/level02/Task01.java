package com.itheima.level02;

import java.util.Scanner;

public class Task01 {
	private static User[] userArray = new User[3];
	private static int index = 0;// ��ǰ����ɴ洢��λ�ã��������userArray.length -1��˵���û���������ֹע��
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.ע��     2.��½     3.�˳�");
			int op = sc.nextInt();
			switch (op) {
			case 1:
				regist();
				break;
			case 2:
				login();
				break;
			case 3:
				System.out.println("ллʹ�ã��ݰݣ�");
				System.exit(0);
			default:
				break;
			}
		}
	}

	// ע��
	private static void regist() {
		// ��֤�û��Ƿ�����
		if (index >= userArray.length) {
			System.out.println("�û���������ֹע�ᣡ");
			return;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û�����");
		String userName = sc.next().trim();
		System.out.println("�������¼���룺");
		String pwd = sc.next().trim();
		System.out.println("������ȷ�����룺");
		String birthDay = sc.next().trim();
		System.out.println("�����밮��(����ö��Ÿ���)��");
		String hobby = sc.next().trim();

		// ��֤ͨ����д�뵽����
		User user = new User(userName, pwd, birthDay, hobby);
		userArray[index] = user;
		// ��������1���Ա���һ�δ洢
		index++;
		// �ɹ���ʾ
		System.out.println("ע��ɹ���");
	}

	// ��¼
	private static void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������¼����");
		String userName = sc.next();
		System.out.println("���������룺");
		String pwd = sc.next();

		// ��֤
		for (int i = 0; i < userArray.length; i++) {
			if (userName.equals(userArray[i].getUsername()) && pwd.equals(userArray[i].getPassword())) {
				System.out.println("��¼�ɹ������������ĸ�����Ϣ��");
				System.out.println("�û�����" + userArray[i].getUsername() + " , ���룺" + userArray[i].getPassword() + " ,�������ڣ�" + userArray[i].getBrithday()
						+ " ,���ã�" + userArray[i].getHobby());
				return;
			}
		}
		System.out.println("��¼ʧ�ܣ��û������������");

	}
}
