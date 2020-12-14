package JavaIO.JavaIO1.hauncunliu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class shuruliu {
    public static void main(String[] args) {
        File f = new File("d:\\LOLFOLDER\\test3.txt");
        // 创建文件字符流
        // 缓存流必须建立在一个存在的流的基础上

        try(FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            )
        {
            while(true){
                String line = br.readLine();
                if(null==line)
                    break;
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
