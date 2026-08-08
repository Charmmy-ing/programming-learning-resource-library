package Charmmy;

public class Codedemo{
    int a;
    String b;
    public static void main(String[] args) {
        System.out.println("Codedemo的main方法");
        new Codedemo();

    }
    {
        System.out.println("Codedemo的代码代码块");
        a=100;
        b="a";
        System.out.println(a);
        System.out.println(b);
    }
}
