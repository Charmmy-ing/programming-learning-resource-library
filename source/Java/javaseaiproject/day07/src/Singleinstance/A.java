package Singleinstance;

public class A {
    //设计成单例设计模式
    //确保单例类对外不能随便创建对象
    //定义一个静态变量，指向单例对象
    //确保单例类对外只能创建一个对象
    private static final A a = new A();
    private A() {
    }
    public static A getInstance() {
        return a;
    }
}
