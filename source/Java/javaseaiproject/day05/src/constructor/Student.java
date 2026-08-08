package constructor;

public class Student {
    String name;
    int age;
    char gender;
    public Student() {
        System.out.println("无参构造方法");
    }
    public Student(String n, int a, char g) {
        name = n;
        age = a;
        gender = g;
    }
}