package com.itheima.level02;
/*
 * ����һ����������һ��int�������飬������������ÿһ�����ּ�����ֵĸ���
	���� ��������[1,2,2,2,3,3,4,4,4,4]  
		��ӡ�����
			����1������1��
			����2������3�Ρ�
			
			
	�磺ԭ���飺		 int[] arr =   {1,2,2,2,3,3,4,4,4,4,22,0,0}  
	 	��¼���ֵ�Ԫ��	 int[] ele =   {1,2,3,4,22,0}
	 	��¼Ԫ�س��ֵĴ���  int[] count = {1,3,2,4, 1,2}
 */
public class Task02 {
	
	public static void main(String[] args) {
		int[] arr = {1,2,2,2,3,3,4,4,4,4,22,0,0};
		
		int[] ele = new int[arr.length];//��¼���ֵ�Ԫ��
		ele[0] = arr[0]; //����1
		int index = 1; //�Ѵ浽ele������Ԫ������
		
		int[] count = new int[arr.length];//��¼Ԫ�س��ֵĸ���
		count[0] = 1; //��¼����1��
		
		for (int i = 1; i < arr.length; i++) {
			int element = arr[i];
			//����elementԪ����ele�������Ƿ����
			//���ڣ���Ԫ�س��ָ���+1�� 
			boolean isFind = false; 
			for (int j = 0; j < index; j++) {
				if (ele[j] == element) {
					isFind = true;//˵�����ҵ�
					count[j]++;//���ִ���+1
				}
			}
			if (!isFind) {//��������ڣ���Ԫ�ش��ele�����У�������Ԫ�س��ָ���Ϊ1
				ele[index] = element;
				count[index] = 1;
				index++;
			}
		}
		
		//��ӡ�����
		for (int i = 0; i < index; i++) {
			//����1������1��
			System.out.println("����"+ele[i]+"������"+count[i]+"��");
		}
	} 
}
