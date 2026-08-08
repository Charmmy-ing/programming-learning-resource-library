package Collection;

import java.util.Iterator;
import java.util.ArrayList;
public class Demo2 {
    public static void main(String[] args) {
        // 从集合中删除所有包含"枸杞"的元素
        ArrayList<String> list = new ArrayList<>();
        list.add("红枸杞");
        list.add("黑枸杞");
        list.add("西洋参");
        list.add("白参");
        list.add("红参");
        /*System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("枸杞")) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
        //没删干净出现并发修改异常
        //本质原因，在删除一个元素后，后一个元素会补上删除的元素，导致索引直接跨过补上的元素，继续判断下一个元素
//迭代器遍历·*/
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.contains("枸杞")) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}
