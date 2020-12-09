package JavaIO.JavaIO1.Test1;

import java.io.File;

public class Bianli1 {
    static long minsize = Integer.MAX_VALUE;
    static long maxsize = 0;
    static File minfile = null;
    static File maxfile = null;

    //使用递归来遍历一个文件夹的子文件
    public static void listFiles(File file){
        if(file.isFile()){
            if(file.length()>maxsize){
                maxfile=file;
                maxsize=file.length();
            }
            if(file.length()!=0&&file.length()<minsize){
                minsize=file.length();
                minfile=file;
            }
            return;
        }
        if(file.isDirectory()){
            File[] fs = file.listFiles();
            if(null!=fs){
                for(File f : fs){
                    listFiles(f);
                }
            }
        }
    }


    public static void main(String[] args) {
        File f = new File("c:\\windows");
        listFiles(f);
        System.out.printf("最大的文件是%s，其大小是%,d字节%n",maxfile.getAbsoluteFile(),maxfile.length());
        System.out.printf("最小的文件是%s，其大小是%,d字节%n",minfile.getAbsoluteFile(),minfile.length());

    }
}
