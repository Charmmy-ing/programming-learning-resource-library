package charmmy.Scannertext;
import java.util.Scanner;
public class 拆分
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个3位整数：");
        int a=sc.nextInt();
        int ge=a/1%10;
        int shi=a/10%10;
        int bai=a/100%10;
        System.out.println("个位是"+ge+" 十位是"+shi+" 百位是"+bai);
    }

}
