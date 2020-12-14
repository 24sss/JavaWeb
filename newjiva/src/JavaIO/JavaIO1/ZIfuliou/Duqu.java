package JavaIO.JavaIO1.ZIfuliou;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Duqu {
    //FileReader 是Reader子类，以FileReader 为例进行文件读取

        public static void main(String[] args) {
            File f = new File("d:/xyz/test.txt");
            //创建基于文件的reader；
            try(FileReader fr = new FileReader(f)){
                char[] all = new char[(int)f.length()];
                fr.read(all);
                for(char b :all){
                    System.out.println(b);
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

