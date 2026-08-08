
package Fileoutputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;
public class fileoutputstream {
    public static void main(String[] args) throws Exception {
        OutputStream outputStream = new FileOutputStream("D:\\java\\javawork\\javaseaiproject\\Day10\\src\\Charmmy",true);
        outputStream.write("你好".getBytes("UTF-8"));
        outputStream.write('a');
        outputStream.write('b');
        byte [] byte1="你好".getBytes("UTF-8");
        outputStream.write(byte1);
        outputStream.close();



    }

}
