package InputStreamreader;

import java.io.*;

public class demo1 {
    public static void main(String[] args) throws Exception {
       try (InputStream inputStream = new FileInputStream("D:\\java\\javawork\\javaseaiproject\\Day10\\src\\Charmmy.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "GBk"));)
       {
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}

