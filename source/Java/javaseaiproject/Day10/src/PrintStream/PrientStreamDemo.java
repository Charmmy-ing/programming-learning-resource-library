package PrintStream;

import java.io.PrintStream;

public class PrientStreamDemo {
    public static void main(String[] args) {
        try(PrintStream pS=new PrintStream("D:\\java\\javawork\\javaseaiproject\\Day10\\src\\Charmmy")){
            pS.println("你好");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
