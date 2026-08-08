package Charmmy4;

public class Test {
    public static void main(String[] args) {
        Televison tv = new Televison();
        System.out.println(tv);
        Televison tv2 = new Televison( true, 10, 0);
        System.out.println(tv2);
        tv2.setOn(true);
        tv2.setVolume(100);
        System.out.println(tv2);
        tv2.setChannel(103);
        System.out.println(tv2);
        tv2.setOn(false);



    }
}
