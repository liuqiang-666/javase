package com.itheima.level01;
/*
 * 	����һ������������ָ�������������г��ֵ�λ��(�����ֶ�Σ���δ�ӡ)
	��: 	����[1232]Ҫ���ҵ�����2 �򷽷��ڲ����ӡ����ֵ 1 ,3 
		����[1232]Ҫ���ҵ�����5 �򷽷�ÿ�����ӡ ��������û��������֡�
 */
public class Task04 {
	public static void main(String[] args) {
		//1.ָ������
		int[] arr = {1,2,3,2};
		//2.ָ��Ҫ���ҵ�����
		//int key = 2;
		int key = 5;
		//3.����ָ�������������г��ֵ�λ��
		getIndex(arr, key);
	}
	
	/*
	 * ����ָ�������������г��ֵ�λ��
	 * ָ�����������ƣ�getIndex
	 * ָ�������Ĳ�����int[] arr, int key
	 * ָ�������ķ���ֵ��void
	 */
	public static void getIndex(int[] arr, int key){
		boolean isFind = false; //��¼���������Ƿ��ҵ���key
		
		//����[1232]Ҫ���ҵ�����2 �򷽷��ڲ����ӡ����ֵ 1 ,3 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.print(i + "  ");
				//����isFind��ֵΪtrue
				isFind = true;
			}
		}
		//����[1232]Ҫ���ҵ�����5 �򷽷�ÿ�����ӡ ��������û��������֡�
		//1.����һ��boolean��������¼�Ƿ��ҵ���key , �ҵ���Ϊtrue�� û�ҵ�Ϊfalse
		//2.ͨ��ѭ���ж��Ƿ��ҵ���key�����ҵ��˰ѱ�������Ϊtrue
		//3.ѭ�������󣬸���boolean������ֵ����Ϊfalse��˵����������û��������֡�
		if (!isFind) {
			System.out.println("������û���������");
		}
	}

}
