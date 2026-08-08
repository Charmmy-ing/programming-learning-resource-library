package interclass3;

public class Test2 {
    public static void main(String[] args) {
      swim s1=new swim() {
     @Override
     public void swimming() {
         System.out.println("student在游泳");
     }
    };
 swim s2=new swim() {
     @Override
     public void swimming() {
         System.out.println("teacher在游泳");
     }
     };
    }
    //测试游泳接口
    public static void testSwim(swim s) {
        System.out.println("测试游泳接口");
        s.swimming();
        System.out.println("-----------------");
    }
}


class teacher implements swim {
    @Override
    public void swimming() {
        System.out.println("老师在游泳");
    }
}
class student implements swim {
    @Override
    public void swimming() {
        System.out.println("学生在游泳");
    }
}
interface swim {
    void swimming();
}