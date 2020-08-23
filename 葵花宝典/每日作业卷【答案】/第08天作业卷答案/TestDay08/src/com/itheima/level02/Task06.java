package com.itheima.level02;
/*
 * 分析以下需求，并用代码实现
	1.定义如下方法public static String getPropertyGetMethodName(String property)
		功能描述:
			(1)该方法的参数为String类型，表示用户给定的成员变量的名字，返回值类型为String类型，返回值为成员变量对应的get方法的名字
			(2)如：用户调用此方法时给定的参数为"name",该方法的返回值为"getName"
	2.定义如下方法public static String getPropertySetMethodName(String property)
		功能描述:
			(1)该方法的参数为String类型，表示用户给定的成员变量的名字，返回值类型为String类型，返回值为成员变量对应的set方法的名字
			(2)如：用户调用此方法时给定的参数为"name",该方法的返回值为"setName"
 */
public class Task06 {
	public static void main(String[] args) {
		String property = "name";
		String getPropertyMethodName = getPropertyGetMethodName(property);
		String setPropertyMethodName = getPropertySetMethodName(property);
		System.out.println(getPropertyMethodName);
		System.out.println(setPropertyMethodName);
	}
	public static String getPropertyGetMethodName(String property) {
		//property.substring(0, 1).toUpperCase():将属性的第一个字母变成大写
		//property.substring(1):获取属性的第一个字母之后的内容(不包含第一个字母)
		//"get"+....:前面拼接get
		return "get"+ property.substring(0, 1).toUpperCase()+property.substring(1);
	}
	public static String getPropertySetMethodName(String property) {
		//property.substring(0, 1).toUpperCase():将属性的第一个字母变成大写
		//property.substring(1):获取属性的第一个字母之后的内容(不包含第一个字母)
		//"set"+....:前面拼接set
		return "set"+ property.substring(0, 1).toUpperCase()+property.substring(1);
	}
}
