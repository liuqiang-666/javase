package com.itheima.level02_04;

import java.util.Scanner;

/*
 * 	����˵������������ͼ��������ҳ��۸���ߵ�ͼ�鲢��ӡ��ͼ���������Ϣ��
		��ơ�ͼ���ࡱBook��Ҫ�����������ԣ�
		ͼ���ţ�
		������
		�۸�
 */
public class Task04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ�������Ϣ��");
		System.out.println("ͼ���ţ�");
		String bookNo = sc.nextLine();
		System.out.println("������");
		String title = sc.nextLine();
		System.out.println("ISBN�룺");
		String isbn = sc.nextLine();
		System.out.println("�۸�");
		double price = sc.nextDouble();
		System.out.println("�������ڣ�");
		String publicationDate = sc.nextLine();
		
		Book b1 = new Book(bookNo,title,isbn,price,publicationDate);
		System.out.println("**********************************");
		System.out.println("������ڶ��������Ϣ��");
		System.out.println("ͼ���ţ�");
		bookNo = sc.nextLine();
		System.out.println("������");
		title = sc.nextLine();
		System.out.println("ISBN�룺");
		isbn = sc.nextLine();
		System.out.println("�۸�");
		price = sc.nextDouble();
		System.out.println("�������ڣ�");
		publicationDate = sc.nextLine();
		
		Book b2 = new Book(bookNo,title,isbn,price,publicationDate);
		System.out.println("**********************************");
		
		System.out.println("����������������Ϣ��");
		System.out.println("ͼ���ţ�");
		bookNo = sc.nextLine();
		System.out.println("������");
		title = sc.nextLine();
		System.out.println("ISBN�룺");
		isbn = sc.nextLine();
		System.out.println("�۸�");
		price = sc.nextDouble();
		System.out.println("�������ڣ�");
		publicationDate = sc.nextLine();
		
		Book b3 = new Book(bookNo,title,isbn,price,publicationDate);
		System.out.println("**********************************");
		
		
		Book b = b1;//�ȴ洢��һ��������ã�
		
		//�ж�b�ļ۸��Ƿ����b2�ļ۸�ʵ���Ͼ����жϵ�һ����ļ۸�͵ڶ�����ļ۸�
		if(b2.getPrice() > b.getPrice()){
			b = b2;
		}
		
		//�ж�b�ļ۸��Ƿ����b3�ļ۸�
		if(b3.getPrice() > b.getPrice()){
			b = b3;
		}
		
		System.out.println("�������ǣ�" + b.getBookNo() + "," + 
							b.getTitle() + "," + b.getIsbn() + "," + 
							b.getPrice() + "," + b.getPublicationDate());
		
	}
}
