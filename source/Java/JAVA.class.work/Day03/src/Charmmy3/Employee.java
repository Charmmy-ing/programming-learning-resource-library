package Charmmy3;

public class Employee {
    /*设计一个雇员类来管理公司的员工信息。雇员类需要包含基本的个人信息以及统计出勤人数的功能。雇员类 (Employee) 的要求如下：
属性
编号 (id)：整数类型，私有属性。
姓名 (name)：字符串类型，私有属性。
年龄 (age)：整数类型，私有属性。
职务 (position)：字符串类型，私有属性。
部门 (department)：字符串类型，私有属性。
出勤人数 (attendanceCount)：整数类型，静态属性，用于统计所有雇员的出勤人数。
构造方法
默认构造方法：设置默认值（例如，id 为 0，name 为 "Unknown" 等）。
带参数的构造方法：接受雇员的编号、姓名、年龄、职务和部门作为参数，并初始化相应的属性。
*/
    private int id;
    private String name;
    private int age;
    private String position;
    private String department;
    private static int attendanceCount;
    public Employee() {
        this(0, "Unknown", 0, "Unknown", "Unknown");
    }
    public Employee(int id, String name, int age, String position, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
        this.department = department;
    }
    /*sign_in(string name)：签到方法，增加出勤人数计数器，并打印出签到信息，格式为 " ** 已经签到， 当前共有**人已签到。"。
displayInfo()：输出雇员的详细信息，包括编号、姓名、年龄、职务和部门。
*/
    public void sign_in(String name) {
        attendanceCount++;
        System.out.println(name + " 已经签到， 当前共有 " + attendanceCount + " 人已签到。");
    }
    public void displayInfo() {
        System.out.println("编号：" + id + " 姓名：" + name + " 年龄：" + age + " 职务：" + position + " 部门：" + department);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static int getAttendanceCount() {
        return attendanceCount;
    }

    public static void setAttendanceCount(int attendanceCount) {
        Employee.attendanceCount = attendanceCount;
    }
}
