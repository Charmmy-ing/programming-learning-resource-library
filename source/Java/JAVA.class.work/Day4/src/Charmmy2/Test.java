package Charmmy2;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(1001, "张三");
        IO.println(s1.getId());
        IO.println(s1.getName());
        //s1.setId(1002);
        //s1.setName("李四");
        //编译错误：final变量不能被重新赋值
    }
}
