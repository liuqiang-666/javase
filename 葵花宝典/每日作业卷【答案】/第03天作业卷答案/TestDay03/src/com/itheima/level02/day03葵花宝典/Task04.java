import java.util.Scanner;

/*
 * �����������󣬲��ô���ʵ�֣�
	1.����¼��һ������������x�������Ӧ�ı���y��ֵ
	2.xֵ��yֵ�Ķ�Ӧ��ϵ���£�
		x<0 y=-1
		x=0 y=0
		x>0 y=1
	3.����û������x��ֵΪ2���������к��ӡ��ʽ"x=2,y=1"
	������
	1.��������¼�����
	2.�������ͱ���x���ڽ��ռ���¼�������
	3.�������ͱ���y��������if�������߼��жϸ���x��ֵ��������y���и�ֵ
	4.���ո�ʽ��ӡ����x��y��ֵ
	ע�⣺
		����Ŀ�Ӳ�ͬ�ĽǶȷ���������д��������ʽ������ֻ�г�3��д����ͬѧ����ѧϰ�Ĺ�����Ҫ��ɢ˼ά��
		������д���ִ���
		
		
 */
public class Task04 {
	public static void main(String[] args) {
//		method01();
//		method02();
		method03();
	}

	private static void method01() {
		// 1.��������¼�����
		Scanner sc = new Scanner(System.in);
		// 2.�������ͱ���x���ڽ��ռ���¼�������
		int x = sc.nextInt();
		// 3.�������ͱ���y��������if�������߼��жϸ���x��ֵ��������y���и�ֵ
		int y = 0;
		if (x < 0)
			y = -1;
		if (x == 0)
			y = 0;
		if (x > 0)
			y = 1;
		// 4.���ո�ʽ��ӡ����x��y��ֵ
		System.out.println("x=" + x + ",y=" + y);
	}
	private static void method02() {
		// 1.��������¼�����
		Scanner sc = new Scanner(System.in);
		// 2.�������ͱ���x���ڽ��ռ���¼�������
		int x = sc.nextInt();
		// 3.�������ͱ���y��������if�������߼��жϸ���x��ֵ��������y���и�ֵ
		int y = 0;
		if (x < 0)
			y = -1;
		else if (x == 0)
			y = 0;
		else
			y = 1;
		// 4.���ո�ʽ��ӡ����x��y��ֵ
		System.out.println("x=" + x + ",y=" + y);
	}
	private static void method03() {
		// 1.��������¼�����
		Scanner sc = new Scanner(System.in);
		// 2.�������ͱ���x���ڽ��ռ���¼�������
		int x = sc.nextInt();
		// 3.�������ͱ���y��������if�������߼��жϸ���x��ֵ��������y���и�ֵ
		int y = 0;
		if (x < 0)
			y = -1;
		else if (x > 0)
			y = 1;
		// 4.���ո�ʽ��ӡ����x��y��ֵ
		System.out.println("x=" + x + ",y=" + y);
	}
}
