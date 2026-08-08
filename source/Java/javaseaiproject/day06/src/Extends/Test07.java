package Extends;

public class Test07 {
    public static void main(String[] args) {
        B1 b1 = new B1();
        
    }
}
class A1{
    public A1(){
        System.out.println("A1");
    }
}
class B1 extends A1{

    public B1(){
        System.out.println("B1");
    }
}
