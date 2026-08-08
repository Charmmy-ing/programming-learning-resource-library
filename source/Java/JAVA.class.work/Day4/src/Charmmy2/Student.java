package Charmmy2;

public class Student {
    /*定义一个类，在类中声明成员变量和成员方法，尝试使用final关键词修饰类中的变量、方法及该类，测试并查看结果，必要时加以注释。（练习目标：final关键字的应用）*/
    private final int id;
    private final String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
