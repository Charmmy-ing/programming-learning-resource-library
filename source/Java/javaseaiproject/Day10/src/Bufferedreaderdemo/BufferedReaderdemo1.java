package Bufferedreaderdemo;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;



public class BufferedReaderdemo1  {
    public static void main(String[] args) throws Exception {
        try (
                Reader fr = new FileReader("D:\\java\\javawork\\javaseaiproject\\Day10\\src\\Charmmy");
                BufferedReader br = new BufferedReader(fr);
        ) {
           /* char[] chars=new char[1024];
            int len;
            while ((len=br.read(chars))!=-1){
                System.out.println(new String(chars,0,len));
            */
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
