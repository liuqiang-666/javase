import java.util.Scanner;

/*
	ĳͬѧ�μӼ����������
	�����õ�1�������μ��廪��ѧ��֯��1��������Ӫ��
	�����õ�2��������������ʼǱ�����һ����
	�����õ�3�����������ƶ�Ӳ��һ����
	����û���κν�����
	������������Ŀ����if��switch�����ԣ����������switch��
		1.��������¼�����
		2.����int���͵ı���rank��ʾ���Σ���ͨ������¼�븳ֵ
		3.ʹ��switch�ж�
			����rank��ͬ��ֵ����ӡ��ͬ������
			
 */
public class Task15 {
	public static void main(String[] args) {
//		1.��������¼�����
		Scanner sc = new Scanner(System.in);
//		2.����int���͵ı���rank��ʾ���Σ���ͨ������¼�븳ֵ
		int rank = sc.nextInt();
//		3.ʹ��switch�ж�
//			����rank��ͬ��ֵ����ӡ��ͬ������
		switch (rank) {
			case 1:
				System.out.println("�μ��廪��ѧ��֯��1��������Ӫ");
				break;	
			case 2:
				System.out.println("��������ʼǱ�����һ��");
				break;	
			case 3:
				System.out.println("�����ƶ�Ӳ��һ��");
				break;	
			default:
				System.out.println("û���κν���");
				break;
		}
	}
}
