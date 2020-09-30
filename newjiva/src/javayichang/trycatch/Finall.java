package javayichang.trycatch;

import java.io.IOException;

public class Finall {
    public static void main(String[] args) {
        try {
            readfile("d;//a.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("资源释放");//输出
        }
    }
    public static void readfile(String filename) throws IOException {
        if(!filename.endsWith("txt")) {
            throw new IOException();
        }

    }
}
