package javajichu.USB;

public class Key implements Usb{                     //接口的实现类
    @Override
    public void open() {                             //引用接口的抽象方法
        System.out.println("打开键盘");
    }

    @Override
    public void close() {                           //引用接口的抽象方法
        System.out.println("关闭键盘");
    }

    public void play1(){                           //Key实现类的特有方法
        System.out.println("键盘输入");
    }
}
