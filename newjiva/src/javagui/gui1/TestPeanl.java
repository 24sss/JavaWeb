package javagui.gui1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPeanl {
    public static void main(String[] args) {
        Frame frame = new Frame("my panel");
        frame.setBackground(Color.RED);
        frame.setBounds(300,300,500,500);
        //设置布局
        frame.setLayout(null);
        //定义面板，并定义坐标（相对于窗口的坐标）
        Panel panel = new Panel();
        panel.setBackground(Color.blue);
        panel.setBounds(50,50,400,400);

        frame.add(panel);

        frame.setVisible(true);

        //监听事件，监听窗口关闭事件 System.exit(0)
        //适配器模式
        frame.addWindowListener(new WindowAdapter() {
            //点击关闭时，要做的事
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }
}
