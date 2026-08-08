package charmmy;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        //编写实现先输入n，再计算n的阶乘运算，最后输出结果
        factorial();
    }

    public static void factorial() {
        System.out.println("请输入一个整数n：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(n + "的阶乘为：" + result);
    }
}
