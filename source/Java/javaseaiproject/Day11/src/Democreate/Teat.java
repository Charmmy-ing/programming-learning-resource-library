package Democreate;

public class Teat {
    public static void main(String[] args) {
        Thread demo=new Demo();
        demo.start();
        for(int i=0;i<10;i++){
            System.out.println("主线程"+i);
        }
    }
}

class Demo extends Thread{
    @Override
    public void run() {
        //线程体，线程要执行的任务
        for(int i=0;i<10;i++){
            System.out.println("子线程"+i);
        }
    }
}
