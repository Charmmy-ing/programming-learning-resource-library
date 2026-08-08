package Charmmy;

import java.util.Scanner;
public abstract class Animal {
    /*Animal 类的要求
    属性
    名称 (name)：字符串类型，私有属性。
    年龄 (age)：整数类型，私有属性。
    种类 (species)：字符串类型，私有属性。
    生活环境 (habitat)：字符串类型，私有属性。
    构造方法
    带参数的构造方法：接受名称、年龄、种类和生活环境作为参数，并初始化相应的属性。
    方法
    makeSound()：发出声音的方法，格式为 "The [species] makes a sound."。
    displayInfo()：显示动物的基本信息，包括名称、年龄、种类和生活环境。
    eat()：吃东西的方法，格式为 "The [species] is eating."。*/
    private String name;
    private int age;
    private String species;
    private String habitat;

    public Animal(String name, int age, String species, String habitat) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.habitat = habitat;
    }

    public abstract void makeSound();

    public void displayInfo() {
     /*显示猴子的详细信息，包括名称、年龄、种类、生活环境、爱好和体重。*/
        IO.println("Name: " + getName());
        IO.println("Age: " + getAge());
        IO.println("Species: " + getSpecies());
        IO.println("Habitat: " + getHabitat());
    }
    public abstract void eat();
    public abstract void behavior();

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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}