package Test25;

public class Movie {
/*
 * 	设计一个Movie类，私有成员变量：
		title片名、director导演、type类型
		提供空参、带参构造
    	提供getXxx()、setXxx()方法
 */
	private String title;
	private String director;
	private String type;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String title, String director, String type) {
		super();
		this.title = title;
		this.director = director;
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", type=" + type + "]";
	}
	
}
