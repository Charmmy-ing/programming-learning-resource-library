package demo;

public class Account {
    private double balance;
    private double cardID;
    public Account(double balance, double cardID) {
        this.balance = balance;
        this.cardID = cardID;
    }
    public Account() {}

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCardID() {
        return cardID;
    }

    public void setCardID(double cardID) {
        this.cardID = cardID;
    }

    public synchronized void drawMony(double money) {

            if (balance >= money) {
                balance -= money;
                String name = Thread.currentThread().getName();
                System.out.println(name + "取钱" + money + "元");
                System.out.println("余额为" + balance + "元");
            } else {
                String name = Thread.currentThread().getName();
                System.out.println(name + "取钱" + money + "余额不足");
            }
        }
}
