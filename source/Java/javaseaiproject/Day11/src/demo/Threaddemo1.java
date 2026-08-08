package demo;

public class Threaddemo1 {
    //模拟线程安全问题
    public static void main(String[] args) {
        Account account = new Account(100000, 1001);
        //创建线程
        new Drawthread("小明", account).start();
        new Drawthread("小红", account).start();
    }
}
