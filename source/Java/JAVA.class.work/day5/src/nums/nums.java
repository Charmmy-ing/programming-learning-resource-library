package nums;

import java.util.Scanner;

public class nums {
    // 从键盘输入一个字符串，分别统计该字符串中所有大写字母、小写字母、数字、其它字符的个数，并分类输出这些字符和统计结果。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 从键盘输入字符串
        System.out.print("请输入一个字符串：");
        String input = scanner.nextLine();
        int upperCount = 0;   // 大写字母计数
        int lowerCount = 0;   // 小写字母计数
        int digitCount = 0;   // 数字计数
        int otherCount = 0;   // 其他字符计数

        // 分类存储字符
        StringBuilder upperChars = new StringBuilder();
        StringBuilder lowerChars = new StringBuilder();
        StringBuilder digitChars = new StringBuilder();
        StringBuilder otherChars = new StringBuilder();

        // 遍历字符串中的每个字符
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {
                upperCount++;
                upperChars.append(ch).append(" ");
            } else if (Character.isLowerCase(ch)) {
                lowerCount++;
                lowerChars.append(ch).append(" ");
            } else if (Character.isDigit(ch)) {
                digitCount++;
                digitChars.append(ch).append(" ");
            } else {
                otherCount++;
                otherChars.append(ch).append(" ");
            }
        }
        // 输出统计结果
        System.out.println("\n=== 统计结果 ===");
        System.out.println("大写字母（" + upperCount + "个）：" + upperChars);
        System.out.println("小写字母（" + lowerCount + "个）：" + lowerChars);
        System.out.println("数字（" + digitCount + "个）：" + digitChars);
        System.out.println("其他字符（" + otherCount + "个）：" + otherChars);

        scanner.close();
    }
}
