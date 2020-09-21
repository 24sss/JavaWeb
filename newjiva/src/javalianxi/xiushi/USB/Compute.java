package javalianxi.xiushi.USB;

public class Compute {
    public void open(){
        System.out.println("打开电脑");
    }
    public void close(){
        System.out.println("关闭电脑");
    }

    public void Usb(Usb usb){
        usb.open();
        if(usb instanceof Mouse){           //判断实现类是谁，实现对象的向下转型，并调用实现类中的特有方法
            Mouse mouse = (Mouse) usb;
            mouse.DJ();
        }
        if(usb instanceof Key){           //判断实现类是谁，实现对象的向下转型，并调用实现类中的特有方法
            Key key = (Key) usb;
            key.QJ();
        }


        usb.close();
    }
}
