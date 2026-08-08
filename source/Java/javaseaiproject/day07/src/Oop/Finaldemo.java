package Oop;

public class Finaldemo {
    public static void main(String[] args) {
//final修饰变量：不能被重新赋值
        final int a = 10;
        //a = 20; //错误
        final int[] arr = {1,2,3};
        arr[0] = 4;
        System.out.println(arr[0]);
        //arr=new int[]{5,6,6};

    }
}
class A extends B {
    //public void pay() {
     //   System.out.println("Pay A");
    //}
}
class B {
    public final void pay() {
        System.out.println("Pay");
    }
}

