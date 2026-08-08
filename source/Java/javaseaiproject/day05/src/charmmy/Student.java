package charmmy;

public class Student {
    String name;
    double Chinese;
    double English;
    public void print(){
        System.out.println(name);
        System.out.println(Chinese+"分");
        System.out.println(English+"分");
        System.out.println("平均成绩："+(Chinese+English)/2+"分");
    }
}
