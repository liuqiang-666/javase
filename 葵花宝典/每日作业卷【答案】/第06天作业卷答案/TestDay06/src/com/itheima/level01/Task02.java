package com.itheima.level01;
/*
 * �����5λ���Ļ�������7λ���Ļ���������˶��ٸ�
 */
public class Task02 {
	public static void main(String[] args) {
		//1. �����5λ���Ļ����� �ж��ٸ�
		int count5 = get5Count();
		//2. �����7λ���Ļ����� �ж��ٸ�
		int count7 = get7Count();
		//3. ����˶��ٸ�
		System.out.println("����˶��ٸ�:" + (count7 - count5));
	}
	
	/*
	 * �����5λ���Ļ����� �ж��ٸ�
	 * ָ�����������ƣ� get5Count
	 * ָ�������Ĳ����� ��
	 * ָ�������ķ���ֵ�� int
	 */
	public static int get5Count(){
		int count = 0;//��¼5λ���Ļ���������
		//12321
		for (int i = 10000; i <= 99999; i++) {
			//�ֱ��ȡ��ʮ��ǧ��λ������
			int g = i % 10;
			int s = i / 10 %10;
			int b = i / 100 % 10;
			int q = i / 1000 % 10;
			int w = i / 10000 % 10;
			if (g==w && s==q) {
				//5λ���Ļ����� + 1
				count++;
			}
		}
		return count;
	}
	
	/*
	 * �����7λ���Ļ����� �ж��ٸ�
	 * ָ�����������ƣ� get7Count
	 * ָ�������Ĳ����� ��
	 * ָ�������ķ���ֵ�� int
	 */
	public static int get7Count(){
		int count = 0;//��¼7λ���Ļ���������
		//1234321
		for (int i = 1000000; i <= 9999999; i++) {
			//�ֱ��ȡ����ʮ���١�ǧ����ʮ�򡢰���λ������
			int g = i % 10;
			int s = i / 10 %10;
			int b = i / 100 % 10;
			int q = i / 1000 % 10;
			int w = i / 10000 % 10;
			int sw = i / 100000 % 10;
			int bw = i / 1000000 % 10;
			if (g==bw && s==sw && b==w) {
				//7λ���Ļ����� + 1
				count++;
			}
		}
		return count;
	}
}
