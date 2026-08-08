package charmmy.Scannertext;
import java.util.Scanner;
public class Scannertext
{
    //你的名字，年龄，身高，体重，性别
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的名字：");
        String name=sc.next();
        System.out.println("请输入你的年龄：岁");
        int age=sc.nextInt();
        System.out.println("请输入你的身高：cm");
        double height=sc.nextDouble();
        System.out.println("请输入你的体重：kg");
        double weight=sc.nextDouble();
        System.out.println("请输入你的性别：");
        String gender=sc.next();
        System.out.println(weight/(height*height));








    }
}
