package com.itheima.level02_02;
/*
 * 1.��ʦ��Teacher
		����:
			����name
			����age
			��������content
		��Ϊ:
			�Է�
			����
 */
public class Teacher {
	private String name;
	private int age;
	private String content;
	/**
	 * ���η���
	 */
	public void jiangke() {
		System.out.println("����Ϊ"+age+"��"+name+"��ʦ���ڿ��ܵĽ���"+content+"��֪ʶ........");
	}
	
	public void eat() {
		System.out.println("����Ϊ"+age+"��"+name+"��ʦ���ڳԷ�....");
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

	public Teacher() {
	}

	public Teacher(String name, int age, String content) {
		this.name = name;
		this.age = age;
		this.content = content;
	}
	
}
