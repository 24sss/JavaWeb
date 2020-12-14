package JavaIO.JavaIO1.zhongwen;
//用FileInputStream 字节流正确读取中文

//1. 必须了解文本是以哪种编码方式保存字符的
//2. 使用字节流读取了文本后，再使用对应的编码方式去识别这些数字，得到正确的字符
//如本例，一个文件中的内容是字符中，编码方式是UTF-8，那么读出来的数据一定是e4b8ad
//再使用UTF-8编码方式识别，就能正确的得到字符中
//注： 在UTF-8的棋盘上找到的中字后，JVM会自动找到中在UNICODE这个棋盘上对应的数字，并且以UNICODE上的数字保存在内存中。
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class zijieliuzhongwen {
    public static void main(String[] args) {
        File f = new File("d:\\LOLFOLDER\\test2.txt");
        try(FileInputStream fis = new FileInputStream(f);){
            byte[] all = new byte[(int)f.length()];
            fis.read(all);

            //文件中读取的数据是
            System.out.println("文件中读取的数据是：");
            for(byte b :all){
                int i = b&0x000000ff;//支取16进制的后两位；
                System.out.println(Integer.toHexString(i));
            }
            System.out.println("把这个数字放在GBK棋盘上");
            String str1 = new String(all,"GBK");
            System.out.println(str1);//涓�

            System.out.println("把这个数字放在UTF-8棋盘上");
            String str2 = new String(all,"UTF-8");
            System.out.println(str2);//中
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
