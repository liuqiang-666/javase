package com.itheima.level02_04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/*
 * �����������󣬲��ô���ʵ��
	��Ŀ��·������text.txt�ļ����������£�
	�Ұ�����
	123456
	����IO����֪ʶ��ȡtext.txt�ļ������ݷ�ת��д��text.txt�ļ��У��������£�
	123456
	�Ұ�����

	
	˼·
		�������ϣ���ȡ���ݷ��뼯��
		��ת����
		�Ѽ�������д��Դ�ļ�
 */
public class Task04 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader("text.txt"));
		String line;
		while((line = br.readLine()) != null) {
			//ÿ��ȡһ�з��뼯��
			list.add(line);
		}
		br.close();
		//��ת����
//		for(int i = 0; i < list.size()/2;i++) {
//			//��һ�������һ�������ڶ����͵����ڶ�������
//			String temp = list.get(i);
//			//������һ����ֵ����һ��Ԫ��
//			list.set(i, list.get(list.size() - 1 -i));
//			list.set(list.size() - 1 -i, temp);
//		}
		Collections.reverse(list);
//		Collections.sort(list);
		BufferedWriter bw = new BufferedWriter(new FileWriter("text.txt"));
		for(int i = 0; i < list.size(); i++) {
			bw.write(list.get(i));
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}












