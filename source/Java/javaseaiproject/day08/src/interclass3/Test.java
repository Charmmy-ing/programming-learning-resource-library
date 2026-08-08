package interclass3;

public class Test {
    //认识匿名内部类
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("猫在叫");
            }
        };
        a.cry();
    }
}
