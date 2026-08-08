package Democreate;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class threaddemo3 {
    public static void main(String[] args) {
        MyCallable myCallable=new MyCallable(100);
        FutureTask<String> futureTask=new FutureTask<>(myCallable);
        Thread thread=new Thread(futureTask);
        thread.start();
        try {
            System.out.println(futureTask.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        MyCallable mC=new MyCallable(50);
        FutureTask<String> futureTas=new FutureTask<>(mC);
        Thread td=new Thread(futureTas);
        td.start();
        try {
            System.out.println(futureTas.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }
    @Override
    public String call() throws Exception {
        int sum=0;
        for (int i = 0; i <= n; i++) {
            sum+=i;
        }
        return "子线程求得1+"+n+"的和为："+sum;
    }
}
