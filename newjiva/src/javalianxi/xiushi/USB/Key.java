package javalianxi.xiushi.USB;

public class Key implements Usb {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
       System.out.println("关闭键盘");
    }

    public void QJ(){
        System.out.println("敲打电脑");
    }
}
