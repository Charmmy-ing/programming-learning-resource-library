package Charmmy6;

public class Test {
    public static void main(String[] args) {
        // 创建账户
        Acount account = new Acount(1001, "张三", 1000.0, "123456");

        // 创建ATM并添加账户
        ATM atm = new ATM();
        atm.addAccount(account);

        // 登录
        Acount loggedIn = atm.login(1001, "123456");

        // 存款取款
        atm.deposit(loggedIn, 500);
        atm.withdraw(loggedIn, 300);
    }
}


