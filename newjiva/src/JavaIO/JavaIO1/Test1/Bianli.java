package JavaIO.JavaIO1.Test1;

import java.io.File;

public class Bianli {
    public static void main(String[] args) {
        File f = new File("c:\\windows");
        File[] fs = f.listFiles();
        if(null==fs)
            return;

        long minsize = Integer.MAX_VALUE;
        long maxsize = 0;
        File minfile = null;
        File maxfile = null;

        for(File file : fs){
            if(file.isDirectory())
                continue;
            if(file.length()>maxsize){
                maxsize=file.length();
                maxfile=file;
            }
            if(file.length()!=0&&file.length()<minsize){
                minfile=file;
                minsize=file.length();
            }
        }

        System.out.printf("最大文件夹是%s,大小为%d字节%n",maxfile.getAbsoluteFile(),maxfile.length());
        System.out.printf("最小文件夹是%s,大小为%d字节",minfile.getAbsoluteFile(),minfile.length());
    }
}
