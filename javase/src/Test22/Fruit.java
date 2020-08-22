package Test22;

public class Fruit {
//	type（String 类型）、单价price（double 类型）、折扣discount（boolean 类型）
	private String type;
	private double price;
	private boolean discount;
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Fruit(String type, double price, boolean discount) {
		super();
		this.type = type;
		this.price = price;
		this.discount = discount;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isDiscount() {
		return discount;
	}
	public void setDiscount(boolean discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Fruit [type=" + type + ", price=" + price + ", discount=" + discount + "]";
	}
	
	public void show() {
		 System.out.println("水果类型=" + type + ", 价格：" + price + ", 折扣" + discount);
	}
	
	
}
