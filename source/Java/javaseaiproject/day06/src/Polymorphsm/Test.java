package Polymorphsm;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Tortoise();
        a1.run();
        Tortoise  a2 = (Tortoise) a1;
        a2.shrinkHead();
        Wolf w1 = new Wolf();
        go(w1);
        Tortoise t1 = new Tortoise();
        go(t1);

    }


    public static void go(Animal a) {
       System.out.println("开始跑");
        a.run();
        if(a instanceof Tortoise){
            Tortoise t2 = (Tortoise) a;
            t2.shrinkHead();
        }else if(a instanceof Wolf){
            Wolf w2 = (Wolf) a;
            w2.eat();        }
    }
}