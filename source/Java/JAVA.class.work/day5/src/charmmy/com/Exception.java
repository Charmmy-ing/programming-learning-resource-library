package charmmy.com;

import java.util.Scanner;

public class Exception {
    public Exception(String message) {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 输入三条边
            System.out.print("请输入三角形第一条边：");
            double a = scanner.nextDouble();
            System.out.print("请输入三角形第二条边：");
            double b = scanner.nextDouble();
            System.out.print("请输入三角形第三条边：");
            double c = scanner.nextDouble();

            // 计算面积
            double area = evaluateArea(a, b, c);
            System.out.printf("三角形面积：%.2f\n", area);

        } catch (java.util.InputMismatchException e) {
            System.out.println("错误：输入不是有效数字！");
        } catch (IllegalArgumentException e) {
            // 捕获自定义异常
            System.out.println("自定义异常：" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("算术异常：" + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static double evaluateArea(double a, double b, double c) throws IllegalArgumentException {
        // 验证边长
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("边长必须大于0！");
        }
        // 验证三角形不等式
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("三边无法构成三角形！");
        }
        // 计算面积
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
class InvalidTriangleException extends Exception {
    public InvalidTriangleException(String message) {
        super(message);
    }
}
