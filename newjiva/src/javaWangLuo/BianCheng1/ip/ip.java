package javaWangLuo.BianCheng1.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ip {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress host = InetAddress.getLocalHost();
        String ip = host.getHostAddress();
        System.out.println("本机地址:"+ip);
    }
}
