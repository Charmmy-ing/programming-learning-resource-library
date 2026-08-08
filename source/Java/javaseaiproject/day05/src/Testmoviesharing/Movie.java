package Testmoviesharing;

public class  Movie {
    private int id;
    private String title;
    private double price;
    private String director;
    //一个无参构造器
    public Movie() {
    }
    //一个有参构造器
    public Movie(int id, String title, double price, String director) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.director = director;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
