package Comparator;

public class Student {
    private String name;
    private int age;
    private double height;
    private char gender;
    public Student(String name, int age, double height, char gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
    }
    public Student(){}
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
