package test;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="asdqweqrwer";
		int a=getlength(s);
		System.out.println(a);
	}

	private static int getlength(String s) {
		// TODO Auto-generated method stub
	
		char[] arr=s.toCharArray();
		int count=arr.length;
		return count;
	}

}
