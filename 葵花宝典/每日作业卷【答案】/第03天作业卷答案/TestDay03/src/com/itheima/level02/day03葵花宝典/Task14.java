import java.util.Scanner;

/*
	ĳ��׼��ȥ�������Σ�����Ҫ������Ʊ����Ʊ�ļ۸��ռ������ǡ�������Ӱ�죬ͷ�Ȳպ;��òռ۸�Ҳ��ͬ��
	�����Ʊԭ�ۼ���Ϊ5000Ԫ������¼�룩��4-10��Ϊ����������ͷ�Ȳմ�9�ۣ����òմ�8�ۣ�����ͷ�Ȳմ�5�ۣ����òմ�4�ۡ�
	��д����ʹ��Ƕ��ifѡ��ṹ���ݳ��е��·ݺ�ѡ��Ĳ�λ���ʵ�ʵĻ�Ʊ�۸�
	������
		1.��������¼�����
		2.����int���͵�money��ʾ��Ʊ�۸�int���͵�month��ʾ�·�
		3.ͨ������¼�������money��month��ֵ
		4.����int���͵ı���type��ʾ��Ʊ�����ͺ�double���͵ı���discount��ʾ�ۿ���
		5.ͨ������¼�������type��ֵ
		6.ʹ��if������type��month��ֵ������ʵ�ʵĻ�Ʊ�۸�
		7.��ӡ���Ľ��
	
 */
public class Task14 {
	public static void main(String[] args) {
//		1.��������¼�����
		Scanner sc =  new Scanner(System.in);
//		2.����int���͵�money��ʾ��Ʊ�۸�int���͵�month��ʾ�·�
		int money;	//��ʾ��Ʊ�۸�
		int month;	//��ʾ���е��·�
//		3.ͨ������¼�������money��month��ֵ
		System.out.println("�������Ʊ��ԭʼ�۸�");
		money = sc.nextInt();
		System.out.println("��������Ҫ���е��·ݣ�1~12");
		month = sc.nextInt();
//		4.����int���͵ı���type��ʾ��Ʊ�����ͺ�double���͵ı���discount��ʾ�ۿ���
		int type;
		double discount = 1.0;
//		5.ͨ������¼�������type��ֵ
		System.out.println("��ѡ��ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�����1�����ò�����2");
		type = sc.nextInt();
//		6.ʹ��if������type��month��ֵ������ʵ�ʵĻ�Ʊ�۸�
		if(month >= 4 && month <= 10) {		//����
			if(type == 1) {		//ͷ�Ȳմ�9��
				discount = 0.9;
			} else if(type == 2) {	//���òմ�8��
				discount = 0.8; 
			}
		} else if((month >= 1 && month <4) || (month >10 && month <= 12)){ //����
			if(type == 1) {		//ͷ�Ȳմ�5��
				discount = 0.5;
			} else if(type == 2) {	//���òմ�4��
				discount = 0.4; 
			}
		} else {
			System.out.println("�����·�¼�����~");
			return;//����main����������
		}
//		7.��ӡ���Ľ��
		//����4�·ݳ��У�ͷ�Ȳմ�0.5�ۣ�ԭ��5000���ۺ��3000
		System.out.println(((month>=4&&month<=10)?"���� ":"���� ")+month+" �·ݳ��У�"+(type==1?"ͷ�Ȳ� ":"���ò� ")+"�� "+(int)(discount*10)+" �ۣ�ԭ�� "+money+" Ԫ���ۺ�� "+(money*discount)+" Ԫ");
	}
}
