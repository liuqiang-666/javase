package Test23;

import java.util.ArrayList;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	    定义方法 public static int getMinAge(ArrayList<Person> list)返回集合中最小的年龄
//	    定义方法 public static int getAvgAge(ArrayList<Person> list)返回集合中的对象平均年龄
//	    
//	    实例化三个Person对象，属性分别为："刘备",39、"关羽",35、"张飞",34
//	    将对象分别添加到合适的集合中
//	    分别测试两个方法
		ArrayList<Person> list=new ArrayList<Person>();
		Person p1=new Person("刘备",45);
		Person p2=new Person("关羽",35);
		Person p3=new Person("张飞",31);
		list.add(p3);
		list.add(p1);
		list.add(p2);
		int min=getMinAge(list);
		System.out.println("最小值"+min);
		int avg=getAvgAge(list);
		System.out.println("平均值"+avg);
	}
	public static int getMinAge(ArrayList<Person> list) {
		int min=0;
		for (int i = 0; i < list.size(); i++) {
			Person p = list.get(i);
			if(i+1==list.size()-1) {
				break;
			}else {
				min=list.get(i).getAge()<list.get(i+1).getAge()?list.get(i).getAge():list.get(i+1).getAge();
				
			}			
		}
		return min;
	}
	public static int getAvgAge(ArrayList<Person> list) {
		int avg=0;
		for (int i = 0; i < list.size(); i++) {
			Person p = list.get(i);
			avg+=p.getAge();
		}
		return avg/list.size();
	}
	
}

