package javajichu.Red;

import javax.swing.*;

public abstract class   RedPacketFrame extends JFrame {
    public String oenerName = "谁谁";
    public OpenMode openMode = null;

    public RedPacketFrame(String title){
        super(title);
        //init();
    }
    public void setOwnerName(String ownerName){
        this.oenerName = ownerName;
    }
    public void setOpenMode(OpenMode openMode){
        this.openMode = openMode;
    }
}
