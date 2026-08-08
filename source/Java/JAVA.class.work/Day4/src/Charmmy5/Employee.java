package Charmmy5;

public class Employee {
    //姓名，年龄，工号、工资、工龄
    protected String name;
    protected int age;
    protected int employeeID;
    protected double salary;
    protected double workYear;
    //定义一个方法用于计算员工工资假设每次给员工涨工资一次能涨10%，
    public double getSalary() {
        salary = salary * (1 + 0.1);
        workYear++;
        return salary;
    }
    //无参构造器
    public Employee() {
    }
    //构造器
    public Employee(String name, int age, int employeeID, double salary, int workYear) {
        this.name = name;
        this.age = age;
        this.employeeID = employeeID;
        this.salary = salary;
        this.workYear = workYear;
    }
}
