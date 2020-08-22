package Test24;

public class Ecar {
/*
 * 
	定义ECar类属性有：
		brand品牌String、price价格double、km已行驶距离int
		提供空参、带参构造
		提供getXxx()、setXxx()方法
 */
	private String brand;
	private double price;
	private int mile ;
	public Ecar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMile() {
		return mile;
	}
	public void setMile(int mile) {
		this.mile = mile;
	}
	public Ecar(String brand, double price, int mile) {
		super();
		this.brand = brand;
		this.price = price;
		this.mile = mile;
	}
	@Override
	public String toString() {
		return "Ecar [brand=" + brand + ", price=" + price + ", mile=" + mile + "]";
	}
	public void show() {
		System.out.println("品牌；" + brand + ", 价格：" + price + ", 行驶" + mile);
	}
}
