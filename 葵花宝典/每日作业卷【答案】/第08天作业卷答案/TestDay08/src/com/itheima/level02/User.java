package com.itheima.level02;

public class User {
	private String username;//�û���
	private String password;//�û�����
	private String brithday;//��������
	private String hobby;//����
	public User() {
		super();
	}
	public User(String username, String password, String brithday, String hobby) {
		super();
		this.username = username;
		this.password = password;
		this.brithday = brithday;
		this.hobby = hobby;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBrithday() {
		return brithday;
	}
	public void setBrithday(String brithday) {
		this.brithday = brithday;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	
}
