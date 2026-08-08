package charmmy.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

    public class ARR {
        public static void main(String[] args) {
            // 创建ArrayList并添加10个整数（包含重复元素）
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(20);
            list.add(40);
            list.add(50);
            list.add(30);
            list.add(60);
            list.add(70);
            list.add(20);
            System.out.println("=== 使用Iterator遍历集合 ===");
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
            System.out.println();// 从键盘输入要查找的元素
            Scanner scanner = new Scanner(System.in);
            System.out.print("\n请输入要查找的整数：");
            int target = scanner.nextInt();

            // 使用Iterator查找元素
            System.out.println("=== 查找元素 " + target + " ===");
            iterator = list.iterator();
            boolean found = false;
            int index = 0;
            while (iterator.hasNext()) {
                int element = iterator.next();
                if (element == target) {
                    System.out.println("找到元素 " + target + "，位置：" + index);
                    found = true;
                }
                index++;
            }
            if (!found) {
                System.out.println("未找到元素 " + target);
            }
            // 删除重复元素
            System.out.println("\n=== 删除重复元素 ===");
            ArrayList<Integer> uniqueList = new ArrayList<>();
            iterator = list.iterator();
            while (iterator.hasNext()) {
                int element = iterator.next();
                if (!uniqueList.contains(element)) {
                    uniqueList.add(element);
                }
            }
            System.out.println("删除重复后的集合：" + uniqueList);

            scanner.close();
        }
    }
