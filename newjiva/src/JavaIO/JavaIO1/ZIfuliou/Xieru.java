package JavaIO.JavaIO1.ZIfuliou;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Xieru {
    public static void main(String[] args) {
        File f = new File("d:/xyz/test.txt");
        try(FileWriter fr = new FileWriter(f)){
            String data = "asdfghdfghgfdfghgfghb";
            char[] cs = data.toCharArray();
            fr.write(cs);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
