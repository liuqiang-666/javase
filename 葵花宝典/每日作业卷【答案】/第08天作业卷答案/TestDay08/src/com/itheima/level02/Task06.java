package com.itheima.level02;
/*
 * �����������󣬲��ô���ʵ��
	1.�������·���public static String getPropertyGetMethodName(String property)
		��������:
			(1)�÷����Ĳ���ΪString���ͣ���ʾ�û������ĳ�Ա���������֣�����ֵ����ΪString���ͣ�����ֵΪ��Ա������Ӧ��get����������
			(2)�磺�û����ô˷���ʱ�����Ĳ���Ϊ"name",�÷����ķ���ֵΪ"getName"
	2.�������·���public static String getPropertySetMethodName(String property)
		��������:
			(1)�÷����Ĳ���ΪString���ͣ���ʾ�û������ĳ�Ա���������֣�����ֵ����ΪString���ͣ�����ֵΪ��Ա������Ӧ��set����������
			(2)�磺�û����ô˷���ʱ�����Ĳ���Ϊ"name",�÷����ķ���ֵΪ"setName"
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
		//property.substring(0, 1).toUpperCase():�����Եĵ�һ����ĸ��ɴ�д
		//property.substring(1):��ȡ���Եĵ�һ����ĸ֮�������(��������һ����ĸ)
		//"get"+....:ǰ��ƴ��get
		return "get"+ property.substring(0, 1).toUpperCase()+property.substring(1);
	}
	public static String getPropertySetMethodName(String property) {
		//property.substring(0, 1).toUpperCase():�����Եĵ�һ����ĸ��ɴ�д
		//property.substring(1):��ȡ���Եĵ�һ����ĸ֮�������(��������һ����ĸ)
		//"set"+....:ǰ��ƴ��set
		return "set"+ property.substring(0, 1).toUpperCase()+property.substring(1);
	}
}
