package Staticmethod;

public class Test2 {
    public static int count = 0;
    private int a = 10;
    public Test2(){
        a = 10;
    }
    public static void main(String[] args) {
        test();
    }
    public static void test(){
        System.out.println(count);
        //System.out.println(a);
        //Test2();

    }
}
