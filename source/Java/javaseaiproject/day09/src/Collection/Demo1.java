package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
public class Demo1 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("阿德");
        list.add("2");
        list.add("3.33");
        list.add("6");
        list.add("5");
        System.out.println(list);
        /*Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for (String item : list) {
            System.out.println(item);*/
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //简化为lambda表达式
        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);
    }
}
