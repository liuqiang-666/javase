package com.itheima.level02_02;

public class Task02 {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.setName("��־��");
		t.setAge(30);
		t.setContent("java�������");
		t.eat();
		t.jiangke();
		Student stu = new Student("����",18,"java�������");
		stu.eat();
		stu.study();
	}
}
