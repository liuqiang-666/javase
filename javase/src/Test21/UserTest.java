package Test21;

public class UserTest {

	public static void main(String[] args) {
		//"夏诗韵",20,读书、"慕容雪痕",21,弹钢琴、"燕清舞",18,跳舞
		User s1=new User("夏诗韵",20,"读书");
		User s2=new User("慕容雪痕",21,"弹钢琴");
		User s3=new User("燕清舞",18,"跳舞");
		User[] arr={s1,s2,s3};
		for (int i = 0; i < arr.length; i++) {
			User user = arr[i];
			if(user.getAge()>=20) {
				user.setLike("敲代码");
			}
			user.show();		
		}
	}

}
