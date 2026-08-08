package ArrayList;

import java.util.ArrayList;

public class Arraydemo1 {
    public static void main(String[] args) {
        //掌握arraylist的基本使用方法
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("python");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        for(String s: list){
            System.out.println(s);
        }
        list.remove(2);
        System.out.println(list);

    }
}
