package JavaIO.JavaIO1.Test1;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class fangfa2 {
    public static void main(String[] args) throws IOException {
        File f = new File("d:/LOLFOLDER/skin/xxx");

        //以字符串数组的形式，返回当前文件夹下所有的文件
        String[] files=f.list();
        System.out.println(Arrays.toString(files));

        //以文件数组的形式返回当前文件夹下的所有文件
        File[] fs = f.listFiles();
        System.out.println(Arrays.toString(fs));

        //以字符串的形式返回所在文件夹
        String parentFolder = f.getParent();
        System.out.println(parentFolder);

        //以文件对象形式返回获取所在文件夹
        File parentfile = f.getParentFile();
        System.out.println(parentfile);

        //创建文件夹，如果父目录skin文件夹不存在，会创建父目录
        //  f.mkdirs();

        //创建一个空文件，如果父目录不存在，就会抛出异常
        f.createNewFile();
        //创建一个空文件前通常会创建父目录
        f.getParentFile().mkdirs();

        //列出所有的盘
        f.listRoots();

        //删除文件
        f.delete();


    }
}
