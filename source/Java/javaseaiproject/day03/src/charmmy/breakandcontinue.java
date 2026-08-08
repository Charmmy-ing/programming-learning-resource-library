package charmmy;

public class breakandcontinue {
    public static void main(String[] args) {
        test();
        test1();
       }
       public static void test(){
        for(int i=0;i<10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("循环结束");
       }

       public static void test1(){
        for(int i=0;i<10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("循环结束");
       }
}
