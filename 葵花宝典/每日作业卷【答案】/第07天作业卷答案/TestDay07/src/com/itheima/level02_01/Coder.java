package com.itheima.level02_01;
/*
 * 	2.����Ա��Coder
		���ԣ�
			����name
			����id
			����salary
		��Ϊ��
			����work()
 */
public class Coder {

	private String name;
	private String id;
	private int salary;
	public Coder() {
	}
	public Coder(String name, String id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	//work����
	public void work(){
		System.out.println("����Ϊ"+id+"��������Ϊ"+salary+"�ĳ���Ա"+name+"����Ŭ����д�Ŵ���......");
	}

}
