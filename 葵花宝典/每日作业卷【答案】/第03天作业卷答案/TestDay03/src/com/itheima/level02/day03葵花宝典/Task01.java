import java.util.Scanner;

/*
 * �����������󣬲��ô���ʵ�֣�
	1.���ݹ���(����)��Ա���ǹ���(����),����ͻ�������ͨ������¼��
	2.�ǹ��ʵ��������£�����Ա���ڹ�˾����15�꣩
		[10-15)     +5000 
		[5-10)      +2500
		[3~5)       +1000
		[1~3)       +500
		[0~1)       +200
	3.����û�����Ĺ���Ϊ10����������Ϊ3000���������к��ӡ��ʽ"��Ŀǰ������10�꣬��������Ϊ 3000Ԫ, Ӧ�ǹ��� 5000Ԫ,�Ǻ��� 8000Ԫ"
	������
		1.��������¼�����
		2.�������age��ʾ���䣨����Ϊint���ͣ����������salary��ʾ�������ʣ�����Ϊint���ͣ����������addSalary��ʾ���ǲ��֣���ʼֵΪ0��
		3.ͨ������¼�������age��ֵ�ͻ�������salary��ֵ
		4.�Թ�������߼��жϣ����ݲ�ͬ�Ĺ������䣬����addSalary��ֵ
		5.���ո�ʽ���д�ӡ��salay+addSalaryΪ���յĹ��ʣ�
		
		ע�⣺����Ŀ�Ӳ�ͬ�ĽǶȷ���������д��������ʽ������ֻ�г�4��д����ͬѧ����ѧϰ�Ĺ�����Ҫ��ɢ˼ά��
		������д���ִ���
		
 */
public class Task01 {
	public static void main(String[] args) {
//		method01();
//		method02();
		method03();
		method04();
	}

