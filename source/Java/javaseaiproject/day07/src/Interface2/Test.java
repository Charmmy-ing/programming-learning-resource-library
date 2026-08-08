package Interface2;

public class Test {
    public static void main(String[] args) {
        //理解接口设的好处
        people people = new student();
        Driver d=new student();
// 接口可以实现面向对象编程
    }
}
interface Driver {}
class people {}
class student extends people implements Driver {}
