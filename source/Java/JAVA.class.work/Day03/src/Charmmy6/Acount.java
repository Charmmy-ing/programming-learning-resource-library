package Charmmy6;

public class Acount {
    /*模仿ATM取款过程。首先编写一个账户类，成员变量包含账号、储户姓名和存款余额以及密码*/
    private int id;
    private String name;
    private double balance;
    private String password;
    public Acount(int id, String name, double balance, String password) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
