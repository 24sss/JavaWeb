package javagui.gui1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(400,300);
        frame.setLocation(300,400);
        frame.setBackground(Color.GRAY);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,1));

        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new GridLayout(2,1));
        Panel p3 = new Panel(new BorderLayout());
        Panel p4 = new Panel(new GridLayout(2,2));

        p1.add(new Button("1"),BorderLayout.EAST);
        p1.add(new Button("2"),BorderLayout.WEST);
        p2.add(new Button("3"));
        p2.add(new Button("4"));
        p1.add(p2,BorderLayout.CENTER);

        p3.add(new Button("5"),BorderLayout.EAST);
        p3.add(new Button("6"),BorderLayout.WEST);
        p4.add(new Button("7"));
        p4.add(new Button("8"));
        p4.add(new Button("9"));
        p4.add(new Button("10"));
        p3.add(p4,BorderLayout.CENTER);

        frame.add(p1);
        frame.add(p3);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });




    }
}
