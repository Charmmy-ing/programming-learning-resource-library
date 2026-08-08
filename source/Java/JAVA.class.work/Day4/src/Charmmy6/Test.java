package Charmmy6;

// 1. 定义接口
interface Inner {
    void introduce();
}
class Outer {
    public static Inner method() {
        // 这里就是匿名内部类！
        return new Inner() {
            // 实现接口的抽象方法
            @Override
            public void introduce() {
                System.out.println("实现了Inner接口的匿名内部类！");
            }
        };
    }
}

// 3. 测试类
public class Test {
    public static void main(String[] args) {
        Outer.method().introduce();
    }
}