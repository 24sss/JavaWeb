package javaWangLuo.BianCheng1.socket.Zifuchuan;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("127.0.0.1",8888);

            OutputStream os = s.getOutputStream();
            DataOutputStream data = new DataOutputStream(os);

            data.writeUTF("I love liuqiuli");
            s.close();
            data.close();

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
