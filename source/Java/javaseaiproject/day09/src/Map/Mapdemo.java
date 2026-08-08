package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Mapdemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 25);
        map.put("李四", 19);
        map.put("赵六", 21);
        map.put("王二", 22);
        map.keySet().forEach(key -> System.out.println(key));
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        System.out.println(map.entrySet());
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
map.forEach(new BiConsumer<String, Integer>() {
    @Override
    public void accept(String s, Integer integer) {
        System.out.println(s + " : " + integer);
    }
});
map.forEach((key, value) -> System.out.println(key + " : " + value));
    }

    }
