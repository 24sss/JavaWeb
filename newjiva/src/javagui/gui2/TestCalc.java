package javagui.gui2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestCalc {
    public static void main(String[] args) {
        new Calc();
    }
}

class Calc extends Frame{
    public Calc(){
        TextField num1 = new TextField(10);
        TextField num2 = new TextField(10);
        TextField num3 = new TextField(20);

        Button b1 = new Button("=");
        b1.addActionListener(new Myadd(num1,num2,num3));

        Label l = new Label("+");
        setLayout(new FlowLayout());

        add(num1);
        add(l);
        add(num2);
        add(b1);
        add(num3);

        pack();
        setVisible(true);
    }

}
class Myadd implements ActionListener{
    //获取三个数字
    private TextField num1,num2,num3;
    public Myadd(TextField num1,TextField num2,TextField num3){
        this.num1=num2;
        this.num2=num2;
        this.num3=num3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        int n3=n1+n2;
        num3.setText(""+n3);

        //清楚前两个
        num1.setText("");
        num2.setText("");
    }
}
