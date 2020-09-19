package javajichu.USB;

public class Demo {
    public static void main(String[] args) {
        Compute compute = new Compute();// new一个Compute对象

        compute.open();                 //电脑开机

        Usb usb = new Key();             //左边是接口，右边是实现类。 这也是多态。

        compute.UseUsb(usb);             //传递Usb类型的参数向compute类里的接收Usb的方法中
        compute.UseUsb(new Mouse());

        compute.close();
    }
}
