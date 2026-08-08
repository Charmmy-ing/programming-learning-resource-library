package Charmmy;

public class Test {
    public static String name;
    public static String nums[]=new String[54];
    //静态代码块优先执行
    public static void main(String[] args) {
    System.out.println("Test的main方法");
    System.out.println(name);
    }
    //静态代码块优先执行
    static{
        System.out.println("B的静态代码块");
        name = "B";
        for(int i=0;i<nums.length;i++){
            nums[i]=""+i;
        System.out.println(nums[0]);
        }

    }
}
