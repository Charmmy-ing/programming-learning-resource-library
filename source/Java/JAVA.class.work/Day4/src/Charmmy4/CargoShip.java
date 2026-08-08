package Charmmy4;

public class CargoShip extends Spaceship {
    private double cargoCapacity;  // 载货容量

    public CargoShip(int engineNum, int crewCapacity, double cargoCapacity) {
        super(engineNum, crewCapacity);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void display() {
        System.out.println("=== 货船信息 ===");
        System.out.println("引擎数量: " + EngineNum());
        System.out.println("乘员容量: " + CrewCapacity());
        System.out.println("载货容量: " + cargoCapacity + " 吨");
    }

    // 需要添加 getter 方法访问父类的私有字段
    public int EngineNum() {
        return engineNum;  // 需要将父类的 engineNum 改为 protected 或提供 getter
    }

    public int CrewCapacity() {
        return crewCapacity;  // 需要将父类的 crewCapacity 改为 protected 或提供 getter
    }
}