package charmmy05;

import java.util.Scanner;

public class Movingarrdemo {
    public static void main(String[] args) {
        movingarr();
    }

    public static void movingarr() {
//        动态初始化数组元素
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
//        动态初始化数组元素
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
