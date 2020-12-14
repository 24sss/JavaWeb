package javaWangLuo.BianCheng1.socket.shuzi;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("127.0.0.1",8888);

            //打开输出流
            OutputStream os = s.getOutputStream();

            //发送110到服务端
            os.write(110);
            os.close();
            s.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
