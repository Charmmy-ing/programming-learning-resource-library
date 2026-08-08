package lambda;

public class Lambdademo {
    public static void main(String[] args) {
        Animal a1=new Animal(){
            @Override
            public void say() {
                System.out.println("I am a cat");
            }
        };
        a1.say();
        swim s1=new swim(){
            @Override
            public void swimming() {
                System.out.println("I am a fish");
            }
        };
        s1.swimming();
        //lambda表达式
        swim s2=()->{
            System.out.println("I am a fish");
        };
        s2.swimming();
    }
}
abstract class Animal {
    public abstract void say();
}
interface swim{
    void swimming();
}
