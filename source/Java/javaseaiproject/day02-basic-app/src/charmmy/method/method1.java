package charmmy.method;

public class method1 {
    public static void main(String[] args) {
        //调用方法
        int result = sum(10, 20);
        System.out.println(result);
        //调用方法
        printHello();
        //调用方法
        String code = getCode(4);
        System.out.println(code);
        //调用方法
        printHello("hello");
        //调用方法
        printHello(100);
    }
    //求任意数字的和，并返回结果
    public static int sum(int a,int b){
        return a+b;
    }
    //打印三行hello world
    public static void printHello(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }
    //获取一个指定位数的验证码并返回
    public static String getCode(int len){
        String code = "";
        for(int i=0;i<len;i++){
            code += (int)(Math.random()*10);
        }
        return code;

    }
    //定义两个重载的方法
    public static void printHello(String str){
        System.out.println(str);
    }
    //定义一个重载的方法，用于打印一个整数
    public static void printHello(int num){
        System.out.println(num);
    }
    //需求发射导弹
    public static void launchMissile(){
        System.out.println("发射导弹");
    }
    //需求发射导弹
    public static void launchMissile2(){
        System.out.println("发射导弹2");
    }
   }
