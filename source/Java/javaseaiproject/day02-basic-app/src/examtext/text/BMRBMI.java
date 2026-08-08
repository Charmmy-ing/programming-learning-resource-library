package examtext.text;

import java.util.Scanner;

public class BMRBMI {
    public static void main(String[] args) {
        Body body = new Body();
    }
    //完成一个健康计算器，用于计算人的基础代谢率
    //1.先输入个人身高 体重 性别 年龄
    //2.根据公式计算BMR BMI
    //3.输出结果
    public static double printBMI(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in inches: ");
        double height = sc.nextDouble();
        System.out.print("Enter your width in inches: ");
        double width = sc.nextDouble();
        return width/(height*height);
    }
    public static double printBMR(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in inches: ");
        double height = sc.nextDouble();
        System.out.print("Enter your width in inches: ");
        double width = sc.nextDouble();
        System.out.print("Enter your sex in inches: ");
        String sex= sc.next();
        System.out.print("Enter your age in inches: ");
        int age = sc.nextInt();
        //计算BMR
        return 88.362+(13.3397*width)+4.799*height-5.677*age;    }
}
