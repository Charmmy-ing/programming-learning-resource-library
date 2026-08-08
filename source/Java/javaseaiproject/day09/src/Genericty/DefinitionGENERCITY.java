package Genericty;

import java.util.Iterator;
import java.util.ArrayList;
public class DefinitionGENERCITY<T> implements Iterable<T> {
    private ArrayList<T> gelist = new ArrayList<>();

    public boolean add(T t) {
        gelist.add(t);
        return true;
    }

    public boolean remove(T t) {
        gelist.remove(t);
        return true;
    }

    @Override
    public String toString() {
        return gelist.toString();
    }

    // 新增：实现 Iterable 接口
    @Override
    public Iterator<T> iterator() {
        return gelist.iterator();  // 委托给内部ArrayList的迭代器
    }
}
