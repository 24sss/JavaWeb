package javajichu.USB;

public class Compute {
    public void open(){                     //类里的开机方法
        System.out.println("打开电脑");
    }
    public void close(){                    //类里的关机方法
        System.out.println("关闭电脑");
    }

    public void UseUsb(Usb usb){            //构造一个使用Usb接口的方法，并接收Usb类型的参数
        usb.open();                         //谁new的，看谁实现的接口

        if(usb instanceof Mouse){           //判断实现类是谁，实现对象的向下转型，并调用实现类中的特有方法
            Mouse mouse = (Mouse) usb;
            mouse.play();
        }

        if(usb instanceof Key){
            Key key = (Key) usb;
            key.play1();
        }
        usb.close();
    }
}
