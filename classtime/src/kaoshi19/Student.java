package kaoshi19;

public class Student {
//成员属性(属性名为name和score)，满参构造方法
	private String name;   //第一题
	private int score;   //第一题
//2个属性的get/set方法
	public Student() {
	
		
	}
	
	public Student(String name, int score) {
		
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

}

