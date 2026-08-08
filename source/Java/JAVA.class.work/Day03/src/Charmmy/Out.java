package Charmmy;

public class Out{
        public void out(Book b) {
            System.out.print("书号：" + b.getBookNo());
            System.out.print("书名：" + b.getBookTitle());
            System.out.print("作者：" + b.getAuthor());
            System.out.print("出版年份：" + b.getYearPublished());
        }
    }

