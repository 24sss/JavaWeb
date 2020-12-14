package javaWangLuo.BianCheng1.socket.Duoxiancheng;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(8888);
            Socket s = ss.accept();

            //启动发送消息线程
            new Send(s).start();
            //启动接收消息线程
            new recieve(s).start();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
