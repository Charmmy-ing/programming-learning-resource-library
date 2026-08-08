package StreamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class TestStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("张二");
        list.add("张六");
        list.add("赵六");
        list.add("王二");
        List<String> newlist= new ArrayList<>();
        for(String name: list) {
            if (name.startsWith("张")) {
                newlist.add(name);
            }
        }
        System.out.println(newlist);
        //stream流操作
       List<String> list1 = list.stream().filter(name -> name.startsWith("张")).collect(Collectors.toList());
       System.out.println(list1);
    }
}
