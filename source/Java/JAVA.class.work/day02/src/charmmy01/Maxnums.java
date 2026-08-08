package charmmy01;

import java.util.Scanner;

public class Maxnums {
    public static void main(String[] args) {
        find();
    }
    public static void find() {
        //能分别求任意个数字里最大值
        Scanner input = new Scanner(System.in);
        while (true) {
        System.out.println("请输入数字个数：");
        int num = input.nextInt();
        double max = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println("请输入第" + i + "个数字：");
            double n = input.nextDouble();
            if (n > max) {
                max = n;
            }
        }
        System.out.println("最大值为：" + max);
        }
    }
}
