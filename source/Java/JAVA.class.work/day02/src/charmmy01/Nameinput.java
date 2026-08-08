package charmmy01;

import java.util.Scanner;

public class Nameinput {
    public static void main(String[] args) {
        Nameinput();
    }
    //实现会员注册，要求用户名长度不小于3，密码长度不小于6，若不满足需有提示信息，提示输入有误；注册时两次输入密码必须相同（字符串）。
    public static void Nameinput() {
        System.out.println("请输入用户名：");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        if (username.length() < 3) {
            System.out.println("用户名长度不能小于3");
            return;
        }
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        if (password.length() < 6) {
            System.out.println("密码长度不能小于6");
            return;
        }
        System.out.println("请确认密码：");
        String confirmPassword = sc.nextLine();
        if (!confirmPassword.equals(password)) {
            System.out.println("两次输入密码不一致");
            return;
        }
        System.out.println("注册成功");
    }
}
