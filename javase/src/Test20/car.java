package Test20;

public class car {
//	属性有：品牌brand(String类型)、价格price(double类型)、续航mile(int类型)
//    提供空参、带参构造
//    提供getXxx()、setXxx()方法
	private String brand;
	private double price;
	private int mile;
	
	public car() {
	super();
	}

	public car(String brand, double price, int mile) {
		super();
		this.brand = brand;
		this.price = price;
		this.mile = mile;
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

	@Override
	public String toString() {
		return "car [brand=" + brand + ", price=" + price + ", mile=" + mile + "]";
	}
	public void show() {
		System.out.println("品牌："+brand+",价格："+price+",续航"+mile);
	}
	
}
