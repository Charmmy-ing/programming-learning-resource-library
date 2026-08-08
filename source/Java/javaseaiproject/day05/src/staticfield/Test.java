package staticfield;

public class Test {
    // static 特点，访问机制，作用；
    public static void main(String[] args) {
        Student.name = "张三";
        Student s = new Student();
        s.name="李四";
        Student s2 = new Student();
        s2.name="王五";
        System.out.println(Student.name);
        System.out.println(s.name);
        System.out.println(s2.name);


    }

}
