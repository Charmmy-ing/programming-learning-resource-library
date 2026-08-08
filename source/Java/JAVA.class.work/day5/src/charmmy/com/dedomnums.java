package charmmy.com;

import java.util.HashMap;
import java.util.Map;

public class dedomnums {
    public static void main(String[] args) {
        // 使用HashMap保存用户名和密码
        Map<String, String> userMap = new HashMap<>();

        // 添加5个用户的用户名和密码
        userMap.put("admin", "admin123");
        userMap.put("zhangsan", "zs123456");
        userMap.put("lisi", "ls654321");
        userMap.put("wangwu", "ww@123");
        userMap.put("zhaoliu", "zl987654");

        // 打印所有键值对
        System.out.println("=== 用户列表 ===");
        for (Map.Entry<String, String> entry : userMap.entrySet()) {
            System.out.println("用户名：" + entry.getKey() + "，密码：" + entry.getValue());
        }
    }
}