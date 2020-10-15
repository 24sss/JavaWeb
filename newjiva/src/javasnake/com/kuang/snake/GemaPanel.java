package javasnake.com.kuang.snake;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GemaPanel extends JPanel implements KeyListener, ActionListener {
    int length;
    int[] snakex=new int[600];
    int[] snakey=new int[500];
    String fx;

    boolean isStart=false;//游戏是否开始

    Timer timer= new Timer(100,this);//定时器

    //定义食物
    int foodx;
    int foody;
    Random r  = new Random();

    //死亡判断
    boolean isFail = false;

    //积分系统
    int score;

    //构造器
    public GemaPanel(){
        init();
        //获取键盘监听
        this.setFocusable(true);
        this.addKeyListener(this);
        timer.start();
    }

    //初始化数据
    public void init(){
        length=3;
        snakex[0]=100;snakey[0]=100;
        snakex[1]=75;snakey[1]=100;
        snakex[2]=50;snakey[2]=100;
        fx="R";
        foodx=25+25*r.nextInt(34);
        foody=75+25*r.nextInt(24);
        score=0;
    }


    //画板 画界面
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);//清屏
        this.setBackground(Color.WHITE);//背景
        Data.header.paintIcon(this,g,25,11);//绘制头部的广告栏
        g.fillRect(25,75,850,600);//游戏区域

        //画蛇
        if(fx.equals("R")){
            Data.right.paintIcon(this,g,snakex[0],snakey[0]);
        }else if(fx.equals("L")){
            Data.left.paintIcon(this,g,snakex[0],snakey[0]);
        }else if(fx.equals("U")){
            Data.up.paintIcon(this,g,snakex[0],snakey[0]);
        }else if(fx.equals("D")){
            Data.down.paintIcon(this,g,snakex[0],snakey[0]);
        }

        for(int i=1;i<length;i++){
            Data.body.paintIcon(this,g,snakex[i],snakey[i]);//蛇的身体长度
        }
        //画食物
        Data.food.paintIcon(this,g,foodx,foody);

        //画积分
        g.setColor(Color.white);
        g.setFont(new Font("微软雅黑",Font.BOLD,18));
        g.drawString("长度"+length,750,35);
        g.drawString("分数"+score,750,50);

        //游戏提示，是否开始
        if(isStart==false){
            g.setColor(Color.WHITE);//设置笔的颜色
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("按下空格开始游戏",300,300);
        }

        //失败提醒
        if(isFail){
            g.setColor(Color.RED);//设置笔的颜色
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("你已失败，按下空格重新开始游戏",200,300);
        }

    }


    //接受键盘的输入、监听
    @Override
    public void keyPressed(KeyEvent e) {
        //键盘按下，未弹起,接受键盘的输入
        int keyCode = e.getKeyCode();
        if(keyCode==KeyEvent.VK_SPACE){
            if(isFail){
                isFail=false;
                init();//如果失败，重新初始化游戏
            }else{
                isStart=!isStart;
            }

            repaint();//刷新界面
        }
        if(keyCode==KeyEvent.VK_LEFT){
            fx="L";
        }
        else if(keyCode==KeyEvent.VK_RIGHT){
            fx="R";
        }else if(keyCode==KeyEvent.VK_UP){
            fx="U";
        }else if(keyCode==KeyEvent.VK_DOWN){
            fx="D";
        }
    }

    //定时器、监听时间
    @Override
    public void actionPerformed(ActionEvent e) {
        //如果游戏处于开始状态，并且游戏没有结束
        if(isStart&&isFail==false){
            for(int i = length-1;i>0;i--){
                snakey[i]=snakey[i-1];
                snakex[i]=snakex[i-1];
            }
            if(fx.equals("R")){
                snakex[0]=snakex[0]+25;
                if(snakex[0]>850){snakex[0]=25;}
            }else if(fx.equals("L")){
                snakex[0]=snakex[0]-25;
                if(snakex[0]<25){snakex[0]=850;}
            }else if(fx.equals("U")){
                snakey[0]=snakey[0]-25;
                if(snakey[0]<75){snakex[0]=650;}
            }else if(fx.equals("D")){
                snakey[0]=snakey[0]+25;
                if(snakey[0]>650){snakey[0]=75;}
            }

            //如果蛇头和食物重合
            if(snakex[0]==foodx&&snakey[0]==foody){
                length++;
                score+=10;
                //重新生成食物
                foodx=25+25*r.nextInt(34);
                foody=75+25*r.nextInt(24);
            }

            //结束判断
            for(int i =1;i<length;i++){
                if(snakey[0]==snakey[i]&&snakex[0]==snakex[i]){
                    isFail=true;
                }
            }
            repaint();
        }
        timer.start();//让时间动起来

    }





    @Override
    public void keyTyped(KeyEvent e) {
        //键盘按下，弹起
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //释放

    }


}
