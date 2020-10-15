package javasnake.com.kuang.snake;

import javax.swing.*;
import java.net.URL;

public class Data {
    //头部图片 URL 定位图片地址 ImageIcon 图片
    public static URL headreURL = Data.class.getResource("/javasnake/statics/header.png");
    public static ImageIcon header = new ImageIcon(headreURL);

    //头部
    public static URL rightURL = Data.class.getResource("/javasnake/statics/right.png");
    public static ImageIcon right= new ImageIcon(rightURL);
    public static URL upURL = Data.class.getResource("/javasnake/statics/up.png");
    public static ImageIcon up = new ImageIcon(upURL);
    public static URL downURL = Data.class.getResource("/javasnake/statics/down.png");
    public static ImageIcon down = new ImageIcon(downURL);
    public static URL leftURL = Data.class.getResource("/javasnake/statics/left.png");
    public static ImageIcon left = new ImageIcon(leftURL);


    //身体
    public static URL bodyURL = Data.class.getResource("/javasnake/statics/body.png");
    public static ImageIcon body = new ImageIcon(bodyURL);
    //食物
    public static URL foodURL = Data.class.getResource("/javasnake/statics/food.png");
    public static ImageIcon food = new ImageIcon(foodURL);



}
