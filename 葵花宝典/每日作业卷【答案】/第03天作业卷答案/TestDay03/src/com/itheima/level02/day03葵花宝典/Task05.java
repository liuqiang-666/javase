import java.util.Scanner;

/*
 * �����������󣬲��ô���ʵ�֣�
	1.����¼���������������մ�С�����˳�����
	2.����û��������3 2 1���������к��ӡ��ʽ"���մ�С����������˳��Ϊ��1 2 3"
	����:
 		a,b,c -> a>b&&a>c ->a>b&&a>c&&b>c a b c  a>b&&a>c&&b<c   a c b 
 */
public class Task05 {
	public static void main(String[] args) {
//		method01();
//		method02();
//		method03();
//		method04();
		method05();
		
	}
	public static void method01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������:");
		int a = sc.nextInt();
		System.out.println("������ڶ�������:");
		int b = sc.nextInt();
		System.out.println("���������������:");
		int c = sc.nextInt();
		
		if(a>b) {//a>b
			if(a>c) {//a>b&&a>c   a������
				if(b>c) {//a>b&&a>c&&b>c
					System.out.println("a="+a+",b="+b+",c="+c);
				} else {//a>b&&a>c&&b<=c
					System.out.println("a="+a+",c="+c+",b="+b);
				}
			} else {//a>b&&a<=c  ->c a b
				System.out.println("c="+c+",a="+a+",b="+b);
			}
		} else {//b>=a
			if(c>b) {//b>=a&&c>b  c b a
				System.out.println("c="+c+",b="+b+",a="+a);
			} else {//b>=a&&b>=c   b 
				if(a>c) {//b>=a&&b>=c&&a>c  b a c 
					System.out.println("b="+b+",a="+a+",c="+c);
				} else {//b>=a&&b>=c&&a<=c  b c a  
					System.out.println("b="+b+",c="+c+",a="+a);
				}
			}
		}
	}
	public static void method02() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������:");
		int a = sc.nextInt();
		System.out.println("������ڶ�������:");
		int b = sc.nextInt();
		System.out.println("���������������:");
		int c = sc.nextInt();
		if(a>b&&a>c&&b>c) {
			System.out.println("a="+a+",b="+b+",c="+c);
		}
		if(a>b&&a>c&&b<=c) {
			System.out.println("a="+a+",c="+c+",b="+b);
		}
		if(a>b&&a<=c) {
			System.out.println("c="+c+",a="+a+",b="+b);
		}
		if(b>=a&&c>b) {
			System.out.println("c="+c+",b="+b+",a="+a);
		}
		if(b>=a&&b>=c&&a>c) {
			System.out.println("b="+b+",a="+a+",c="+c);
		}
		if(b>=a&&b>=c&&a<=c) {
			System.out.println("b="+b+",c="+c+",a="+a);
		}		
	}
	//ѡ������
	public static void method03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������:");
		int a = sc.nextInt();
		System.out.println("������ڶ�������:");
		int b = sc.nextInt();
		System.out.println("���������������:");
		int c = sc.nextInt();
		//a�б�����a��b���������еĽϴ��е�ֵ
		if(a<b) {
			int temp = a;
			a = b;
			b = temp;
		}
		//��a�б����������еĽϴ������
		if(a<c) {
			int temp = a;
			a = c;
			c = temp;
		}
		if(b<c) {
			int temp = b;
			b = c;
			c = temp;
		}
		
		System.out.println("a="+a+",b="+b+",c="+c);		
	}
	//ð������
	public static void method04() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������:");
		int a = sc.nextInt();
		System.out.println("������ڶ�������:");
		int b = sc.nextInt();
		System.out.println("���������������:");
		int c = sc.nextInt();
		//a�б�����a��b���������еĽϴ��е�ֵ
		if(a<b) {
			int temp = a;
			a = b;
			b = temp;
		}
		//b�б�����b��c���������еĽϴ��е�ֵ,��ʱc���Ѿ�����Сֵ��
		if(b<c) {
			int temp = b;
			b = c;
			c = temp;
		}
		//��������Ĳ���c���Ѿ�ȷ������Сֵ��ֻ��Ҫ��ȷ��a��b�Ϳ�����
		if(a<b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println("a="+a+",b="+b+",c="+c);		
	}
	
	//a,b,c�еĽϴ�ֵҪô��a��Ҫô��b��Ҫô��c��ֻ�����������
	public static void method05() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������:");
		int a = sc.nextInt();
		System.out.println("������ڶ�������:");
		int b = sc.nextInt();
		System.out.println("���������������:");
		int c = sc.nextInt();
		
		if(a>b&&a>c) {//����a�����ֵ
			if(b>c) {//b�ǵڶ���ģ�c����С��
				System.out.println("a="+a+",b="+b+",c="+c);	
			} else {//c�ǵڶ���ģ�b����С��
				System.out.println("a="+a+",c="+c+",b="+b);	
			}
			
		} else if(b>a&&b>c) {//����b�����ֵ
			if(a>c) {//a�ǵڶ���ģ�c����С��
				System.out.println("b="+b+",a="+a+",c="+c);	
			} else {//c�ǵڶ���ģ�a����С��
				System.out.println("b="+b+",c="+c+",a="+a);	
			}
			
		}else if(c>a&&c>b) {//����c�����ֵ
			if(a>b) {//a�ǵڶ���ģ�b����С��
				System.out.println("c="+c+",a="+a+",b="+b);	
			} else {//b�ǵڶ���ģ�a����С��
				System.out.println("c="+c+",b="+b+",a="+a);	
			}
		}			
	}
}
