package FileWriter;

import java.io.FileWriter;
public class FileWriterdemo {
    public static void main(String[] args) throws Exception {
        try (FileWriter fw = new FileWriter("D:\\java\\javawork\\javaseaiproject\\Day10\\src\\Charmmy",true)) {
            fw.write("你好");
            fw.write("\n");
            char[] chars = {'b','c','d'};
            fw.write(chars,0,2);
            fw.write(65);
            fw.flush();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
