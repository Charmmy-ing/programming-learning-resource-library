package StreamDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();
        Map<String,String> map = new HashMap<>();
         Stream<String> stream1 = map.keySet().stream();
         Stream<String> stream2 = map.values().stream();
         Stream<Map.Entry<String, String>> stream3 = map.entrySet().stream();
                 //获取数组的stream流
        String[] string = {"a","b","c"};
        Stream<String> stream4 = Arrays.stream(string);
        Stream<String> stream5 = Stream.of("a","b","c");


    }
}
