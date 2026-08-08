package Charmmy;

public class Book {
        private String bookNo;
        private String bookTitle;
        private String author;
        private int yearPublished;
        public Book() {

        }
        public Book(String bookNo, String bookTitle, String author, int yearPublished) {
            this.bookNo = bookNo;
            this.bookTitle = bookTitle;
            this.author = author;
            this.yearPublished = yearPublished;
        }

        public String getBookNo() {
            return bookNo;
        }

        public void setBookNo(String bookNo) {
            this.bookNo = bookNo;
        }

        public String getBookTitle() {
            return bookTitle;
        }

        public void setBookTitle(String bookTitle) {
            this.bookTitle = bookTitle;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getYearPublished() {
            return yearPublished;
        }

        public void setYearPublished(int yearPublished) {
            this.yearPublished = yearPublished;
        }
    }

