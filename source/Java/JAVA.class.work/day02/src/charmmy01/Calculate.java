package charmmy01;

public class Calculate {
    public static void main(String[] args) {
        //用for循环计算1+1/2!-1/3!+1/4!-1/5!…的前20项之和。
        calculate();
    }

    public static void calculate() {
        double sum = 0.0;
        for (int i = 1; i <= 20; i++) {
            sum += (i % 2 == 0 ? -1 : 1)/factorial(i);
        }
        System.out.println("前20项之和为：" + sum);
    }
    //计算阶乘
    public static double factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}