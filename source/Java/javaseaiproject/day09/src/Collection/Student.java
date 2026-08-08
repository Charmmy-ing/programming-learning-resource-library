package Collection;

import java.util.Objects;

public class Student implements Comparable<Student> {
    public String getName() {
        return name;
    }
public Student() {

    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    //实现Comparable接口，重写compareTo方法制定排序规则
    //根据年龄排序
    //this.age - o.age：当前对象的年龄减去被比较对象的年龄
    //如果当前对象的年龄大于被比较对象的年龄，返回正数
    //如果当前对象的年龄小于被比较对象的年龄，返回负数
    //如果当前对象的年龄等于被比较对象的年龄，返回0
    @Override
    public int compareTo(Student o) {
        //如果当前对象的年龄大于被比较对象的年龄，返回正数
        //如果当前对象的年龄小于被比较对象的年龄，返回负数
        //如果当前对象的年龄等于被比较对象的年龄，返回0
        return this.age - o.age;
    }
}
