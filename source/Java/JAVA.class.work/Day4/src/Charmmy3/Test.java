package Charmmy3;

public class Test {
    public static void main(String[] args) {
        parttimemember p = new parttimemember("张三", "男", 1500);
        p.getSalary();
        p.pay();
        parttimemember p2 = new parttimemember("李四", "男", -3000);
        p2.getSalary();
        p2.pay();

    }

}
