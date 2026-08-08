package DemoExecutor;

import java.util.concurrent.Callable;

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
