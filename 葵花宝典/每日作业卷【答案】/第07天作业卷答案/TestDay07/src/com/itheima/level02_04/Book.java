package com.itheima.level02_04;

public class Book {
	private String bookNo;//ͼ����
	private String title;//����
	private String isbn;//ISBN����
	private double price;//�۸�
	private String publicationDate;//��������
	public Book(String bookNo, String title, String isbn, double price, String publicationDate) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		this.publicationDate = publicationDate;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBookNo() {
		return bookNo;
	}
	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	
}
