package innerclass2;

public class outer {
    //静态内部类
    public static class Inner{
        private int a;
        public void show(){
            System.out.println("Inner");
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }
    }
}
