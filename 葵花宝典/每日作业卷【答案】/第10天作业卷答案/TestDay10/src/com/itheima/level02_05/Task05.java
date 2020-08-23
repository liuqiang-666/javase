package com.itheima.level02_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �����������󣬲��ô���ʵ��
	1.��e:\\a.txt���Ƶ�d:\\��Ŀ¼��
	2.�ö��ַ�ʽʵ�ָ���
		(1)ʹ���ַ������ַ�ѭ������
		(2)ʹ���ַ��������ַ�����ʵ�ָ���
		(3)ʹ�ø�Ч�ַ�������ʵ�ָ���
 */
public class Task05 {
	public static void main(String[] args) throws IOException {
		//����Դ�ļ�
		File srcFile = new File("e:\\a.txt");
		//����Ŀ���ļ���
		File destDir = new File("d:\\");
		//copyFile2Dir01(srcFile,destDir);
		//copyFile2Dir02(srcFile,destDir);
		copyFile2Dir03(srcFile,destDir);
	}
	//(1)ʹ���ַ������ַ�ѭ������
	public static void copyFile2Dir01(File srcFile,File destDir) throws IOException {
		//�����ļ��ַ�����������fr,����srcFile�ļ�����
		FileReader fr = new FileReader(srcFile);
		//�����ļ��ַ����������fw,����Ŀ���ļ�(destDir\\srcFile)����
		//new File(destDir, srcFile.getName()):��Ŀ���ļ���destDir�½����µ��ļ�,�ļ�����Դ�ļ�������ͬ
		FileWriter fw = new FileWriter(new File(destDir, srcFile.getName()));
		int b = -1;
		while((b = fr.read())!=-1) {
			fw.write(b);
		}
		//����
		fr.close();
		fw.close();		
	}
	//(2)ʹ���ַ��������ַ�����ʵ�ָ���
	public static void copyFile2Dir02(File srcFile,File destDir) throws IOException {
		//�����ļ��ַ�����������fr,����srcFile�ļ�����
		FileReader fr = new FileReader(srcFile);
		//�����ļ��ַ����������fw,����Ŀ���ļ�(destDir\\srcFile)����
		//new File(destDir, srcFile.getName()):��Ŀ���ļ���destDir�½����µ��ļ�,�ļ�����Դ�ļ�������ͬ
		FileWriter fw = new FileWriter(new File(destDir, srcFile.getName()));
		//�����ַ�����
		char[] chars = new char[1024];
		//���峤��
		int len = -1;
		while((len = fr.read(chars))!=-1) {//��fr���������ļ���ÿ�ζ�ȡһЩ�ַ����������ַ�����chars��
			//ȷ��ÿ�ζ�ȡ���ַ�������д���������һ�µ�
			fw.write(chars,0,len);//��chars�д洢������д�뵽fw���������ļ��У�0��ʾ����ʼ������len��ʾд����ٸ�
		}
		//����
		fr.close();
		fw.close();		
	}
	//(3)ʹ�ø�Ч�ַ�������ʵ�ָ���
	public static void copyFile2Dir03(File srcFile,File destDir) throws IOException {
		//������Ч�ַ����뻺��������br,����srcFile�ļ�����
		BufferedReader br = new BufferedReader(new FileReader(srcFile));
		//�����ļ��ַ����������fw,����Ŀ���ļ�(destDir\\srcFile)����
		//new File(destDir, srcFile.getName()):��Ŀ���ļ���destDir�½����µ��ļ�,�ļ�����Դ�ļ�������ͬ
		//������Ч�ַ��������������br,����Ŀ���ļ�(destDir\\srcFile)����
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(destDir, srcFile.getName())));
		int b = -1;
		while((b = br.read())!=-1) {
			bw.write(b);
		}
		//����
		br.close();
		bw.close();		
	}
}











