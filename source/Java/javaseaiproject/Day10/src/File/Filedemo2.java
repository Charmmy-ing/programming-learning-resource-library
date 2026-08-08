package File;


import java.io.File;

public class Filedemo2 {
    public static void main(String[] args) {

        File filedemo2 =new File("D:/");
        searchFile(filedemo2,"IMG_20260206_153644.jpg");
    }

    /**
     *
     * @param file
     * @param name
     */
    public static void searchFile(File file, String name) {
        // 判断file是否有效
        if (file == null || !file.exists()) {
            return;
        }
        
        // 如果是文件，直接判断文件名
        if (file.isFile()) {
            if (file.getName().equals(name) || file.getName().contains(name)) {
                System.out.println("找到: " + file.getAbsolutePath());
            }
            return;
        }
        
        // 如果是目录，遍历子文件
        File[] arrfile = file.listFiles();
        if (arrfile == null || arrfile.length == 0) {
            return;
        }
        
        for (File f : arrfile) {
            searchFile(f, name);  // 递归搜索每个子文件/目录
        }
    }
}