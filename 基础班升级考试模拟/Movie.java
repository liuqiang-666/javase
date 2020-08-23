public class Movie {
    /*1.设计一个Movie类，私有成员变量：title（片名），director（导演），type（类型），并生成相应的get/set方法。*/
//成员变量

    private String title;
    private String director;
    private String type;
//成员方法
    //空参构造
    public Movie() {
    }
//满参构造
    public Movie(String title, String director, String type) {
        this.title = title;
        this.director = director;
        this.type = type;
    }
//setter and  getter方法
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
