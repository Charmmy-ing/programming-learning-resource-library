package charmmy01;

public class Egg {
    public static void main(String[] args) {
        int lcm=egg();
        System.out.println("最少有"+lcm+"个鸡蛋。");
    }
    public static int egg(){
        //9和7的最小公倍数
        int a=9;
        int b=7;
        int lcm=a*b;
        return lcm;
    }

}
