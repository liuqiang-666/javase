package com.itheima.level02_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
	�����������󣬲��ô���ʵ��
	����һ��������IOUtils�������·�����������������(���²���ֻ��Դ��ı��ļ�(.txt�ļ�))��
	1.copyFile2Dir(String srcFile,String destDir)
	    ����String srcFile:Ҫ���Ƶ�Դ�ļ�
		����String destDir:���Ʋ��������ļ��Ĵ洢·��(Ŀ��·��)
		Ҫ�󣺽�srcFile�ļ����Ƶ�destDirĿ���ļ�����(���ܸı�Դ�ļ�������)
	2.copyDir2Dir(String srcDir,String destDir)
		����File srcDir:Ҫ���Ƶ�Դ�ļ���
		����File destDir:���Ʋ��������ļ��Ĵ洢·��(Ŀ��·��)
		Ҫ�󣺽�srcDir�ļ����е������ļ�(���������ļ���)���Ƶ�destDirĿ���ļ�����(���ܸı�Դ�ļ�������)
 */
public class IOUtils {
	/*
	 * 1.copyFile2Dir(String srcFile,String destDir)
	       ����String srcFile:Ҫ���Ƶ�Դ�ļ�
		����String destDir:���Ʋ��������ļ��Ĵ洢·��(Ŀ��·��)
		Ҫ�󣺽�srcFile�ļ����Ƶ�destDirĿ���ļ�����(���ܸı�Դ�ļ�������)
	 */
	public static void copyFile2Dir(String srcFile,String destDir) throws IOException{
		//����Դ
		BufferedReader in = new BufferedReader(new FileReader(srcFile));
		//Ŀ�ĵ�
		BufferedWriter out = new BufferedWriter(new FileWriter(new File(destDir, srcFile)));
		//���ļ�������
		String line = null;
		while((line = in.readLine()) != null){
			//д���ݵ��ļ�
			out.write(line);
			out.newLine();
			out.flush();
		}
		//�ر���
		in.close();
		out.close();
	}
	
	/*
	 * 2.copyDir2Dir(String srcDir,String destDir)
		����File srcDir:Ҫ���Ƶ�Դ�ļ���
		����File destDir:���Ʋ��������ļ��Ĵ洢·��(Ŀ��·��)
		Ҫ�󣺽�srcDir�ļ����е������ļ�(���������ļ���)���Ƶ�destDirĿ���ļ�����(���ܸı�Դ�ļ�������)
	 */
	public static void copyDir2Dir(String srcDir,String destDir) throws IOException{
		File srcFile = new File(srcDir);
		File destFile = new File(destDir);
		copyDir2Dir(srcFile, destFile);
	}
	
	//�����ļ���
	public static void copyDir2Dir(File srcFile,File destFile) throws IOException{
		//����Դ�ļ��У����ÿ�����ļ������ļ���
		File[] files = srcFile.listFiles();
		for (int i = 0; i < files.length; i++) {
			File file = files[i]; //���ļ������ļ���
			File dest = new File(destFile,file.getName());//Ŀ�ĵ�·��
			//�ж����ļ������ļ���
			if (file.isDirectory()) {
				//�ļ���
				copyDir2Dir(file, dest);
			} else {
				//�ļ�
				copyFile(file, dest);
			}
		}
	}

	//�����ļ�
	public static void copyFile(File file, File dest) throws IOException {
		//����Դ
		BufferedReader in = new BufferedReader(new FileReader(file));
		//Ŀ�ĵ�
		BufferedWriter out = new BufferedWriter(new FileWriter(dest));
		//���ļ�������
		String line = null;
		while((line = in.readLine()) != null){
			//д���ݵ��ļ�
			out.write(line);
			out.newLine();
			out.flush();
		}
		//�ر���
		in.close();
		out.close();
	}
}
