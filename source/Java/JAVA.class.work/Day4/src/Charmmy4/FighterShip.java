package Charmmy4;

public class FighterShip extends Spaceship {
    private int weaponCount;  // 武器数量

    public FighterShip(int engineNum, int crewCapacity, int weaponCount) {
        super(engineNum, crewCapacity);
        this.weaponCount = weaponCount;
    }

    @Override
    public void display() {
        System.out.println("=== 战斗机信息 ===");
        System.out.println("引擎数量: " + getEngineNum());
        System.out.println("乘员容量: " + getCrewCapacity());
        System.out.println("武器数量: " + weaponCount + " 件");
    }

    public int getEngineNum() {
        return engineNum;
    }

    public int getCrewCapacity() {
        return crewCapacity;
    }
}