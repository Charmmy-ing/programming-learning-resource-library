package charmmy.com;

import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        //键盘输入一个原始字符串作为明文，然后使用加密方法加密，再对加密字符串进行解密。样例如下图，加密方法自定，完成其功能并测试。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原始字符串作为明文:");
        String plainText = sc.nextLine();
        System.out.println("加密后的字符串为: " + encrypt(plainText));
        System.out.println("解密后的字符串为: " + decrypt(encrypt(plainText)));
    }
    public static String encrypt(String plainText) {
        // 加密方法：将明文中的每个字符的ASCII码值加1，返回加密后的字符串
            StringBuilder sb = new StringBuilder();
            for (char c : plainText.toCharArray()) {
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    sb.append((char) (c + 1));
                } else {
                    sb.append(c);
                }
            }
            return sb.toString();
        }

    public static String decrypt(String encryptedText) {
        // 解密方法：将加密后的字符串中的每个字符的ASCII码值减1，返回解密后的字符串
        StringBuilder sb = new StringBuilder();
        for (char c : encryptedText.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                sb.append((char) (c - 1));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
