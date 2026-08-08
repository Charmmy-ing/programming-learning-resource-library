package Fileinputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class feilinpputstreamdemo1 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream=new FileInputStream("D:\\java\\javawork\\javaseaiproject\\Day10\\src\\Charmmy");
        int len=0;
        while((len=inputStream.read())!=-1){
            System.out.print((char) (len));
        }
        inputStream.close();

    }
}
