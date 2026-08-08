package charmmy01;

import java.util.Scanner;

public class TwelveChinesezodiacsigns {
    public static void main(String[] args) {
        zodiac();
    }

    public static void zodiac() {
        /*用户输入自己的出生年份，程序输出其属相。分析：出生年份除以12，取余数，余数参照下列数字对应生肖动物：
        0:猴	1:鸡	2:狗	3:猪	4:鼠	5:牛	6:虎	7:兔	8:龙	9:蛇	10:马	11:羊
        用 switch语句 进行多分支判断即可输出对应的生肖。*/
        System.out.println("请输入您的出生年份：");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int zodiac = year % 12;
        switch (zodiac) {
            case 0:
                System.out.print("您的生肖是：猴");
                break;
            case 1:
                System.out.print("您的生肖是：鸡");
                break;
            case 2:
                System.out.print("您的生肖是：狗");
                break;
            case 3:
                System.out.print("您的生肖是：猪");
                break;
            case 4:
                System.out.print("您的生肖是：鼠");
                break;
            case 5:
                System.out.print("您的生肖是：牛");
                break;
            case 6:
                System.out.print("您的生肖是：虎");
                break;
            case 7:
                System.out.print("您的生肖是：兔");
                break;
            case 8:
                System.out.print("您的生肖是：龙");
                break;
            case 9:
                System.out.print("您的生肖是：蛇");
                break;
            case 10:
                System.out.print("您的生肖是：马");
                break;
            case 11:
                System.out.print("您的生肖是：羊");
                break;
        }
    }
}
