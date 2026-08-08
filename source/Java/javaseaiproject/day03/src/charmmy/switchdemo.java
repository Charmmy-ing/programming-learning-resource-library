package charmmy;

import java.util.Scanner;

public class switchdemo {
    public static void main(String[] args) {
        TEST();
    }
    public static void TEST(){
        //用户输入性别
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入性别：");
        String sex=sc.next();
        switch (sex){
            case "男":
                System.out.println("推荐文科");
                break;
            case "女":
                System.out.println("推荐理科");
                break;
            default:
                System.out.println("请输入男或女");
        }
    }
}
