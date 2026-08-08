package charmmy;

public class ifdemo {
    public static void main(String[] args) {
        TEST();
        TEST2();
    }
    //目标学会if语句；
    public static void TEST(){
        int age=18;
        if(age>=18){
            System.out.println("成年人");
            return;
        }
        System.out.println("未成年人");
           }
           //现在我要给别人转账，我微信有90；要转100，若不够则弹出余额不足
    public static void TEST2(){
        int money=90;
        if(money<100){
            System.out.println("余额不足");
            return;
        }
        System.out.println("转账成功");
    }
}
