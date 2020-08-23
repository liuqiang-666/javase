import java.util.ArrayList;
import java.util.Random;

public class Userzi2 extends User{

    public Userzi2() {
    }

    public Userzi2(String name, int money) {
        super(name, money);
    }
    // 成员可以接受群主的红包·
    public int recive(ArrayList<Integer> list) {
        int a=new Random().nextInt(list.size())+1;
        int money =super.getMoney();
        money=money+list.get(a);
        list.remove(a);
        super.setMoney(money);
        return money;
     
        
        
    }
}