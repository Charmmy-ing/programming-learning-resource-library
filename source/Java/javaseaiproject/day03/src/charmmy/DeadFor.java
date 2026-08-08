package charmmy;

public class DeadFor {
    public static void main(String[] args) {
        test();
    }
    //    死循环
    public static void test() {
        for (; ; ) {
            System.out.println("Hello World");
        }
    }
}
