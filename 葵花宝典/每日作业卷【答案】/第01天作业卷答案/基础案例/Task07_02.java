/*
�ҳ����´���Ĵ��󣬲��޸�
*/
public class Task07_02 {
	public static void main(String[] args) {
		int x = 2;
		{
			int y = 6;
			System.out.println("x is " + x);
			System.out.println("y is " + y);
		}
		//y = x; ���󣬱���y����ʹ�÷�Χ�����¶������y
		int y = x; //�޸ĺ�
		System.out.println("x is " + x);
	}
}