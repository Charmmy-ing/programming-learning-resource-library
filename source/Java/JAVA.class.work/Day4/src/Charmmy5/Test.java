package Charmmy5;

public class Test {
    public static void main(String[] args) {
        Employee m = new Manager("张三", 30, 1001, 5000, 5);
        System.out.println("员工" + m.name);
        System.out.println("员工" + m.name + "的涨薪工资为：" + m.getSalary());
        System.out.println("员工" + m.name + "的工龄为：" + m.workYear);

        Employee e = new Employee("李四", 25, 1002, 3000, 3);
        System.out.println("员工" + e.name);
        System.out.println("员工" + e.name + "的涨薪工资为：" + e.getSalary());
        System.out.println("员工" + e.name + "的工龄为：" + e.workYear);

    }
}
