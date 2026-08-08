package Charmmy6;


// Shape接口
interface Shape {
    double length();
}

// 三角形类
class Triangle implements Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double length() {
        // 判断边长是否合法（不能为0或负数）
        if (a <= 0 || b <= 0 || c <= 0) {
            return 0;
        }
        // 判断能否构成三角形（任意两边之和大于第三边）
        if (a + b > c && a + c > b && b + c > a) {
            return a + b + c;
        }
        return 0;
    }
}

// 长方形类
class Rectangle implements Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double length() {
        // 判断边长是否合法
        if (width <= 0 || height <= 0) {
            return 0;
        }
        return 2 * (width + height);
    }
}

// 圆形类
class Circle implements Shape {
    private double radius;
    private static final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double length() {
        // 判断半径是否合法
        if (radius <= 0) {
            return 0;
        }
        return 2 * PI * radius;
    }
}

// 测试类
public class Test3 {
    public static void main(String[] args) {
        Shape shape;

        // 测试三角形
        shape = new Triangle(3, 4, 5);
        System.out.println("三角形周长: " + shape.length());

        // 测试不能构成三角形的情况
        shape = new Triangle(1, 1, 3);
        System.out.println("不能构成三角形的周长: " + shape.length());

        // 测试长方形
        shape = new Rectangle(4, 5);
        System.out.println("长方形周长: " + shape.length());

        // 测试圆形
        shape = new Circle(5);
        System.out.println("圆形周长: " + shape.length());

        // 测试非法输入
        shape = new Triangle(-1, 2, 3);
        System.out.println("边长为负数的三角形周长: " + shape.length());

        shape = new Rectangle(0, 5);
        System.out.println("宽为0的长方形周长: " + shape.length());

        shape = new Circle(-3);
        System.out.println("半径为负数的圆形周长: " + shape.length());
    }
}