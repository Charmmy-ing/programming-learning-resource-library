package Deno2;

public class demo {
    public static void main(String[] args) {
        //创建线程对象
        //把线程任务类对象作为参数传递给线程对象的构造方法，才可以启动线程
        Thread thread = new Thread(() -> {

                     for (int i = 0; i < 10; i++) {
                        //线程1在运行
                        System.out.println("线程1在运行"+i);
                    }
                });
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("线程2在运行"+i);
            }
        });
        thread1.start();
        //启动线程
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程在运行"+i);
        }

    }
}
//创建线程任务类
/*class MyRunnable implements Runnable{
    @Override
    public void run() {
        //线程1在运行
        for (int i = 0; i < 10; i++) {
            System.out.println("线程2在运行"+i);
        }
    }
}
*/