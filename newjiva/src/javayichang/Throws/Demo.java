package javayichang.Throws;

import java.io.FileNotFoundException;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        m("d://a.txt");
    }
    public static void m(String file) throws FileNotFoundException {
        if(!file.equals("d://a.tzt")){
            //FileNotFoundException是编译异常，抛出了编译异常就必须处理这个异常
            //可以调用throws继续声明抛出FileNotFoundException这个异常对象，让方法调用者处理
            throw new FileNotFoundException("没有找到文件");
        }
    }
}
