import java.util.Scanner;

/*
 * �����������󣬲��ô���ʵ�֣�			
	1.��������:����¼���·ݣ������Ӧ�ļ���
	2.Ҫ��:
		(1)����¼��һ������(�����·�,��Χ1-12)
		(2)������·ݶ�Ӧ�ļ���
			3,4,5����
			6,7,8�ļ�
			9,10,11�＾
			12,1,2����
		(3)��ʾ��ʽ����:
			������һ���·�:3
			����̨���:3�·��Ǵ���
 */
public class Task06 {
	public static void main(String[] args) {
		method01();
//		method02();
//		method03();
	}
	public static void method01(){
		Scanner sc = new Scanner(System.in);	//��������¼�����
		System.out.println("�������·�");
		int month = sc.nextInt();				//������¼��Ľ���洢��month
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month + "���Ǵ���");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "�����ļ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "�����＾");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(month + "���Ƕ���");
			break;
		default:
			System.out.println("�Բ���û�ж�Ӧ�ļ���");
			break;
		}
	}
	public static void method02(){
		Scanner sc = new Scanner(System.in);	//��������¼�����
		System.out.println("�������·�");
		int month = sc.nextInt();				//������¼��Ľ���洢��month
		
		//��if���������·ݶ�Ӧ���ڷ���һ:
		if (month > 12 || month < 1) {
			System.out.println("�Բ���û�ж�Ӧ�ļ���");
		}else if (month >= 3 && month <= 5) {
			System.out.println(month + "���Ǵ���");
		}else if (month >= 6 && month <= 8) {
			System.out.println(month + "�����ļ�");
		}else if (month >= 9 && month <= 11) {
			System.out.println(month + "�����＾");
		}else {
			System.out.println(month + "���Ƕ���");
		}
	}
	public static void method03(){
		Scanner sc = new Scanner(System.in);	//��������¼�����
		System.out.println("�������·�");
		int month = sc.nextInt();
		//��if���������·ݶ�Ӧ���ڵķ�����:		
        if(month>12 || month<1) {
			System.out.println("��������ֲ���ȷ");
		} else if (month==3 || month==4 || month==4) {
			System.out.println("����");
		} else if (month==6 || month==7 || month==8) {
			System.out.println("�ļ�");
		} else if (month==9 || month==10|| month==11) {
			System.out.println("�＾");
		} else {
			System.out.println("����");
		}	
	}
	
}


