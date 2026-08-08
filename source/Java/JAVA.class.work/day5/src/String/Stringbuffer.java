package String;

import java.util.Scanner;

public class Stringbuffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 功能1：使用StringBuffer对键盘输入的字符串进行反转
        System.out.print("请输入一个字符串：");
        String input = scanner.nextLine();
        StringBuffer sb = new StringBuffer(input);
        String reversed = sb.reverse().toString();
        System.out.println("反转后的字符串：" + reversed);

        // 功能2：使用String和StringBuffer分别对数组进行字符串拼接
        System.out.println("\n=== 功能2：数组字符串拼接 ===");
        String[] array = {"Hello", "World", "Java", "String"};
        for (String s : array) {
            System.out.println(s);
        }

        // 使用String进行拼接
        String strResult = "";
        for (String s : array) {
            strResult += s;
        }
        System.out.println("使用String拼接结果：" + strResult);
        // 使用StringBuffer进行拼接
        StringBuffer sbResult = new StringBuffer();
        for (String s : array) {
            sbResult.append(s);
        }
        System.out.println("使用StringBuffer拼接结果：" + sbResult.toString());
    }
}