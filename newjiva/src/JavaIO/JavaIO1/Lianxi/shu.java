package JavaIO.JavaIO1.Lianxi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class shu {
    public static void main(String[] args) {
        try{
            File f = new File("d:/xyz/test.txt");
            byte[] all = {65,66};
            FileOutputStream fos = new FileOutputStream(f);

            if(!f.getParentFile().exists()){
                f.getParentFile().mkdirs();
            }
            fos.write(all);
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
