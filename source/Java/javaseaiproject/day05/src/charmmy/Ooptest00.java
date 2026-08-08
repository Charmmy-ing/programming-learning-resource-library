package charmmy;

public class Ooptest00 {
    public static void main(String[] args) {
//        学会创建对象
        Star s1=new Star();
        s1.name="Kris";
        s1.age=20;
        s1.height=180.8;
        s1.weight=140.9;
        s1.sex="男";
        System.out.println(s1.name);
        System.out.println(s1.age+"岁");
        System.out.println(s1.height+"米");
        System.out.println(s1.weight+"kg");
        System.out.println(s1.sex);
        System.out.println("-----------------");
        Star s2=new Star();
        s2.name="Charm";
        s2.age=21;
        s2.height=180.8;
        s2.weight=140.9;
    }

}
