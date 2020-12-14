package JavaIO.JavaIO1.EX;

import java.io.*;

public class FuZhi1 {
    public static void copyFile(String srcPath, String destPath){

        File srcFile = new File(srcPath);
        File destFile = new File(destPath);

        //缓存区，一次性读取1024字节
        byte[] buffer = new byte[1024];

        try (
                FileInputStream fis = new FileInputStream(srcFile);
                FileOutputStream fos = new FileOutputStream(destFile);
        ){
            while(true){
                //实际读取的长度是 actuallyReaded,有可能小于1024
                int actuallyReaded = fis.read(buffer);
                //-1表示没有可读的内容了
                if(-1==actuallyReaded)
                    break;
                fos.write(buffer, 0, actuallyReaded);
                fos.flush();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void CopyFolder(String src,String desc){
        File src1=new File(src);
        File desc1 = new File(desc);
        if(desc1.isFile())
            return;
        if(desc1.isFile())
            return;
        if(!src1.exists())
            return;
        if(!src1.isDirectory())
            return;

        File[] files = src1.listFiles();
        for (File srcFile : files){
            if(srcFile.isFile()){
                File newDestfile = new File(desc1,srcFile.getName());
                copyFile(srcFile.getAbsolutePath(),newDestfile.getAbsolutePath());
            }
            if(srcFile.isDirectory()){
                File newDestFolder = new File(desc1,srcFile.getName());
                CopyFolder(srcFile.getAbsolutePath(),newDestFolder.getAbsolutePath());
            }
        }

    }
    public static void main(String[] args) {
        CopyFolder("D:\\LOLFOLDER","D:\\LOL");
    }
}
