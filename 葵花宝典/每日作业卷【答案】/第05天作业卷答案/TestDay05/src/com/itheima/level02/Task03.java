package com.itheima.level02;

/*
 * �����������󣬲��ô���ʵ��
	1.����һ������equals(int[] arr1,int[] arr2),����:�Ƚ����������Ƿ����(���Ⱥ����ݾ��������Ϊ������������ͬ��)
	2.����һ������fill(int[] arr,int value),����:������arr�е�����Ԫ�ص�ֵ��Ϊvalue
	3.����һ������fill(int[] arr,int fromIndex,int toIndex,int value),����:������arr�е�Ԫ�ش�����fromIndex��ʼ��toIndex(������toIndex)��Ӧ��ֵ��Ϊvalue
	4.����һ������copyOf(int[] arr, int newLength),����:������arr�е�newLength��Ԫ�ؿ�������������,���������鷵��,������Ϊ0��ʼ
	5.����һ������copyOfRange(int[] arr,int from, int to),����:������arr�д�����from(����from)��ʼ������to����(������to)��Ԫ�ظ��Ƶ���������,���������鷵��
 */
public class Task03 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 1, 2, 3, 5 };
		// boolean b = equals(arr1, arr2);
		// System.out.println(b);
		// fill(arr2, 5);
		// for(int i = 0; i < arr2.length; i++) {
		// System.out.println(arr2[i]);
		// }
		// fill(arr2, 1, 3, 6);
		// for(int i = 0; i < arr2.length; i++) {
		// System.out.println(arr2[i]);
		// }
		// int[] arr3 = copyOf(arr2, 3);
		// for(int i = 0; i < arr3.length; i++) {
		// System.out.println(arr3[i]);
		// }
		int[] arr3 = copyOfRange(arr2, 1, 3);
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}

	/*
	 * ����һ������equals(int[] arr1,int[] arr2),����:�Ƚ����������Ƿ����(���Ⱥ����ݾ��������Ϊ������������ͬ��)
	 * 1.�ȱȽϳ��ȣ�������Ȳ���ȣ�ֱ�ӷ���false 2. ��������һ�����飬��������������е�ÿһ��Ԫ�غ�����һ�������Ӧ��Ԫ�رȽ�
	 * arr1[1] arr2[1]
	 */
	public static boolean equals(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.length; i++) {
			// arr1[i] �� arr2[i]�Ƚ�
			/*
			 * ����Ԫ�ض���ͬ����ͬ��Ҳ����ֻҪ��һ����ͬ��������������ǲ���ͬ������
			 */
			if (arr1[i] != arr2[i]) {// �������������Ӧ��Ԫ��ֻҪ��һ������ȣ��ͷ���false
				return false;
			}
		}
		return true;
	}

	/*
	 * ����һ������fill(int[] arr,int value),����:������arr�е�����Ԫ�ص�ֵ��Ϊvalue
	 * 
	 * ˼· ����arr���飬�����õ�ÿһ��Ԫ�ظ�����ֵ��value
	 */
	public static void fill(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = value;
		}
	}
	/*
	 * ����һ������fill(int[] arr,int fromIndex,int toIndex,int
	 * value),����:������arr�е�Ԫ�ش�����fromIndex��ʼ��toIndex(������toIndex) ��Ӧ��ֵ��Ϊvalue ˼·��
	 * ָ����Χ�������飬��ʼ��fromIndex������toIndex������arr���飬�����õ�ÿһ��Ԫ�ظ�����ֵ��value
	 */

	public static void fill(int[] arr, int fromIndex, int toIndex, int value) {
		for (int i = fromIndex; i < toIndex; i++) {
			arr[i] = value;
		}
	}

	/*
	 * ����һ������copyOf(int[] arr, int
	 * newLength),����:������arr�е�newLength��Ԫ�ؿ�������������,���������鷵��,������Ϊ0��ʼ ����ֵ������ 1.����������
	 * 3 6 2.ʹ��forѭ����ѭ����Χ��0��������ĳ��ȣ����ΰѾ����鵱ǰ������Ԫ�ظ�ֵ����Ӧ��������
	 */
	public static int[] copyOf(int[] arr, int newLength) {
		int[] newArr = new int[newLength];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}

	/*
	 * 2 4 5.����һ������copyOfRange(int[] arr,int from, int
	 * to),����:������arr�д�����from(����from)��ʼ������to����(������to)��Ԫ�ظ��Ƶ��������� ,���������鷵�� ˼·
	 * 1.���������飬������ĳ���to - from 2.���������飬�Ѿ������Ӧλ�õ�Ԫ�ظ�ֵ���������Ӧλ��Ԫ��
	 * 
	 */
	// {1,2,3,4}; 1 3
	// [2,3]

	public static int[] copyOfRange(int[] arr, int from, int to) {
		int[] newArr = new int[to - from];
		for (int i = 0; i < newArr.length; i++) {
			// �Ѿ�������һ��λ�ø�ֵ���������λ��
			newArr[i] = arr[i + from];
		}
		return newArr;
	}
}
