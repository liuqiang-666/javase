

class a{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String  sa=s.next();
        //无参数
        String s1=new String();
        System.out.println(s1);
        //有参数
        String s2=new String("123");
        System.out.println(s2);
        //数组
        int[] arr={1,2,4};
        String s3=new String(arr);
        System.out.println("s3");

    }
}
    