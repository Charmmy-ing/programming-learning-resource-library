package Charmmy5;

public class bORROW {
    private String name = "借书卡";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;

    }
    public void borrowBook(Book book, Student student, int bookId) {
        if (book.getId() == bookId) {
            System.out.println(student.getName() + " 借到了 " + book.getName());
        } else {
            System.out.println(student.getName() + " 没有借到 " + book.getName());
        }
    }

}

