package com.itheima.level01_01;
/*
 *  * Course(�γ���)
 * 		�γ̱��	����		����ʱ��		�γ�����
 * 		id		name	createtime	desc
 * 		�ṩ���췽����get��set����
 * 
		s001	Java	2007-02-08	Javaѧ�ƣ�����JavaSE��JavaEE
		s002	IOS		2007-02-09	IOSϵͳ����
 */
public class Course {
	private String id;
	private String name;
	private String createtime;
	private String desc;
	//�ṩ���췽����get��set����
	public Course() {
		super();
	}
	public Course(String id, String name, String createtime, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.createtime = createtime;
		this.desc = desc;
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
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
