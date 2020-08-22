package test19;

import java.util.ArrayList;

public class TestStudent {

	public static void main(String[] args) {
		// "张三",88,99、"李四",85,78、"王麻子",86,50
		ArrayList<Student>  list=new ArrayList<Student>();
		
		Student stu1=new Student("张三",88,99);
		list.add(stu1);
		Student stu2=new Student("李四",85,78);
		list.add(stu2);
		Student stu3=new Student("王麻子",86,50);
		list.add(stu3);
		
		ArrayList<Student>  list1=addsocer(list);
		for (int i = 0; i < list1.size(); i++) {
			Student stutest=list1.get(i);
//			System.out.println(stutest.getName());
			stutest.show();
								
		}
	}

	private static ArrayList<Student> addsocer(ArrayList<Student> list) {
		// TODO Auto-generated method stub
		ArrayList<Student>  list1=new ArrayList<Student>();
		for (int i = 0; i < list.size(); i++) {
			Student stutest=list.get(i);
			if(stutest.getEnglish()+stutest.getChinese()<170) {
				list1.add(list.get(i));
			}						
		}
		return list1;
	}

}
