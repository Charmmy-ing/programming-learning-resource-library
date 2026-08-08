package scanner;

import java.util.Scanner;

public class Scannerdome {
    public static void main(String[] args) {
        printInfo();
    }
    public static void printInfo() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String name = sc.next();
        System.out.println("your name:" + name);
        //+号可以做连接操作
        System.out.println("your age:" + a);
    }
}
