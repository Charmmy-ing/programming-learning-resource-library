package Error;

import java.util.Scanner;

public class Errordemo {
    public static void main(String[] args) {
        int a;
        int b ;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入a和b");
        a = sc.nextInt();
        b = sc.nextInt();
        int c;
        c = test(a, b);
        try {
            c = test(a, b);
            System.out.println(c);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int test(int a, int b) throws RuntimeException {
        // 检查参数是否符合要求
        if (b == 0) {
            // 抛出异常
            throw new RuntimeException("b不能为0");
        }
        return a / b;
    }
}
