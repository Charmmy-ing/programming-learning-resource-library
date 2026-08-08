package API;

import java.util.Scanner;

public class Stringdemo {
    public static void main(String[] args) {
        //方式1
        String str1 = "abc";
        System.out.println(str1.length());
        //方式2，构造器
        String str2 = new String();
        System.out.println(str2);
        //方式3，构造器
        String str3 = new String("hello");
        System.out.println(str3);
        //方式4，字符数组构造器
        char[] chars = {'a','b','c'};
        String str4 = new String(chars);
        System.out.println(str4);
        //方式5，字节数组构造器
        byte[] bytes = {97,98,99};
        String str5 = new String(bytes);
        System.out.println(str5);
        //方式6，字符串常量
        String str6 = "hello";
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str7 = scan.nextLine();
      if(str7.equals(str6)){
          System.out.println("你输入的字符串是hello");
      }

    }
}
