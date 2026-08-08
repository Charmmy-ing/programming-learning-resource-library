package test;

public class discoverprimenumber {
    //在一个范围内找到所有质数
    //当一个数只能被1和它本身开平方的数之间的某数除尽时，这个数就不是质数
    public static void main(String[] args) {
        discover();
    }
    public  static void discover(){
        int count=0;
        for (int i = 2; i < 200; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
        if (isPrime) {
            System.out.println(i+"是质数");
            count++;
        }
        }
        System.out.println("1-200之间有"+count+"个质数");
    }
}
