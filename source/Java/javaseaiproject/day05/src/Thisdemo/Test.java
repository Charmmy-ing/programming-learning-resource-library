package Thisdemo;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "波妞";
        s1.age = 19;
        s1.print();
        System.out.println(s1);
        Student s2 = new Student();
        s2.print();
        System.out.println(s2);
    }
}
