import java.util.ArrayList;

public class MovieTest {
/*2.定义测试类，在main方法中完成以下要求：

    2.1创建三个Movie对象，分别为” 唐山大地震”，”冯小刚”，”灾难”；”羞羞的铁拳”，” 宋阳”，” 喜剧”； ”集结号”，” 冯小刚”，”历史”；

    2.2将以上3个对象添加到list集合中

    2.3遍历集合，将导演为“冯小刚”的电影按照如下格式打印到控制台上。*/
public static void main(String[] args) {
    ArrayList<Movie> list = new ArrayList<>();
  //  2.1创建三个Movie对象，分别为” 唐山大地震”，”冯小刚”，”灾难”；”羞羞的铁拳”，” 宋阳”，” 喜剧”； ”集结号”，” 冯小刚”，”历史”；

    Movie movie1=new Movie("唐山大地震","冯小刚","灾难");
    Movie movie2=new Movie("羞羞的铁拳","宋阳","喜剧");
    Movie movie3=new Movie("集结号","冯小刚","历史");
// 2.2将以上3个对象添加到list集合中
    list.add(movie1);
    list.add(movie2);
    list.add(movie3);
//    2.3遍历集合，将导演为“冯小刚”的电影按照如下格式打印到控制台上
    for (int i = 0; i < list.size(); i++) {
        if ("冯小刚".equals(list.get(i).getDirector())){
            System.out.println(list.get(i).getTitle()+"-"+list.get(i).getDirector()+"-"+list.get(i).getType());
        }
    }
}

}
