package Collection;

import java.util.LinkedList;

public class LInkListdemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addLast("红枸杞");
        list.addLast("黑枸杞");
        list.addLast("西洋参");
        list.addLast("白参");
        list.addLast("红参");
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list);
    }
}
