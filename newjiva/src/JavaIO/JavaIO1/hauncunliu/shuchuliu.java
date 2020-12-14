package JavaIO.JavaIO1.hauncunliu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class shuchuliu {
    public static void main(String[] args) {
        // 向文件lol2.txt中写入三行语句
        File f = new File("d:\\LOLFOLDER\\test4.txt");
        try(
                //创建文件字符流
                FileWriter fw = new FileWriter(f);

                //缓存流必须建立在一个存在的流的基础上
                PrintWriter pw = new PrintWriter(fw);
                )
        {
            pw.println("sdxcfvgbhjnkm");
            pw.println("vyubivi yuviub");
            pw.println("erdsdyf uyfv8 uyf8 uyg");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
