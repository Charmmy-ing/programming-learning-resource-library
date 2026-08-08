package Interface1;

public class Test {
    public static void main(String[] args) {
        //理解接口设计模式
        System.out.println(A.SCHOOL_NAME);
        //接口是用来实现的，不能直接创建对象

    }
}
class c implements B,A {

    @Override
    public void write() {   }
    @Override
    public void jump() {  }
    @Override
    public void run() {  }

}
