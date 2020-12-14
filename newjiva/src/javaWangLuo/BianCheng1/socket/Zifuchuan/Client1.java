package javaWangLuo.BianCheng1.socket.Zifuchuan;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("127.0.0.1",8888);
            OutputStream dis = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(dis);

            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            dos.writeUTF(str);


            sc.close();
            s.close();
            dos.close();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
