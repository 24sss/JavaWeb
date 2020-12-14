package JavaIO.JavaIO1.Lianxi;

import java.io.File;
import java.io.IOException;

public class bianli {
    public static void main(String[] args) throws IOException {
        File f = new File("d://git");

        File[] fs = f.listFiles();
        if(fs==null){
            return;
        }

        int max=0;
        int min=Integer.MAX_VALUE;
        File minfile = null;
        File maxfile = null;

        for(File ff : fs){
            if(ff.isDirectory()){
                continue;
            }
            if(ff.length()>max){
                maxfile=ff;
                max = (int) ff.length();
            }
            if(ff.length()!=0&&ff.length()<min){
                min = (int)ff.length();
                minfile=ff;
            }
        }
        System.out.printf("最大文件是%s,大小为%d%n",maxfile,max);
        System.out.printf("最小文件是%s,大小为%d%n",minfile,min);


    }
}
