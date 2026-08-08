package File;

import java.io.File;
public class FileDemo {
    public static void main(String[] args) {
        //创建文件对象
        File file = new File("D:\\pic\\Pictures\\Saved Pictures\\IMG_20260206_153644.jpg");
        System.out.println(file);
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.getParentFile());
        System.out.println(file.getAbsolutePath());
        File f1=new File("D:\\pic");
        System.out.println(f1.exists());

    }
}
