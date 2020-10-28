package javagui.gui1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestField {
    public static void main(String[] args) {

        Frame frame = new Frame();
        TextField tex = new TextField();
        frame.add(tex);
        frame.setBounds(300,300,500,500);

        //监听这个文本框输入的文字
        Myaction my = new Myaction();
        tex.addActionListener(my);
        //tex.setEchoChar('*');
        frame.setVisible(true);
        frame.pack();

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
class Myaction implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField field = (TextField)e.getSource();
        System.out.println(field.getText());
    }
}