package javayichang.trycatch;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) {

        try{
            m("d://a.bat");
        }catch(IOException e){
           // System.out.println("catch-传递文件后缀不是.txt");

            //System.out.println(e.getMessage());//打印：后缀不对

            //System.out.println(e.toString());//打印：java.io.IOException: 后缀不对

            e.printStackTrace();//java.io.IOException: 后缀不对
            //at javayichang.trycatch.Demo.m(Demo.java:22)
            //at javayichang.trycatch.Demo.main(Demo.java:9)
            //后续代码
        }
        System.out.println("后续代码");
    }
    public static void m(String file) throws IOException {
        if(!file.endsWith(".txt")){
            throw new IOException("后缀不对");
        }
    }
}
