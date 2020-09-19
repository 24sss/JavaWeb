package javajichu.USB;

public class Mouse implements Usb {         //接口实现类
    @Override
    public void open() {                    //实现类引用接口中的抽象方法
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {                  //实现类引用接口中的抽象方法
        System.out.println("关闭鼠标");
    }

    public void play(){                     //Mouse的特有方法
        System.out.println("点击鼠标");
    }
}
