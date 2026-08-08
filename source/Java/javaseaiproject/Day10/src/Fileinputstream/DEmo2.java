package Fileinputstream;

import java.io.FileInputStream;
import java.io.InputStream;


public class DEmo2 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("D:\\java\\javawork\\javaseaiproject\\Day10\\src\\Charmmy");
        /*byte[] bytes = new byte[2];//每次读多少个字节
        int len;
        //定义变量记住每次读了多少个字节可能不是2的倍数 ，他会把上一次的数组从前往后替换还剩下的，余下没替换的也会打出来     while((len=inputStream.read(bytes))!=-1){
        while ((len = inputStream.read(bytes)) != -1) {
            String str = new String(bytes, 0, len, "GBk");
            System.out.println(str);
        }*/
         byte [] bytes1=inputStream.readAllBytes();
        String str1=new String(bytes1,"UTF-8");
        System.out.println(str1);
        inputStream.close();
    }
    }
