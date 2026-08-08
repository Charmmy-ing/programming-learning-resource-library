package Error;

public class Exceptiondemo {
    public static void main(String[] args) {
        //自定义异常
        try {
            test(   150);
        } catch (AgeExceptionrewrite e) {
            System.out.println(e.getMessage());
        }

    }
    //当员工年龄小于0，大于120时，抛出异常
    //当员工年龄在0-120之间，正常运行
    public static void test(int age) throws AgeExceptionrewrite {
        if (age < 0 || age > 120) {
            throw new AgeExceptionrewrite("年龄异常");
        }else{
            System.out.println("年龄正常");
        }
    }
}
