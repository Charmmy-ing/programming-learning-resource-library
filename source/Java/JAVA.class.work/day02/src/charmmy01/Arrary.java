package charmmy01;

import java.util.Scanner;

public class Arrary {
    public static void main(String[] args) {
        Arrary();
    }
    //定义一维数组并初始化，通过键盘任意输入一个数，查找该数是否存在（结果返回下标值）。
    public static void Arrary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("请输入数组元素：");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("请输入要查找的数：");
        int find = sc.nextInt();
        int index = -1;
        for (int i = 0; i < len; i++) {
            if (arr[i] == find) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("该数不存在");
        } else {
            System.out.println("该数存在，下标为：" + index);
        }
    }
}
