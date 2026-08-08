package Charmmy4;

public class Test {
    public static void main(String[] args) {
        // 1. 创建具体子类对象
        CargoShip cargo = new CargoShip(4, 10, 5000.0);
        FighterShip fighter = new FighterShip(2, 2, 8);

        // 2. 向上转型：把子类对象赋值给父类引用
        Spaceship ship1 = cargo;
        Spaceship ship2 = fighter;
        ship1.display();
        ship2.display();
    }
}