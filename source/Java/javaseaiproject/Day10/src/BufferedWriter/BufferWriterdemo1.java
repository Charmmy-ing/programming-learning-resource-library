package BufferedWriter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

public class BufferWriterdemo1 {
    public static void main(String[] args) throws IOException {
         try (BufferedWriter bW = new BufferedWriter(new FileWriter("D:\\java\\javawork\\javaseaiproject\\Day10\\src\\Charmmy.txt",true));
         ) {
            bW.write("你好");
            bW.newLine();//换行
            bW.write("你好");
            bW.newLine();//换行
    }catch (IOException ex){
         throw new RuntimeException(ex);}
    }
}
