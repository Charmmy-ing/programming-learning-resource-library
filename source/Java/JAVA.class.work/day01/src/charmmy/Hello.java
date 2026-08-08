package charmmy;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello!");
        Student zhang=new Student();
        zhang.speak();
    }
}
class Student {
    public void speak(){
        System.out.print("I am student.");
    }
}
