package Extends;

public class Test2 {
    public static void main(String[] args) {
        B b = new B();
        b.sayHello();
    }
}
class A extends Object {
    String name="A";
}

class B extends A{
    String name;
    public void sayHello() {
        String name="B";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
