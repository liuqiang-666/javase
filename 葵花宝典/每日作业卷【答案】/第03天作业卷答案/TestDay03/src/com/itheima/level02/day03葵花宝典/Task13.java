import java.util.Scanner;

/*
	ĳ�̳�������Դ��ۣ�����취���£�
		��ͨ�˿͹���100Ԫ��9��
		��Ա�����8��
		��Ա������200Ԫ��7.5��
		����ݴ��Żݼƻ����й������
	������
		1.��������¼�����
		2.����String���͵ı���identity����ֵΪy/n,y��ʾΪ��Ա��n��ʾΪ�ǻ�Ա����double���͵ı���money��ʾ������
		3.ͨ������¼�������identity�ͱ���money��ֵ
		4.ʹ��Ƕ��ifѡ��ṹʵ��
		5.���жϹ˿��Ƿ��ǻ�Ա
			(1)�ǻ�Ա��ֱ�Ӵ�9��
			(2)��Ա�������жϹ˿͹����Ƿ�ﵽ��Ӧ�Ĵ��۵�����Ҫ�󣬸��ݽ������ͬ�Ĵ���
 */
public class Task13 {
	public static void main(String[] args) {
//		1.��������¼�����
		Scanner sc = new Scanner(System.in);
//		2.����String���͵ı���identity����ֵΪy/n,y��ʾΪ��Ա��n��ʾΪ�ǻ�Ա����double���͵ı���money��ʾ������
		String identity;
		double money;
//		3.ͨ������¼�������identity�ͱ���money��ֵ
		System.out.println("�������Ƿ��ǻ�Ա����(y)/��(�����ַ�)");
		identity = sc.nextLine();
		System.out.println("�����빺���");
		money = sc.nextDouble();
//		4.ʹ��Ƕ��ifѡ��ṹʵ��
		if(identity.equals("y")) {	//�ǻ�Ա
//		5.���жϹ˿��Ƿ��ǻ�Ա
//			(1)��Ա�������жϹ˿͹����Ƿ�ﵽ��Ӧ�Ĵ��۵�����Ҫ�󣬸��ݽ������ͬ�Ĵ���
			if(money >= 200) { //��Ա����200Ԫ���ϴ�7.5��
				money = money * 0.75;
			} else {	//��Ա200Ԫ���ڵĴ�8��
				money = money * 0.8;
			}
		} else {
//			(2)�ǻ�Ա��ֱ�Ӵ�9��
			if(money >= 100) { //�ǻ�Ա����100Ԫ���ϴ�9��
				money = money * 0.9;
			}
		}
		System.out.println("ʵ��֧����"+money);
	}
}
