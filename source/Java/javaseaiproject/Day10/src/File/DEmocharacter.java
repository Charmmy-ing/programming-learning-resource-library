package File;

import java.util.Arrays;


public class DEmocharacter {
    //字符集的编码和解码
    public static void main(String[] args) throws Exception {
        String str="你好";
       byte[] n=str.getBytes("GBk");
       System.out.println(n.length);
       System.out.println(n);
       System.out.println(Arrays.toString(n));
       String str1=new String(n,"GBk");
       System.out.println(str1);



    }
}
