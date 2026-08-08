package BufferedinputStream;

import java.io.*;
public class demo {
    public static void main(String[] args) throws Exception {
        copyFile("C:/Users/a'a'a/Desktop/个人信息/08244d0325cc7830070383029c308552.jpg", "C:/Users/a'a'a/Desktop/个人信息/new.jpg");
    }
    public static void copyFile(String src, String dst) throws Exception {
        try (
            OutputStream ios=new BufferedOutputStream(new FileOutputStream(dst));

            //把输入流包装成缓冲输入流
            InputStream bis = new BufferedInputStream(new FileInputStream(src)))
        {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                ios.write(bytes, 0, len);
            }
            System.out.println("复制完成");
        }
             catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

