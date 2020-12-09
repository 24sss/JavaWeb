package JavaIO.JavaIO1.Liu;
//什么是流(Stream)，流就是一系列的数据
//当不同的介质之间有数据交互的时候，JAVA就使用流来实现。
//数据源可以是文件，还可以是数据库，网络甚至是其他的程序
//比如读取文件的数据到程序中，站在程序的角度来看，就叫做输入流
//输入流： InputStream
//输出流：OutputStream
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//如下代码，就建立了一个文件输入流，
//这个流可以用来把数据从硬盘的文件，
//读取到JVM(内存)。
public class shuru {
    public static void main(String[] args) throws IOException {
        try{
            File f = new File("d:/LOLFOLDER/test.txt");

            //创建基于文件的输入流
            //通过这个输入流，就可以把数据从硬盘，读取到Java的虚拟机中来，
            //也就是读取到内存中
            FileInputStream fis = new FileInputStream(f);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
