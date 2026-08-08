package charmmy01;

import java.util.Scanner;

public class day {
    public static void main(String[] args) {
        day();
    }

    //输入年份和月份，输出该年该月有多少天；
    public static void day() {
        System.out.println("请输入年份和月份：");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int days = 0;
        if (year % 4 == 0 && month == 2) {
            days = 29;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 2:
                    days = 28;
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
            System.out.println(year + "年" + month + "月有" + days + "天");
        }
    }
}
