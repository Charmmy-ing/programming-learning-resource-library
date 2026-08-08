package File;

public class recursiondemo {
    public static void main(String[] args) {
      System.out.println(Test(5));
    }
    public static int Test(int n){
        if(n==1){
            return 1;
        }
        return n*Test(n-1);
    }
}
