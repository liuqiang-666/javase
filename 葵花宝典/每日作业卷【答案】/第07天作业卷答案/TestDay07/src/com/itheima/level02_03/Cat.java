package com.itheima.level02_03;

public class Cat {
	private String color;
	private String breed;
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
	public void eat() {
		System.out.println(color+"��"+breed+"���ڳ���.....");
	}
	public void catchMouse() {
		System.out.println(color+"��"+breed+"���ڴ�����....");
	}
}	
