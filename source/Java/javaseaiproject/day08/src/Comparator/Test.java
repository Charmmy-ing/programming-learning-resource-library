package Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Student [] students=new Student[5];
        students[0]=new Student("刘宇",17,178,'男');
        students[1]=new Student("张三",18,180,'男');
        students[2]=new Student("李四",19,165,'男');
        students[3]=new Student("王五",20,170,'男');
        students[4]=new Student("赵六",21,185,'男');
        //调用api直接sort方法比较器
        //SORT 会调用匿名内部类对象的comparator方法，对数组中的两两对象排序
        Arrays.sort(students,new Comparator<Student>()
        {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        for(Student student:students){
            System.out.println(student.getName()+"的年龄是"+student.getAge());
        }

    }
}
