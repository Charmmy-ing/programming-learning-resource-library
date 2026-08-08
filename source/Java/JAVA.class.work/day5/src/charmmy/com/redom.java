package charmmy.com;

import java.util.Random;
import java.util.Scanner;

public class redom {
    public static void main(String[] args) {
        String verifyCode = generateVerifyCode(6);
        System.out.println("验证码：" + verifyCode);
        // 从键盘输入验证码
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入验证码：");
        String inputCode = scanner.nextLine();
        // 验证（不区分大小写）
        if (verifyCode.equalsIgnoreCase(inputCode)) {
            System.out.println("恭喜验证成功！");
        } else {
            System.out.println("验证失败！");
        }

        scanner.close();
    }

    // 生成指定长度的验证码（包含数字和字母）
    public static String generateVerifyCode(int length) {
        // 验证码字符库：包含数字0-9和大小写字母
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            // 随机获取字符库中的一个字符
            int index = random.nextInt(chars.length());
            sb.append(chars.charAt(index));
        }
        return sb.toString();
    }
}