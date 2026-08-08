package DemoExecutor;

public class Myrunable implements Runnable{
    @Override
    public void run() {
        for(int j=0;j<5;j++){
            System.out.println(Thread.currentThread().getName()+"正在执行"+j);
            try {
                Thread.sleep(Integer.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
