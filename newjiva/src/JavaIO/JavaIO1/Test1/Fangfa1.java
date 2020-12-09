package JavaIO.JavaIO1.Test1;

//注意1:需要在D:\LOLFolder确实存在一个LOL.exe,才可以看到对应的文件长度、修改时间等信息

//注意2： renameTo方法用于对物理文件名称进行修改，但是并不会修改File对象的name属性。
import java.io.File;
import java.util.Date;

public class Fangfa1 {
    public static void main(String[] args) {
        File f = new File("d:/LOLFOLDER/LOL.exe");
        System.out.println("当前文件夹是："+f);

        //文件是否存在
        System.out.println("判断是否存在："+f.exists());

        //是否是文件夹
        System.out.println("判断是否是文件夹："+f.isDirectory());

        //判断是否是文件
        System.out.println("判断是否是文件"+f.isFile());

        //文件长度
        System.out.println("文件长度"+f.length());

        //文件最后修改时间
        long time = f.lastModified();
        Date d = new Date(time);
        System.out.println("获取文件最后的修改时间"+d);

        //文件重命名
        File f2 = new File("d:/LOLFODER/DOTA.exe");
        f.renameTo(f2);
        System.out.println("把LOL.exe改名为DOTA.exe");


    }
}
