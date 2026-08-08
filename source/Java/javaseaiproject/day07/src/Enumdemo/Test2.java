package Enumdemo;

public class Test2 {
    //掌握枚举类的应用和场景
    //模拟上下左右四个方向
    //常量(参数值不受约束)or枚举类(只能接枚举类的常量)
    public static void main(String[] args) {
        move(Direction.UP);
        move(Direction.DOWN);
        move(Direction.LEFT);
        move(Direction.RIGHT);

    }
    public static void move(Direction direction){
        switch (direction){
            case UP:
                System.out.println("向上移动");
                break;
            case DOWN:
                System.out.println("向下移动");
                break;
            case LEFT:
                System.out.println("向左移动");
                break;
            case RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("移动方向错误");
                break;
        }

    }
}
