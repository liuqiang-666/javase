package com.itheima.level02_01;
/*
 * ���ԣ�
			����name
			����id
			����salary
			����bonus
		��Ϊ��
			����work()
 */
public class Manager {
	private String name;
	private String id;
	private int salary;
	private int bonus;
	public Manager() {
	}
	public Manager(String name, String id, int salary, int bonus) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.bonus = bonus;
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
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	//work����
	public void work(){
		System.out.println("����Ϊ"+id+"��������Ϊ"+salary+"����Ϊ"+bonus+"����Ŀ����"+name+"����Ŭ�������Ź�����,��������,���Ա���ύ�����Ĵ���.....");
	}
}











