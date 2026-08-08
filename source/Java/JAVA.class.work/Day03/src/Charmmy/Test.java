package Charmmy;

public class Test {
    public static void main(String[] args) {
      //定义主方法 main()，并在其中创建两个 Book 对象 b1 和 b2 。
        //设置两个对象的属性值，具体如下：
        //b1: 书号 "ISBN123456789"，书名 "Java Programming"，作者 "John Doe"，出版年份 2024。
        //b2: 书号 "ISBN987654321"，书名 "Data Structures"，作者 "Jane Smith"，出版年份 2023。
        //调用显示书号、书名、作者、出版年份的方法，显示两本书的相关信息。
        //修改 b1 的出版年份为 2021 并显示修改后的结果。
    Book b1 = new Book("ISBN123456789", "Java Programming", "John Doe", 2024);
    Book b2 = new Book("ISBN987654321", "Data Structures", "Jane Smith", 2023);
    Out out = new Out();
    out.out(b1);
    System.out.println();
    out.out(b2);
    System.out.println();
    b1.setYearPublished(2021);
    out.out(b1);
    System.out.println();
    out.out(b2);
    }
}
