package javaWangLuo.BianCheng1.socket.Duoxiancheng;

import java.io.IOException;
import java.net.Socket;

public class client {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("127.0.0.1",8888);

            //启动发送消息线程
            new Send(s).start();
            //启动接收消息线程
            new recieve(s).start();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
