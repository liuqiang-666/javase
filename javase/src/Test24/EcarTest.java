package Test24;

import java.util.ArrayList;
import java.util.Random;

public class EcarTest {
/*
 * 		品牌价格自拟，已行驶距离使用随机数生成，范围是[1-1800]
		将创建好的三个对象存入ArrayList<ECar>集合中
		查找集合中是否存在，行驶公里在1000公里以下的车，
			如果有将其信息打印在控制台(使用get方法获取数据并拼接)
			如果没有则打印[抱歉!没有满足条件的汽车]
 */
	public static void main(String[] args) {
		int count=0;
		ArrayList<Ecar> car=new ArrayList<Ecar>();
		Ecar c1=new Ecar("奔驰", 450000,new Random().nextInt(1800)+1);
		Ecar c2=new Ecar("宝马", 450000,new Random().nextInt(1800)+1);
		Ecar c3=new Ecar("大众", 450000,new Random().nextInt(1800)+1);
		car.add(c3);
		car.add(c2);
		car.add(c1);
		for (int i = 0; i < car.size(); i++) {
			Ecar c = car.get(i);
			if(c.getMile()<10) {
				count++;
				System.out.println("品牌：" + c.getBrand()+ ", 价格：" + c.getPrice() + ", 行驶" + c.getMile());
			}else {				
				continue;
		}
			
		}
		if(count==0) {
			System.out.println("[抱歉!没有满足条件的汽车]");
		}
	}

}
