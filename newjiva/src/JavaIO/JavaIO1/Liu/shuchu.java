package JavaIO.JavaIO1.Liu;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class shuchu {
    public static void main(String[] args) {
        try{
            File f = new File("d:/LOLFOLDER/test.txt");
            //创建基于文件的输出流
            //可以把数据从内存输入到硬盘的文件
            FileOutputStream fos = new FileOutputStream(f);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
