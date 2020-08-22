package Test20;

import java.util.ArrayList;

public class CarTEST {

	public static void main(String[] args) {
		// "奔驰",780000,450、"宝马",450000,500、"奥迪",380000,400
		ArrayList<car> list=new ArrayList<car>();
		car car1=new car("奔驰",780000,450);
		list.add(car1);
		car car2=new car("宝马",450000,500);
		list.add(car2);
		car car3=new car("奥迪",380000,400);
		list.add(car3);
		ArrayList<car> list1=filter(list,500000.0,400);
		for (int i = 0; i < list1.size(); i++) {
			car cartest=list.get(i);
			System.out.println(cartest.getBrand());
			cartest.show();		
		}
	}
	public static ArrayList<car> filter(ArrayList<car> list,double price,int mile){
		ArrayList<car> list1=new ArrayList<car>();
		for (int i = 0; i < list.size(); i++) {
			car car1=list.get(i);
			if(car1.getPrice()<price  && car1.getMile()>mile) {
				list1.add(list.get(i));
			}
		}
		return list1;
	}

}
