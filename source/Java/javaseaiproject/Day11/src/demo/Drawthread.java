package demo;

public class Drawthread extends Thread {
    private Account account;

    public Drawthread(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        //模拟取钱
        account.drawMony(100000);
    }
}