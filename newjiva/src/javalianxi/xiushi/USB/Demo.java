package javalianxi.xiushi.USB;

public class Demo {
    public static void main(String[] args) {
        Compute obj = new Compute();
        obj.open();

        Mouse usb = new Mouse();
        obj.Usb(usb);

        obj.Usb(new Key());

        obj.close();
    }
}
