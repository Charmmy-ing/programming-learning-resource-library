package Charmmy5;

public class Test {
    /*编写一个学生借书的程序。提示：
思考需要定义的类，例如：本程序需要用到学生、借书卡、书等对象，最后实现借书的过程，如果有指定的书，则输出“***借到了***书”，否则输出“****没有借到****书”
*/
    public static void main(String[] args) {
        Student student = new Student(1001, "张三");
        Book book = new Book(1001, "Java程序设计");
        bORROW borrow = new bORROW();
        borrow.borrowBook(book, student, 1001);
    }
}
