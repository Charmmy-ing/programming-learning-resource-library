package innerclass;

public class Test {
    public static void main(String[] args) {
        //先外部类的实例化对象，再实例化内部类的对象
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}
