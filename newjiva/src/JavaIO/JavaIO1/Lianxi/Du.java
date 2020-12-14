package JavaIO.JavaIO1.Lianxi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Du {
    public static void main(String[] args){
        try{
            File f = new File("d:/test.txt");

            FileInputStream fis = new FileInputStream(f);
            byte[] all = new byte[(int)f.length()];
            fis.read(all);

            for(byte b :all){
                System.out.println(b);
            }
            fis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
