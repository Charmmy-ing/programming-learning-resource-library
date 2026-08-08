package constructor;

public class TEST {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 18;
        s1.gender = '男';
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.gender);
        Student s2 = new Student("李四", 19, '女');
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.gender);
    }
}
