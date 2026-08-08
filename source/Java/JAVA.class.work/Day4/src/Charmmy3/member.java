package Charmmy3;

public class member {
    //会员的姓名性别，余额，缴费1500元
    private String name;
    private String sex;
    private double balance;
    //会员的默认构造方法
    public member() {
    }
    public member(String name, String sex, double balance) {
        this.name = name;
        this.sex = sex;
        this.balance = balance;
    }
    //会员的缴费方法
    public void pay() {
        if (balance < 1500) {
            System.out.println("会员" + name + "的余额不足");
        }else if (balance >= 1500) {
            balance -= 1500;
            System.out.println("会员" + name + "交费1500元");
            System.out.println("会员" + name + "的余额为" + balance);
            setBalance(balance);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
