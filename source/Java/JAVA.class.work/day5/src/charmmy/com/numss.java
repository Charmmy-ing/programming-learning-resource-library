package charmmy.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class numss {
        public static void main(String[] args) {
            String str = "1949年10月1日";
            String regex = "\\d+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);
            // 输出原始字符串
            System.out.println("原始字符串：" + str);
            System.out.print("提取的数字：");
            while (matcher.find()) {
                System.out.print(matcher.group() + " ");
            }
            System.out.println();
        }
    }

