package com.itheima.level02_03;

public class Dog {
	private String color;
	private String breed;
	public void eat() {
		System.out.println(color+"��"+breed+"���ڿй�ͷ.....");
	}
	public void lookHome() {
		System.out.println(color+"��"+breed+"���ڿ���");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Dog(String color, String breed) {
		this.color = color;
		this.breed = breed;
	}
	public Dog() {
	}
	
}
