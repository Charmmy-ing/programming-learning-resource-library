package innerclass2;

public class Test {
        public static void main(String[] args) {
                //搞清楚静态内部类的方法
                outer.Inner inner = new outer.Inner();
                inner.show();
        }
}
