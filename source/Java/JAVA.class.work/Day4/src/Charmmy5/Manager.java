package Charmmy5;

public class Manager extends Employee {
    //无参构造器
    public Manager() {
    }
    public Manager(String name, int age, int employeeID, double salary, int workYear) {
        super(name, age, employeeID, salary, workYear);
    }
    @Override
    public double getSalary() {
        salary = salary * (1 + 0.2);
        workYear++;
        return salary;
    }
}
