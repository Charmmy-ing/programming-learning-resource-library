package innerclass;

public class Outer {
    //无static修饰的内部类，只能在外部类的实例化对象中调用
    public class Inner{
        public void show(){
            System.out.println("Inner");
        }
    }
}
