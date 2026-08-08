package DemoExecutor;

import java.util.concurrent.*;

public class ExecutorSercive {
    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        {
            Runnable task = new Myrunable();
            pool.execute(task);//创建第一个线程
            pool.execute(task);//创建第二个线程
            pool.execute(task);//创建第三个线程
            pool.execute(task);
            pool.execute(task);
            pool.execute(task);
            pool.execute(task);
            pool.execute(task);
            //关闭线程池
            pool.shutdown();

        }
    }
}