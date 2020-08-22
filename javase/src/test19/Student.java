package test19;

public class Student {
	private String name;
	private int english;
	private int chinese;
	public Student() {
		super();
		
	}
	public Student(String name, int english, int chinese) {
		super();
		this.name = name;
		this.english = english;
		this.chinese = chinese;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getChinese() {
		return chinese;
	}
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", english=" + english + ", chinese=" + chinese + "]";
	}
	public void show() {
		System.out.println("姓名："+name+",英语："+english+",语文"+chinese);
	}
	
}
