package Extends;

public class Test03Soverride {
    public static void main(String[] args) {
        //认识方法重写
        Cat cat = new Cat();
        cat.cry();
    }

}
class Cat extends Annimal{
    //方法重写
    @Override//重写方法的标志注解，要求方法的参数列表和返回值类型与父类方法的参数列表和返回值类型相同
    public void cry(){
        System.out.println("猫在叫");
    }
}

class Annimal{
    public void cry(){
        System.out.println("动物在叫");
    }
}