	private static void method01() {
		// 1.��������¼�����
		Scanner sc = new Scanner(System.in);
		// 2.�������age��ʾ���䣨����Ϊint���ͣ����������salary��ʾ�������ʣ�����Ϊint���ͣ�
//		int age,salary;
		// 3.ͨ������¼�������age��ֵ�ͻ�������salary��ֵ
//		age = sc.nextInt();
//		salary = sc.nextInt();
		int age = sc.nextInt();
		int salary = sc.nextInt();
		int addSalary = 0;
		// 4.�Թ�������߼��жϣ����ݲ�ͬ�Ĺ������䣬�����ǹ���salary+=n����n��ʾ���ǹ��ʵ�������
		if(age>=15||age<0) {//age<0  || age>=15 ��Ϊ�ǷǷ�����
			System.out.println("������Ĺ��䲻�Ϸ�~");
			return ;
		}
		//[10-15)     +5000
		if(age>=10&&age<15)
			addSalary = 5000;
		//[5-10)      +2500
		if(age>=5&&age<10)
			addSalary = 2500;
		//[3~5)       +1000
		if(age>=3&&age<5)
			addSalary = 1000;
		//[1~3)       +500
		if(age>=1&&age<3)
			addSalary = 500;
		//[0~1)       +200
		if(age>=0&&age<1)
			addSalary = 200;		
		// 5.���ո�ʽ���д�ӡ
		System.out.println("��Ŀǰ������"+age+"�꣬��������Ϊ "+salary+"Ԫ, Ӧ�ǹ��� "+addSalary+"Ԫ,�Ǻ��� "+(salary+addSalary)+"Ԫ");
	}
	private static void method02() {
		// 1.��������¼�����
		Scanner sc = new Scanner(System.in);
		// 2.�������age��ʾ���䣨����Ϊint���ͣ����������salary��ʾ�������ʣ�����Ϊint���ͣ�
//		int age,salary;
		// 3.ͨ������¼�������age��ֵ�ͻ�������salary��ֵ
//		age = sc.nextInt();
//		salary = sc.nextInt();
		int age = sc.nextInt();
		int salary = sc.nextInt();
		int addSalary = 0;
		// 4.�Թ�������߼��жϣ����ݲ�ͬ�Ĺ������䣬�����ǹ���salary+=n����n��ʾ���ǹ��ʵ�������
		if(age>=15||age<0) {
			System.out.println("������Ĺ��䲻�Ϸ�~");
			return ;
		}
		//[10-15)     +5000
		if(age>=10&&age<15) {
			addSalary = 5000;
		} else if(age>=5&&age<10){//[5-10)      +2500
			addSalary = 2500;
		} else if(age>=3&&age<5) {//[3~5)       +1000
			addSalary = 1000;
		} else if(age>=1&&age<3) {//[1~3)       +500
			addSalary = 500;
		} else if(age>=0&&age<1) {//[0~1)       +200
			addSalary = 200;
		} 				
		// 5.���ո�ʽ���д�ӡ
		System.out.println("��Ŀǰ������"+age+"�꣬��������Ϊ "+salary+"Ԫ, Ӧ�ǹ��� "+addSalary+"Ԫ,�Ǻ��� "+(salary+addSalary)+"Ԫ");
	}
	private static void method03() {
		// 1.��������¼�����
		Scanner sc = new Scanner(System.in);
		// 2.�������age��ʾ���䣨����Ϊint���ͣ����������salary��ʾ�������ʣ�����Ϊint���ͣ�
//		int age,salary;
		// 3.ͨ������¼�������age��ֵ�ͻ�������salary��ֵ
//		age = sc.nextInt();
//		salary = sc.nextInt();
		int age = sc.nextInt();
		int salary = sc.nextInt();
		int addSalary = 0;
		// 4.�Թ�������߼��жϣ����ݲ�ͬ�Ĺ������䣬�����ǹ���salary+=n����n��ʾ���ǹ��ʵ�������
		if(age>=15||age<0) {
			System.out.println("������Ĺ��䲻�Ϸ�~");
			return ;
		} else if(age<1) { //else��ʾ�����if��������age<15&&age>=0��&&age<1 =>  [0-1)     +200
			addSalary = 200;
		} else if(age<3){ //else��ʾ�����if��������age<15&&age>=0��&&age>=110&&age<3 =>[1-3)      +500
			addSalary = 500;
		} else if(age<5) {//[3~5)       +1000
			addSalary = 1000;
		} else if(age<10) {//[5~10)       +2500
			addSalary = 2500;
		} else if(age<15) {//[10~15)       +5000
			addSalary = 5000;
		} 				
		// 5.���ո�ʽ���д�ӡ
		System.out.println("��Ŀǰ������"+age+"�꣬��������Ϊ "+salary+"Ԫ, Ӧ�ǹ��� "+addSalary+"Ԫ,�Ǻ��� "+(salary+addSalary)+"Ԫ");
	}
	private static void method04() {
		// 1.��������¼�����
		Scanner sc = new Scanner(System.in);
		// 2.�������age��ʾ���䣨����Ϊint���ͣ����������salary��ʾ�������ʣ�����Ϊint���ͣ�
//		int age,salary;
		// 3.ͨ������¼�������age��ֵ�ͻ�������salary��ֵ
//		age = sc.nextInt();
//		salary = sc.nextInt();
		int age = sc.nextInt();
		int salary = sc.nextInt();
		int addSalary = 0;
		// 4.�Թ�������߼��жϣ����ݲ�ͬ�Ĺ������䣬�����ǹ���salary+=n����n��ʾ���ǹ��ʵ�������
		if(age>=15||age<0) {
			System.out.println("������Ĺ��䲻�Ϸ�~");
			return ;
		} else if(age>=10) { //else��ʾ�����if��������age<15&&age>=0��&&age>=10 =>  [10-15)     +5000
			addSalary = 5000;
		} else if(age>=5){ //else��ʾ�����if��������age<15&&age>=0��&&age<10&&age>=5 =>[5-10)      +2500
			addSalary = 2500;
		} else if(age>=3) {//[3~5)       +1000
			addSalary = 1000;
		} else if(age>=1) {//[1~3)       +500
			addSalary = 500;
		} else if(age>=0) {//[0~1)       +200
			addSalary = 200;
		} 				
		// 5.���ո�ʽ���д�ӡ
		System.out.println("��Ŀǰ������"+age+"�꣬��������Ϊ "+salary+"Ԫ, Ӧ�ǹ��� "+addSalary+"Ԫ,�Ǻ��� "+(salary+addSalary)+"Ԫ");
	}
}
