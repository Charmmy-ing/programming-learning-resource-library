package Charmmy5;

public class Book {
    private int id;
    private String name;
    public Book() {
        this(0, "Unknown");
    }
    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
