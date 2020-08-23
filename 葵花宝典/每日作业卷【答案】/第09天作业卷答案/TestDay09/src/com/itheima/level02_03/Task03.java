package com.itheima.level02_03;

import java.util.ArrayList;

/*
		分析以下需求，并用代码实现
		1.定义ArrayList集合，存入多个字符串
		   如:"ab1" "123ad"  "bca" "dadfadf"  "dddaaa"  "你好啊"  "我来啦"  "别跑啊"
		2.遍历集合,删除长度大于5的字符串,打印删除后的集合对象
			提示:可以将原集合中所有长度大于5的字符串放入到新集合中,遍历新集合,新集合中的元素就是要删除的元素
			
		3.基于上一步,删除集合中元素包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
			提示:
				(1)定义public static boolean myContains(String str)方法
					功能:
						判断str中是否包含0到9的数字
						包含:返回true
						不包含:返回false
				(2)遍历原集合利用myContains方法将所有包含0-9的字符串放入新集合中
				(3)新集合中的元素就是要删除的元素
 */
public class Task03 {
	
	public static void main(String[] args) {
		ArrayList<String> list = getArrayList();
		//删除集合中长度大于5的元素
		delStrsFromList01(list);
		System.out.println(list);
		//删除集合中元素中包含0到9之间数字的元素
		delStrsFromList02(list);
		System.out.println(list);
	}

	//返回存储多个字符串的ArrayList集合
	private static ArrayList<String> getArrayList() {
		ArrayList<String> list = new ArrayList<>();
		list.add("ab1");
		list.add("123ad");
		list.add("bca");
		list.add("dadfadf");
		list.add("dddaaa");
		list.add("你好啊");
		list.add("我来啦");
		list.add("别跑啊");
		return list;
	}
	
	//判断字符串中是否包含0到9的数字
	public static boolean contains(String str) {
		//遍历字符串
		for(int i = 0;i<str.length();i++) {
			//获取当前字符
			char ch = str.charAt(i);
			//只要有一个字符是0-9的数字就返回true
			if(ch>='0'&&ch<='9')
				return true;
		}
		//字符串中一个0-9的字符都没有返回false
		return false;
	}
	
	//删除list集合中所有长度>5的字符串
	private static void delStrsFromList01(ArrayList<String> list) {
		//创建ArrayList集合对象
		ArrayList<String> newList =  new ArrayList<String>();
		//遍历原集合对象
		for(int i = 0;i<list.size();i++) {
			//获取当前元素
			String str = list.get(i);
			//如果str的长度大于等于5
			if(str.length()>5) {
				newList.add(str);//将str添加到新集合中
			}
		}
		//遍历新集合
		for(Object str : newList) {
			//因为新集合中的元素就是要删除的元素
			list.remove(str);
		}
//		System.out.println(list);
	}
	//删除集合中元素包含0-9数字的字符串
	private static void delStrsFromList02(ArrayList<String> list) {
		ArrayList<String> newList =  new ArrayList<String>();
		for(int i = 0;i<list.size();i++) {
			String str = list.get(i);
			if(contains(str)) {
				newList.add(str);
			}
		}
		for(Object str : newList) {
			list.remove(str);
		}
	}
	
}
