package charmmy.com;

import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 输入年份
        System.out.print("请输入年份：");
        int year = scanner.nextInt();
        // 判断是否为闰年
        boolean isLeapYear = isLeapYear(year);
        int februaryDays = isLeapYear ? 29 : 28; // 输出二月的天数结果
        System.out.println(year + "年的二月有" + februaryDays + "天");

        scanner.close();
    }
    public static boolean isLeapYear(int year) {
        // 闰年规则：能被4整除但不能被100整除，或者能被400整除
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}