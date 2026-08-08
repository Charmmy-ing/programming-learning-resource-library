package Collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 25);
        Student s2 = new Student("李四", 19);
        Student s4 = new Student("赵六", 21);
        Set<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //如果当前对象的年龄大于被比较对象的年龄，返回正数
                //如果当前对象的年龄小于被比较对象的年龄，返回负数
                //如果当前对象的年龄等于被比较对象的年龄，返回0
                return Double.compare(o1.getAge(), o2.getAge());
            }
        });
        set.add(s1);
        set.add(s2);
        set.add(s4);
        System.out.println(set);
        set.forEach(s->System.out.println(s));
        //不知道在怎么排序
        //方案一：实现Comparable接口，重写compare方法制定排序规则
        //方案二：用TreeSet集合，自带比较器（comparator）

    }
}
