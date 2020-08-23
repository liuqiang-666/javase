package com.itheima.level01_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 	����˵�������ļ�name.txt�е����ݡ�¬���塱�޸�Ϊ����ʷ�Ĺ�����
  		����ĿĿ¼�´����ļ�name.txt����д���������ݣ�
		it001,����,��,22
		it002,�ֳ�,��,20
		it003,¬����,��,18
		it004,ʯ��,��,23
		
		���ļ�--> ����ÿ�����ݷ�װΪStudent���� --> ��ÿ������漯���� --> �жϼ������Ƿ��С�¬���塱���о��޸�Ϊ����ʷ�Ĺ��� --> �Ѽ����е�����д�뵽�ļ���
 */
public class Task03 {
	public static void main(String[] args) throws IOException {
		//����һ��������ѧ���ļ���
		ArrayList<Student> list = new ArrayList<Student>();
		//1.���ļ�
		BufferedReader in = new BufferedReader(new FileReader("name.txt"));
		//2.����ÿ�����ݷ�װΪStudent����
		String line = null;
		while( (line = in.readLine()) != null  ){
			//it001,����,��,22
			String[] arr = line.split(",");
			//����û��ѧ���࣬����ѧ���࣬Ȼ���ٴ�������
			//Student s = new Student(id, name, sex, age);
			Student s = new Student(arr[0], arr[1], arr[2], arr[3]);
			//��ÿ������漯����
			list.add(s);
		}
		
		//3.�жϼ������Ƿ��С�¬���塱���о��޸�Ϊ����ʷ�Ĺ���
		for (int i = 0; i < list.size(); i++) {
			//1.��ȡ�����е�ÿ��Student����
			//it003,¬����,��,18
			Student s = list.get(i);
			//2.�жϷ��С�¬���塱���о��޸�Ϊ����ʷ�Ĺ���
			if (s.getName().equals("¬����")) {
				s.setName("ʷ�Ĺ�");
			}
		}
		
		//4.�Ѽ����е�����д�뵽�ļ���
		//д���ݵ��ļ���
		BufferedWriter out = new BufferedWriter(new FileWriter("name.txt"));
		//�����е�����д�뵽�ļ���
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			//it003,¬����,��,18
			line = s.getId() +","+s.getName() +","+ s.getSex() +"," + s.getAge();
			out.write(line);
			out.newLine();
			out.flush();
		}
		
		//5.�ر���
		in.close();
		out.close();
	}
}
