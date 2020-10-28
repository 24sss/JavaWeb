package javagui.gui1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestButton {
    public static void main(String[] args) {
        Frame frame = new Frame("start-end");
        frame.setBounds(300,300,400,400);

        Button b1 = new Button("start");
        Button b2 = new Button("end");

        Mymoitor my = new Mymoitor();
        b1.addActionListener(my);
        b2.addActionListener(my);

        frame.add(b1);
        frame.add(b2);
        frame.pack();
        frame.setVisible(true);



    }
}

class Mymoitor implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("按钮被点击了：msg=>"+e.getActionCommand());
    }
}