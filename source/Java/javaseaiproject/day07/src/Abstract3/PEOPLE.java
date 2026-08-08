package Abstract3;

public abstract class PEOPLE{
    public void write(){
        System.out.println("\t我的爸爸");
        System.out.println("\t我的爸爸是一个人");
        //模板方法，这里要定义一个抽象方法
        method();
        System.out.println("\t我的爸爸");
    }
    public abstract void method();//抽象方法
}
