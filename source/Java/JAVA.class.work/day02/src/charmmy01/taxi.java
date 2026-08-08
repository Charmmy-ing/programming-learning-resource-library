package charmmy01;

import java.util.Scanner;

public class taxi {
    public static void main(String[] args) {
        //起步2公里内5元，2公里以上每公里收费1.3元，9公里以上每公里收费2元，燃油附加费1元。
        //输入公里数，计算所需的出租车费用。
     double money=taxi();
     System.out.println("出租车费用为：" + money);
    }
    public static double taxi(){
        double money=0;
        System.out.println("请输入公里数：");
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        if (km <= 2) {
            money = 5;
        } else if (km <= 9) {
            money = 5 + (km - 2) * 1.3;
        } else {
            money = 5 + (km - 9) * 2 + 1;
        }
        return money;
    }
}
