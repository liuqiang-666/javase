package com.itheima.level02_02;
/*
 * ѧ����Student
		����:
			����name
			����age
			ѧϰ����content
		��Ϊ:
			�Է�eat()
			ѧϰstudy()
 */
public class Student {
	private String name;
	private int age;
	private String content;
	public void study() {
		System.out.println("����Ϊ"+age+"��"+name+"ͬѧ����ר����־������"+content+"��֪ʶ........");
	}
	public void eat() {
		System.out.println("����Ϊ"+age+"��"+name+"ͬѧ���ڳԷ�....");
	}
	
	public Student(String name, int age, String content) {
		this.name = name;
		this.age = age;
		this.content = content;
	}
	public Student() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
