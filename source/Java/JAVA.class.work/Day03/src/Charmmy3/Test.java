package Charmmy3;

public class Test {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1001, "张三", 30, "开发", "IT");
        Employee emp2 = new Employee(1002, "李四", 25, "测试", "QA");
        emp1.sign_in("张三");
        emp2.sign_in("李四");
        emp1.displayInfo();
        emp2.displayInfo();
    }
}
