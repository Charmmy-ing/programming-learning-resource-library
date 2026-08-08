package FileReader;

import java.io.FileReader;
import java.io.IOException;
public class Filereaderdemo {
    public static void main(String[] args) {
     try (FileReader fr = new FileReader("D:\\java\\javawork\\javaseaiproject\\Day10\\src\\Charmmy"))
     {
        char[] chars=new char[1024];
        int len;
        while ((len=fr.read(chars))!=-1){
        System.out.println(new String(chars,0,len));
        }
     } catch (IOException ex) {
         throw new RuntimeException(ex);
     }
    }
}
