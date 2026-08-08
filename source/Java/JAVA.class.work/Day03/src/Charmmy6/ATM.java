package Charmmy6;
import java.util.ArrayList;
import java.util.List;

public class ATM {
    /*编写一个ATM机类，属性包括账户列表，方法有登录，存款和取款*/
    private List<Acount> accounts;  // 账户列表

    public ATM() {
        accounts = new ArrayList<>();
    }

    // 添加账户
    public void addAccount(Acount account) {
        accounts.add(account);
    }

    // 登录方法
    public Acount login(int accountNum, String password) {
        for (Acount account : accounts) {
            if (accountNum == account.getId() && password.equals(account.getPassword())) {
                System.out.println("登录成功");
                return account;
            }
        }
        System.out.println("账号或密码错误");
        return null;
    }

    // 存款
    public void deposit(Acount account, double amount) {
        if (account != null && amount > 0) {
            account.setBalance(account.getBalance() + amount);
            System.out.println("存款成功，余额：" + account.getBalance());
        }
    }

    // 取款
    public void withdraw(Acount account, double amount) {
        if (account != null && amount > 0 && amount <= account.getBalance()) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("取款成功，余额：" + account.getBalance());
        } else {
            System.out.println("取款失败");
        }
    }
}

