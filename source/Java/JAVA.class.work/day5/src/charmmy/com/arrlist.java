package charmmy.com;

import java.util.ArrayList;

    public class arrlist {
        public static void main(String[] args) {
            ArrayList<Object> list = new ArrayList<>();
            // 添加指定数据到ArrayList
            list.add("hello");
            list.add(123);
            list.add(6.9);
            list.add("hello");
            list.add("");
            list.add("Hello");
            StringBuffer s = new StringBuffer("hello");
            list.add(s);
            //  打印所有元素
            System.out.println("=== 打印所有元素 ===");
            System.out.println(list);

            System.out.println("\n=== 查找元素'hello' ===");
            boolean containsHello = list.contains("hello");
            System.out.println("ArrayList中是否包含'hello'：" + containsHello);
            // 查找所有"hello"的索引位置
            System.out.print("'hello'出现的索引位置：");
            for (int i = 0; i < list.size(); i++) {
                if ("hello".equals(list.get(i))) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            System.out.println("\n=== 删除元素'hello' ===");
            boolean removed = list.remove("hello");
            System.out.println("删除是否成功：" + removed);
            System.out.println("删除后的ArrayList：" + list);
            System.out.println("\n=== 替换元素123为1000 ===");
            int index = list.indexOf(123);
            if (index != -1) {
                list.set(index, 1000);
                System.out.println("替换成功！");
            } else {
                System.out.println("未找到元素123！");
            }
            System.out.println("替换后的ArrayList：" + list);
        }
    }
