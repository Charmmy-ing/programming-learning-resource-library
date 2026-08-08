package Abstract3;

public class Test {
    public static void main(String[] args) {
        //理解模版方法设计模式
        //学生和老师都要写一篇   作文功能:我的爸爸
        //第一段一样，第二段各自写
        Teacher t1 = new Teacher();
        t1.write();
        Student s1 = new Student();
        s1.write();



    }
}
