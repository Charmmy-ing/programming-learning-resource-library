package Charmmy3;

public class parttimemember extends member implements employee {
    //兼职会员的默认构造方法
    public parttimemember() {
        super();
    }
    //兼职会员的有参构造方法
    public parttimemember(String name, String sex, double balance) {
        super(name, sex, balance);
    }
    //兼职会员会随机得到1000到3000的工资加到余额中
    @Override
    public double getSalary() {
        double salary = Math.random() * 2000 + 1000;
        double newBalance = getBalance() + salary;
        setBalance(newBalance);
        return newBalance;
    }

    //兼职员工交会费1500元
    @Override
    public void pay() {
        if (getBalance() < 1500) {
            System.out.println("兼职员工" + getName() + "加油干吧");
        }else if (getBalance() >= 1500) {
            double newBalance = getBalance() - 1500;
            System.out.println("兼职员工" + getName() + "交费1500元");
            System.out.println("兼职员工" + getName() + "的余额为" + newBalance);
            setBalance(newBalance);
        }
    }
}
