package charmmy;

public class switchdemo2 {
    public static void main(String[] args) {
        TEST();
        TEST2();
    }
    public static void TEST() {
        //switch的表达式只能是byte short int char String不支持double float long做表达式
         int a = 10;
        switch (a) {
            case 10:
                System.out.println("a等于10");
                break;
            default:
                System.out.println("a不等于10");
                break;
        }
    }
        public static void TEST2(){
            //发生穿透
            int b=10;
            switch (b){
                case 10:
                    System.out.println("b等于10");
                    case 20:
                        System.out.println("b等于20");
                        break;
                default:
                    System.out.println("b不等于10或20");
                    break;
            }
        }

}
