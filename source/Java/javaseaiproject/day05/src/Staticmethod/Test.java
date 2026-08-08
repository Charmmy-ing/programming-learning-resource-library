package Staticmethod;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 调用一个方法返回执行位数的验证码，验证码可以是数字和字符
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter n：");
        int n = sc.nextInt();
        genneration(n);
    }
    //0数字 1小字母 2大字母
    // 定义一个方法，返回一定位数的验证码，验证码可以是数字和字符也可以是数字与字符的组合
    public static void genneration(int n){
        String num="";
        for (int i = 1; i <= n; i++) {
            int type = (int) (Math.random()*3);
            switch (type) {
                case 0:
                    num += (int)(Math.random() * 10);
                    break;
                case 1:
                    num += (char)(65 + (int)Math.random() * 26);
                    break;
                case 2:
                    num += (char)(97+ (int)Math.random() * 26);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
        System.out.println(num);

    }

}
