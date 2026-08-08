package charmmy;

public class Father {
    private void sayHello() {
        System.out.println("private");
    }
     void sayHello2() {
        System.out.println("default");
    }
    protected void sayHello3() {
        System.out.println("protected");
    }
    public void sayHello4() {
        System.out.println("public");
    }
    public static void main(String[] args) {
        Father f = new Father();
        f.sayHello4();
        f.sayHello();
        f.sayHello2();
        f.sayHello3();

    }
   }
