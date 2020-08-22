package Test21;

public class User {
	private String name;
	private int age;
	private String like;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, int age, String like) {
		super();
		this.name = name;
		this.age = age;
		this.like = like;
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
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", like=" + like + "]";
	}
	public void show() {
		System.out.println("姓名："+ name +",年龄："+ age+",爱好："+like);
	}
	
	
}
