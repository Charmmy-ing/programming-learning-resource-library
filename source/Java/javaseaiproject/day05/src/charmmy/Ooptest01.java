package charmmy;

public class Ooptest01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "波妞";
        s1.Chinese = 90;
        s1.English = 80;
        s1.print();
        System.out.println("-----------------");
        Student s2 = new Student();
        s2.name = "波仔";
        s2.Chinese = 90;
        s2.English = 98;
        s2.print();
    }
}
