package javaWangLuo.BianCheng1.socket.Zifuchuan;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servlet {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(8888);
            System.out.println("在8888端口监听");
            Socket s = ss.accept();

            InputStream os = s.getInputStream();
            DataInputStream data = new DataInputStream(os);

            String msg = data.readUTF();
            System.out.println(msg);
            ss.close();
            s.close();
            data.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
