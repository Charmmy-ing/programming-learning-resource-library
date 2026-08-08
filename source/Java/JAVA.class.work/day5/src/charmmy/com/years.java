package charmmy.com;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class years {
    public static void main(String[] args) {
        // 蛇年春节日期：2027年1月29日（农历正月初一）
        LocalDate springFestival = LocalDate.of(2027, 1, 29);
        // 获取当前日期
        LocalDate today = LocalDate.now();
        // 计算距离春节的天数
        long daysUntil = ChronoUnit.DAYS.between(today, springFestival);
        // 输出结果
        System.out.println("距离蛇年春节还有" + daysUntil + "天");
    }
}