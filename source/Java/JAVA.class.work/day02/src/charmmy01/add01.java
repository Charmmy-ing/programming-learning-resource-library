package charmmy01;

import java.util.Scanner;

public class add01 {
    public static void main(String[] args) {
        add();
    }
    //求任意输入的十个数的和
    public static void add() {
        System.out.println("请输入十个整数：");
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += sc.nextInt();
        }
        System.out.println("这十个整数的和为：" + sum);
    }
}
