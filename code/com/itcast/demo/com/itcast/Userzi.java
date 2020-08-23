import java.util.ArrayList;

public class Userzi  extends User{

    public Userzi() {
    }

    public Userzi(String name, int money) {
        super(name, money);
    }

    
    //群主可发红包
    public ArrayList<Integer> send(int count,int lessmoney) {
        ArrayList<Integer> list1 = new ArrayList<>();
        int leftmoney=super.getMoney();
        if(leftmoney>lessmoney){        
            for (int i = 0; i < count-1; i++) {
            list1.add(lessmoney/count);
            }
            super.setMoney(leftmoney-lessmoney);
            list1.add(lessmoney%count+leftmoney/count);
            return list1;
        }else{
            System.out.println("红包余额不足!");
            return list1; 
        }
          

    }




}

