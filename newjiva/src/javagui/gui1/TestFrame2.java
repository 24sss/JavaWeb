package javagui.gui1;

import java.awt.*;

public class TestFrame2 {
    public static void main(String[] args) {
        MyFarme myFarme1 = new MyFarme(100,100,200,200,Color.black);
        MyFarme myFarme2 = new MyFarme(300,100,200,200,Color.blue);
        MyFarme myFarme3 = new MyFarme(100,300,200,200,Color.cyan);
        MyFarme myFarme4= new MyFarme(300,300,200,200,Color.darkGray);
    }

}

class MyFarme extends Frame {
    static int d=0;
    public MyFarme(int x,int y,int w,int h,Color color){
        super("MyFrame"+(d++));
        setBounds(x,y,w,h);
        setBackground(color);
        setVisible(true);

    }

}
