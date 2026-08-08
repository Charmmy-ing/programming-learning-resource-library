package Charmmy4;

public abstract class Spaceship {
    //定义两个保护型成员变量 engineNum 和 crewCapacity，子类可以访问
    protected int engineNum;
    protected int crewCapacity;
    public Spaceship(int engineNum, int crewCapacity) {
        this.engineNum = engineNum;
        this.crewCapacity = crewCapacity;
    }
    //定义一个抽象方法用于输出宇宙飞船的基本信息
    public abstract void display();
}