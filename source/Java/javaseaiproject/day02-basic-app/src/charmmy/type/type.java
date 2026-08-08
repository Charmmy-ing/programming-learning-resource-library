package charmmy.type;

public class type {
    public static void main(String[] args) {
        //认识自动类型转换
        byte a=10;
        printHello(a);
        int i=20;
        printHello1((byte)i);
        int j=20000;
        printHello2((byte)j);
        char A=65;
        System.out.println(A);
    }
    //认识强制类型转换
    public static void printHello(int num){
        System.out.println(num);
    }
    public static void printHello1(byte num){
        System.out.println(num);
    }
    public static void printHello2(byte num){
        System.out.println(num);
    }
}
