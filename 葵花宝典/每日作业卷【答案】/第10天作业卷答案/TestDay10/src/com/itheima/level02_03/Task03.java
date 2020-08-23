package com.itheima.level02_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * �����⣺�����������󣬲��ô���ʵ��
	��Ŀ��·�����и�questions.txt�ļ��������£�
		5+5
		150-25
		155*155
		2555/5
	Ҫ�󣺶�ȡ���ݼ��������������д�뵽results.txt�ļ���
		5+5=10
		//....
	˼��:���˵��ȡquestions.txt�ļ�������,���������,��д��questions.txt�ļ�,������д�Ĳ���ʱ���ͬһ���ļ�,Ӧ����β���
	
	��ΰ��ַ���ת������
	
	˼·��
		1.�������������󣬶�ȡÿһ�����롣ÿ��ȡһ�У��ͷ��뵽�����С�
		2.�������ϣ��ó�ÿһ��ʽ�ӡ��ж����ʽ���а����ĸ���������������+��ִ�мӷ����������-��ִ��-����
		3.Ȼ��Ѽ�����Ľ�����滻��������
		4.�Ѽ����е�����д�뵽�ļ���
	
 */
public class Task03 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader("questions.txt"));
		String line = null;
		//��ȡ���ݷ��뼯��
		while((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();
		//��������
		for(int i = 0 ; i < list.size(); i++) {
			//���ó�ÿһ��ʽ��
			String shiZi = list.get(i);
			int result = getResult(shiZi);
			list.set(i, shiZi + "=" + result);
		}
		//�Ѽ����е�����д�뵽�ļ���
		BufferedWriter bw = new BufferedWriter(new FileWriter("results.txt"));
		for(int i = 0; i < list.size(); i++) {
			bw.write(list.get(i));
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
	/*
	 * "1"
	 * ���ַ���ת�����ֲ�����
	 */
	public static int parseInt(String str) {
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			int num = str.charAt(i) - 48;
			sum = sum * 10 + num;
		}
		return sum;
	}
	/*
	 * ����ʽ�Ӽ������Ӧ�Ľ��                      
	 */
	public static int getResult(String shiZi) {//5+5
		//�ж��Ƿ����
		if(shiZi.contains("+")) {
			//ִ�мӷ�
			//��substring���н�ȡ
			int index = shiZi.indexOf("+");
			String num1 = shiZi.substring(0,index);
			String num2 = shiZi.substring(index + 1);
			//�������ַ������͵�����ת��int���㲢����
			return parseInt(num1) + parseInt(num2);
		} else if(shiZi.contains("-")) {
			int index = shiZi.indexOf("-");
			String num1 = shiZi.substring(0,index);
			String num2 = shiZi.substring(index + 1);
			return parseInt(num1) - parseInt(num2);
		} else if(shiZi.contains("*")) {
			int index = shiZi.indexOf("*");
			String num1 = shiZi.substring(0,index);
			String num2 = shiZi.substring(index + 1);
			return parseInt(num1) * parseInt(num2);
		} else {//���ǰ���ֲ�����϶��ǳ���
			int index = shiZi.indexOf("/");
			String num1 = shiZi.substring(0,index);
			String num2 = shiZi.substring(index + 1);
			return parseInt(num1) / parseInt(num2);
		}
	}
}
