package JavaIO.JavaIO1.EX;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FuZhi {
    public static void copyFile(String src,String desc){
        File srcFile = new File(src);
        File descFile = new File(desc);
        //缓存区
        byte[] buffer = new byte[1024];

        try(
                FileInputStream fis = new FileInputStream(srcFile);
                FileOutputStream fos = new FileOutputStream(descFile);
            ){
            while(true){
                //实际读取的长度是actuallyReaded
                int actuallyReaded = fis.read(buffer);
                //-1表示没有可读内容
                if(-1 == actuallyReaded){
                    break;
                }
                fos.write(buffer,0,actuallyReaded);
                fos.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        copyFile("D:/LOLFOLDER/test5.txt","D:/LOLFOLDER/test7.txt");
    }
}
