package charmmy01;

import java.util.Scanner;

public class threenums {
    public static void main(String[] args) {
        threefun();
    }
    //获取三个整数中的最大值（三元运算）
    public static void threefun() {
        System.out.println("请输入三个整数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a > b ? a : b;
        max = max > c ? max : c;
        System.out.println("三个整数中的最大值为：" + max);
    }
}
