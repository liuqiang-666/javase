package Test22;

import java.util.ArrayList;

public class FruitTest {

	public static void main(String[] args) {
		// "苹果",14,false、"柑橘",6,true、"香蕉",8,false、"桃子",6,true）
		ArrayList<Fruit> list =new ArrayList<Fruit>();
		Fruit f1=new Fruit("苹果",14,false);
		Fruit f2=new Fruit("柑橘",6,true);
		Fruit f3=new Fruit("香蕉",8,false);
		Fruit f4=new Fruit("桃子",6,true);
		list.add(f1);
		list.add(f2);
		list.add(f3);
		list.add(f4);
		int sum=0;
		for (int i = 0; i < list.size(); i++) {
			Fruit f = list.get(i);
			if(f.isDiscount()==true) {
				sum+=f.getPrice()/2;
			}else {
				sum+=f.getPrice();
			}
			
		}
		System.out.println("全部水果购买一斤需要花费："+sum+"元");
		
	}

}
