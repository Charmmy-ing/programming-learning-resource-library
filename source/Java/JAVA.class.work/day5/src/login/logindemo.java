package login;

import java.util.Scanner;

        public class logindemo {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // 存储注册信息
                String username = "";
                String password = "";
                nameandpassword nameandpassword = new nameandpassword("刘", "123456");

                // 注册环节
                while (true) {
                    System.out.println("=== 用户注册 ===");
                    System.out.print("请输入用户名: ");
                    username = scanner.nextLine();

                    System.out.print("请输入密码: ");
                    password = scanner.nextLine();

                    System.out.print("请确认密码: ");
                    String confirmPassword = scanner.nextLine();

                    System.out.print("请输入手机号码: ");
                    String phone = scanner.nextLine();

                    // 验证密码是否一致
                    if (password.equals(confirmPassword)) {
                        System.out.println("注册成功！");
                        break;
                    } else {
                        System.out.println("密码不一致，请重新注册\n");
                    }
                }

                // 登录环节
                int loginAttempts = 3;
                boolean loginSuccess = false;

                while (loginAttempts > 0) {
                    System.out.println("\n=== 用户登录 ===");
                    System.out.println("剩余登录次数: " + loginAttempts);

                    System.out.print("请输入用户名: ");
                    String inputUsername = scanner.nextLine();

                    System.out.print("请输入密码: ");
                    String inputPassword = scanner.nextLine();

                    // 验证登录（密码不区分大小写）
                    if (username.equals(inputUsername) && password.equalsIgnoreCase(inputPassword)) {
                        System.out.println("登录成功！");
                        loginSuccess = true;
                        break;
                    } else {
                        loginAttempts--;
                        if (loginAttempts > 0) {
                            System.out.println("密码错误，请重新输入！");
                        }
                    }
                }

                if (loginSuccess) {
                    // 打开Windows计算器
                    try {
                        Runtime.getRuntime().exec("calc.exe");
                        System.out.println("已打开Windows计算器");
                    } catch (Exception e) {
                        System.out.println("打开计算器失败: " + e.getMessage());
                    }
                } else {
                    System.out.println("登录失败，无法再继续登录");
                }

                scanner.close();
            }
        }
         class nameandpassword {
            private String name;
            private String password;
            public nameandpassword(String name, String password) {
                this.name = name;
                this.password = password;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }
        }




