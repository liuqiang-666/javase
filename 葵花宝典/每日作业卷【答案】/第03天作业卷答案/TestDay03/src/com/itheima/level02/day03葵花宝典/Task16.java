import java.util.Scanner;

/*
	ѭ��¼��ѧԱJava�γ̵ĳɼ���ѧԱ�����ɼ���¼�룩��ͳ�Ʒ������ڵ���80�ֵ�ѧ���ı�����
	������
		1.��������¼�����
		2.����int���͵ı���score(ѧԱ�ɼ�)��total(ѧԱ����)��count(>=80�ֵ�ѧԱ����)
		3.ͨ������¼�������total������ֵ
		4.����forѭ��(ѭ������Ϊtotal)��ѭ��¼��ѧԱ�ɼ�
			(1)��ȡ��ǰ����¼��ĳɼ�
			(2)�жϸóɼ����<80,continue���������´�¼��
			(3)��������ĳɼ�>=80,count++
		5.����double���͵�rate��������80�����ϵı�������ֵ��rate
		6.��ӡ���յ� ������
 */
public class Task16 {
	public static void main(String[] args) {
//		1.��������¼�����
		Scanner sc = new Scanner(System.in);
//		2.����int���͵ı���score(ѧԱ�ɼ�)��total(ѧԱ����)��count(>=80�ֵ�ѧԱ����)
		int score = 0,total = 0,count = 0;
//		3.ͨ������¼�������total������ֵ
		System.out.print("������༶��������");
		total = sc.nextInt();
//		4.����forѭ��(ѭ������Ϊtotal)��ѭ��¼��ѧԱ�ɼ�
		for(int i = 0; i < total;i++) {
//			(1)��ȡ��ǰ����¼��ĳɼ�
			System.out.print("�������"+(i+1)+"λѧ���ĳɼ���");
			score = sc.nextInt();
			if(score < 80) {
//			(2)�жϸóɼ����<80,continue���������´�¼��
				continue;
			}
//			(3)��������ĳɼ�>=80,count++
			count++;
		}
//		5.����double���͵�rate��������80�����ϵı�������ֵ��rate
		System.out.println("�ܹ���"+count+"λͬѧ�ĳɼ���80������");
		double rate = (double)count/total*100;
//		6.��ӡ���յ� ������
		System.out.println("80�����ϵ�ѧ����ռ�ı���Ϊ��" + rate + "%");
	}
}
