package com.itheima.level01_03;

//it001	�Ʋ�		��		20		1.72	
public class Student {
	private String id;//ѧ��
	private String name;//����
	private String sex;//�Ա�
	private int age;//����
	private double height;//���
	public Student() {
		super();
	}
	public Student(String id, String name, String sex, int age, double height) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
