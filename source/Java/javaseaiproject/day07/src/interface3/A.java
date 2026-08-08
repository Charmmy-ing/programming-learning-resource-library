package interface3;

public interface A {
    public default void a(){
        System.out.println("a");
        b();
    };
    private void b(){
        System.out.println("b");
    };
    static void show(){
        System.out.println("show");
    }
}
