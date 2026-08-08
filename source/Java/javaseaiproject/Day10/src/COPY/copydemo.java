package COPY;

import java.io.*;


public class copydemo {
    public static void main(String[] args) throws Exception {
        copyFile("C:/Users/a'a'a/Desktop/个人信息/08244d0325cc7830070383029c308552.jpg", "C:/Users/a'a'a/Desktop/个人信息/new.jpg");
    }
public static void copyFile(String src, String dst) throws Exception {
    try {
        FileInputStream inputStream = new FileInputStream(src);
        FileOutputStream outputStream = new FileOutputStream(dst);
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }
        System.out.println("复制完成");
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
}
