package com.itheima.level02_05;
/*
 * �ֻ���Phone
	����:
		Ʒ��brand
		�۸�price
	��Ϊ:
		��绰call()
		������sendMessage()
		����ϷplayGame()
 */
public class Phone {
	private String brand;
	private int price;
	public Phone() {
	}
	public Phone(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//��绰����
	public void call() {
		System.out.println("����ʹ�ü۸�Ϊ"+price+"Ԫ��"+brand+"Ʒ�Ƶ��ֻ���绰....");
	}
//	������sendMessage()
	public void sendMessage(){
		System.out.println("����ʹ�ü۸�Ϊ"+price+"Ԫ��"+brand+"Ʒ�Ƶ��ֻ�������....");
	}
//	����ϷplayGame()
	public void playGame(){
		System.out.println("����ʹ�ü۸�Ϊ"+price+"Ԫ��"+brand+"Ʒ�Ƶ��ֻ�����Ϸ....");
	}
}
