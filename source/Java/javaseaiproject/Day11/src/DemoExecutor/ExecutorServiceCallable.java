package DemoExecutor;

import java.util.concurrent.*;

public class ExecutorServiceCallable {
    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        {
           Future<String> future = pool.submit(new MyCallable(10));
           try {
                System.out.println(future.get());
           } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
           }
        }
        pool.shutdown();
    }
}
