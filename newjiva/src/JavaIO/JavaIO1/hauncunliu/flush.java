package JavaIO.JavaIO1.hauncunliu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//有的时候，需要立即把数据写入到硬盘，而不是等缓存满了才写出去。
//这时候就需要用到flush
public class flush {
    //向test4.txt中写入数据
    public static void main(String[] args) {
        File f = new File("d:\\LOLFOLDER\\test4.txt");
        //创建文件字符流
        //缓存流必须建立在一个存在的流的基础上
        try(
                FileWriter fr = new FileWriter(f);
                PrintWriter pw = new PrintWriter(fr);
                )
        {
            pw.println("drtfcgvyubhjn");
            pw.flush();//强制把缓存中的数据写入硬盘，无论缓存是否已满
            pw.println("qqqqqqqqqqqqqqqqqqqqq");
            pw.flush();
            pw.println("eeeeeeeeeeeeeeeeeeeeee");
            pw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
