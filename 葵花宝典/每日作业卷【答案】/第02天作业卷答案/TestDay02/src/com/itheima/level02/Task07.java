package com.itheima.level02;

/*
 * ������˵������벻Ҫ��ǰ���У�
 */
public class Task07 {
	public static void main(String[] args) {
		short s = 30;
		int i = 50;
		//s+=i �൱��s = (short)( s+i) = 80
		s += i;
		System.out.println("s="+s);//s = 80
		int x = 0;
		int y = 0;
		int z = 0;
		boolean a,b;
		//x>0 -> 0>0 false
		//& ��������ֵ��ʲô����Ҫ�����Ҳ�ļ���
		//y++���ʽ��ֵ��0��Ȼ��Ҫ����+1���1��0>1 false 
		//����a = false,x=0,y=1
		a = x>0 & y++>1;
		System.out.println("a="+a);
		System.out.println("y="+y);
		//x>0 -> 0>0 false
		//&&Ϊ��·�룬���Ϊfalse���������Ҳ�
		//���ս���� b = false ,z=0 
		b = x>0 && z++>1;
		System.out.println("b="+b);
		System.out.println("z="+z);
		//x>0 -> 0>0 false
		//| ��������ֵ��ʲô����Ҫ�����Ҳ�ļ���
		//y++>1  �ȼ���y++��ֵ����++�ں���������y��ֵ��Ϊy++���ʽ��ֵ��1����Ȼ��yִ��+1���㣬���2��������y��ɼ���������Ӱ��ǰ���Ѿ����������y++���ʽ��ֵ
		//y++>1 -> 1>1 false
		//����a=false,x=0,y = 2
		a = x>0 | y++>1;
		System.out.println("a="+a);
		System.out.println("y="+y);
		//x>0 -> 0>0 false
		//|| ֻ�����Ϊtrueʱ���������Ҳ࣬����ʱ���Ϊfalse����Ȼ��Ҫ�����Ҳ�
		//z++>1 ,�ȼ���z++��ֵ����++�ں�����ʹ��z��ֵ��Ϊz++���ʽ��ֵ��0����Ȼ��zִ��+1���㣬���1��������z��ɼ���������Ӱ��ǰ���Ѿ����������z++���ʽ��ֵ
		//z++>1 -> 0>1 false
		//���գ� b=false,x = 0,z=1
		b = x>0 || z++>1; 
		System.out.println("b="+b);
		System.out.println("z="+z);			
	}
}

