package com.itheima.level01_01;
/*
 * 	Teacher(��ʦ��)
 * 		��ʦ���	����		�Ա�		����		��Ŀ
 * 		id		name	sex		age		course
 * 		�ṩ���췽����get��set����
 * 
 * 		t001	Ѧ֮ǫ	��		26		Java
		t002	�ű̳�	Ů		24		IOS
		t003	�Ž�		��		28		Java
 */
public class Teacher {
	//��Ա����
	private String id;
	private String name;
	private String sex;
	private int age;
	private String cource;
	//���췽��
	public Teacher() {
		super();
	}
	public Teacher(String id, String name, String sex, int age, String cource) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.cource = cource;
	}
	//get��set����
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
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	

	
}
