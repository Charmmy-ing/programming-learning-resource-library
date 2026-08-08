package charmmy.type;

public class typedemo {
    public static void main(String[] args) {
       //理解表达式自动类型转换
       int acc=(int) print((byte) 1,222,1.22);
        System.out.println(acc);
    }
    //接收不同数据类型的运算
    public static double print(byte A,int b,double c) {
        return  A+b+c;
    }


}
