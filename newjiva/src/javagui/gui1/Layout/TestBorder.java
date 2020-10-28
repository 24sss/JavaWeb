package javagui.gui1.Layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestBorder {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setBounds(200,200,300,300);

        Button b1 = new Button("b1");
        Button b2 = new Button("b2");
        Button b3 = new Button("b3");
        Button b4 = new Button("b4");
        Button b5 = new Button("b5");

        frame.add(b1,BorderLayout.EAST);
        frame.add(b2,BorderLayout.WEST);
        frame.add(b3,BorderLayout.SOUTH);
        frame.add(b4,BorderLayout.NORTH);
        frame.add(b5,BorderLayout.CENTER);

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
