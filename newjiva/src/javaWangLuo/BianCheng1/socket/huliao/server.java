package javaWangLuo.BianCheng1.socket.huliao;

import javalei.System.Sys;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
    public static void main(String[] args) {


        try{
            ServerSocket ss = new ServerSocket(8888);
            Socket s = ss.accept();

            OutputStream dis = s.getOutputStream();
            DataOutputStream data = new DataOutputStream(dis);
            InputStream dis1 = s.getInputStream();
            DataInputStream data1 = new DataInputStream(dis1);

            while(true){
                String msg = data1.readUTF();
                System.out.println("接收到的数据是"+msg);

                System.out.println("请输入数据");
                Scanner sc = new Scanner(System.in);
                String str = sc.next();
                data.writeUTF(str);
            }


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
