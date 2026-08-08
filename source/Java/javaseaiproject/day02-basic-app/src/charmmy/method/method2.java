package charmmy.method;

public class method2 {
    public static void main(String[] args) {
        //掌握无返回值的方法中return的作用
        div(10,2);
    }
    public static void div(int a,int b){
        int c=a/b;
        if(b==0){
            System.out.println("除数不能为0");
            return;
        }
        System.out.println(c);
    }
}
