package com.itheima.level02_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 分析以下需求，并用代码实现
	1.将e:\\a.txt复制到d:\\根目录下
	2.用多种方式实现复制
		(1)使用字符流单字符循环复制
		(2)使用字符流利用字符数组实现复制
		(3)使用高效字符缓冲流实现复制
 */
public class Task05 {
	public static void main(String[] args) throws IOException {
		//创建源文件
		File srcFile = new File("e:\\a.txt");
		//创建目标文件夹
		File destDir = new File("d:\\");
		//copyFile2Dir01(srcFile,destDir);
		//copyFile2Dir02(srcFile,destDir);
		copyFile2Dir03(srcFile,destDir);
	}
	//(1)使用字符流单字符循环复制
	public static void copyFile2Dir01(File srcFile,File destDir) throws IOException {
		//创建文件字符输入流对象fr,并和srcFile文件关联
		FileReader fr = new FileReader(srcFile);
		//创建文件字符输出流对象fw,并和目标文件(destDir\\srcFile)关联
		//new File(destDir, srcFile.getName()):在目标文件夹destDir下建立新的文件,文件名和源文件名称相同
		FileWriter fw = new FileWriter(new File(destDir, srcFile.getName()));
		int b = -1;
		while((b = fr.read())!=-1) {
			fw.write(b);
		}
		//关流
		fr.close();
		fw.close();		
	}
	//(2)使用字符流利用字符数组实现复制
	public static void copyFile2Dir02(File srcFile,File destDir) throws IOException {
		//创建文件字符输入流对象fr,并和srcFile文件关联
		FileReader fr = new FileReader(srcFile);
		//创建文件字符输出流对象fw,并和目标文件(destDir\\srcFile)关联
		//new File(destDir, srcFile.getName()):在目标文件夹destDir下建立新的文件,文件名和源文件名称相同
		FileWriter fw = new FileWriter(new File(destDir, srcFile.getName()));
		//定义字符数组
		char[] chars = new char[1024];
		//定义长度
		int len = -1;
		while((len = fr.read(chars))!=-1) {//从fr所关联的文件中每次读取一些字符，并存入字符数组chars中
			//确保每次读取的字符数量和写入的数量是一致的
			fw.write(chars,0,len);//将chars中存储的内容写入到fw所关联的文件中，0表示：开始索引，len表示写入多少个
		}
		//关流
		fr.close();
		fw.close();		
	}
	//(3)使用高效字符缓冲流实现复制
	public static void copyFile2Dir03(File srcFile,File destDir) throws IOException {
		//创建高效字符输入缓冲流对象br,并和srcFile文件关联
		BufferedReader br = new BufferedReader(new FileReader(srcFile));
		//创建文件字符输出流对象fw,并和目标文件(destDir\\srcFile)关联
		//new File(destDir, srcFile.getName()):在目标文件夹destDir下建立新的文件,文件名和源文件名称相同
		//创建高效字符输出缓冲流对象br,并和目标文件(destDir\\srcFile)关联
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(destDir, srcFile.getName())));
		int b = -1;
		while((b = br.read())!=-1) {
			bw.write(b);
		}
		//关流
		br.close();
		bw.close();		
	}
}











