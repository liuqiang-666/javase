import java.util.Random;
import java.util.Scanner;

/*
	ĳ�̳�ʵ���µĳ齱���������Ա�ŵİ�λ���ֵ��ڲ�����������֣���û�ԱΪ���˻�Ա����ʵ������Ҫ��
	�Ӽ����Ͻ��ջ�Ա��
	ʹ��if-elseѡ��ṹʵ�����˳齱
	������
		1.���������
		2.�ӿ���̨����һ��4λ��Ա��
		3.�ֽ��õİ�λ����
		4.�жϸû�Ա�Ƿ������˻�Ա
		5.���ո�ʽ��ӡ
 */
public class Task10 {
	public static void main(String[] args) {
//		1.���������
		Random r = new Random();
		int randomNum = r.nextInt(10);//����[0,9]���������
//		2.�ӿ���̨����һ��4λ��Ա��
		Scanner sc = new Scanner(System.in);
		int custNo = sc.nextInt();
//		3.�ֽ��õİ�λ����
		int bai = custNo/100%10;
//		4.�жϸû�Ա�Ƿ������˻�Ա
		if(randomNum == bai) {
			System.out.println(custNo + "�����˿ͻ�������MP3һ����");
		} else {
			System.out.println(custNo + " лл����֧�֣�");
		}
//		5.���ո�ʽ��ӡ
	}
}
