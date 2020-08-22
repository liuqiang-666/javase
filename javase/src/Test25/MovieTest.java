package Test25;

import java.util.ArrayList;

public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie> list=new ArrayList<Movie>();
		Movie c1=new Movie("战狼","吴京","动作");
		Movie c2=new Movie("阿凡达","詹姆斯卡梅隆","科幻");
		Movie c3=new Movie("流浪地球","吴京","科幻");
		list.add(c3);
		list.add(c2);
		list.add(c1);
		for (int i = 0; i < list.size(); i++) {
			Movie s = list.get(i);
			if("吴京".equals(s.getDirector())) {
				System.out.println(s.getTitle()+"-"+s.getDirector()+"-"+s.getType());
			}
			
		}
	}

}
