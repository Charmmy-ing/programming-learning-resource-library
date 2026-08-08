package Collection;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("红枸杞");
        set.add("红枸杞");
        set.add("黑枸杞");
        set.add("西洋参");
        set.add("红参");
        set.add("白参");
        System.out.println(set);
        //建立TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("红枸杞");
        treeSet.add("黑枸杞");
        treeSet.add("西洋参");
        treeSet.add("白参");
        treeSet.add("红参");
        System.out.println(treeSet);
String s1 = "红枸杞";
System.out.println(s1.hashCode());
    }
}
