package Charmmy2;

public class MonkeyAssistant {
    //MonkeyAssistant 类的要求
    //属性：
    //名字 (name)：字符串类型
    //年龄 (age)：整数类型
    //体重 (weight)：浮点数类型
    //爱好 (hobby)：字符串类型
    //温度 (temperature)：浮点数类型
    private String name;
    private int age;
    private double weight;
    private String hobby;
    private double temperature;

    /*带参数的构造方法：接受名字、年龄和体重作为参数，并初始化相应的属性，温度默认为 0.0。
    还应具有以下方法：
    climbTree()：打印出猴子爬树的行为，格式为 "Monkey [name] is climbing a tree."。
    printDetails()：打印出猴子的名字、年龄、体重和爱好。
    setTemperature(double temperature)：设置当前温度。
    celsiusToFahrenheit(double celsius)：接受一个摄氏度值，返回对应的华氏度值。
    celsiusToFahrenheit(int celsius)：接受一个整数型的摄氏度值，返回对应的华氏度值。
    fahrenheitToCelsius(double fahrenheit)：接受一个华氏度值，返回对应的摄氏度值。
    fahrenheitToCelsius(int fahrenheit)：接受一个整数型的华氏度值，返回对应的摄氏度值。*/
    public MonkeyAssistant(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.temperature = 0.0;
    }

    public MonkeyAssistant() {
    }

    public void climbTree() {
        System.out.println("Monkey " + name + " is climbing a tree.");
    }

    public void printDetails() {
        System.out.println("Monkey " + name + " is " + age + " years old." + weight + " kg.");
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public void celsiusToFahrenheit(double celsius) {
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("摄氏度" + celsius + "对应的华氏度为" + fahrenheit);

    }

    public void celsiusToFahrenheit(int celsius) {
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("整数型的摄氏度" + celsius + "对应的华氏度为" + fahrenheit);
    }

    public void fahrenheitToCelsius(int fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println("整数型的华氏度" + fahrenheit + "对应的摄氏度为" + celsius);
    }
}