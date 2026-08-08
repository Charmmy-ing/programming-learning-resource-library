package logic;

import java.util.Scanner;

public class logicdome1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        int weight=sc.nextInt();
        String sex=sc.next();
        checkInfo(height,weight,sex);
    }
    //需求判断个人条件是否满足我的要求
    public static void checkInfo(int height,int weight,String sex){
        boolean result = height>170&weight>60&height<180&weight<70&sex=="女";
        System.out.println(result);
    }
}
