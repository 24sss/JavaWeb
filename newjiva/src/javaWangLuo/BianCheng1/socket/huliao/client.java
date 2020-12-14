package javaWangLuo.BianCheng1.socket.huliao;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("127.0.0.1",8888);

            OutputStream dis = s.getOutputStream();
            DataOutputStream data = new DataOutputStream(dis);
            InputStream dis1 = s.getInputStream();
            DataInputStream data1 = new DataInputStream(dis1);

            while(true){

                System.out.println("输入数据：");
                Scanner sc = new Scanner(System.in);
                String str = sc.next();
                data.writeUTF(str);

                String msg = data1.readUTF();
                System.out.println("接收数据为："+msg);

            }



        }catch (UnknownHostException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
