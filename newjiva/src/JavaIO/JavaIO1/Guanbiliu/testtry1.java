package JavaIO.JavaIO1.Guanbiliu;
//把流定义在try()里,try,catch或者finally结束的时候，会自动关闭
//这种编写代码的方式叫做 try-with-resources， 这是从JDK7开始支持的技术
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class testtry1 {
    public static void main(String[] args) {
        File f = new File("d:/xyz/test.txt");
        try(FileInputStream fis = new FileInputStream(f)){
            byte[] all = new byte[(int)f.length()];
            fis.read(all);
            for(byte b :all){
                System.out.println(b);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
