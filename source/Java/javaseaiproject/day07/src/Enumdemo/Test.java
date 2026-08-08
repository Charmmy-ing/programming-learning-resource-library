package Enumdemo;

public class Test {
    //认识枚举类
    public static void main(String[] args) {
        A a1 = A.A1;
        System.out.println(a1);
        A a2 = A.A2;
        System.out.println(a2);
        A a3 = A.A3;
        System.out.println(a3);
        System.out.println(a1.name());
        System.out.println(a2.name());

        System.out.println(a3.name());
        System.out.println(a1.ordinal());
        System.out.println(a2.ordinal());
        System.out.println(a3.ordinal());
           }
}
