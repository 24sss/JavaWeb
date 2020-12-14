package javaWangLuo.BianCheng1.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ping1 {
    public static void main(String[] args) throws IOException {
        Process  p = Runtime.getRuntime().exec("ping "+"qq.com");
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = null;
        StringBuilder sb = new StringBuilder();

        while(true){
            if((line = br.readLine())!=null){
                if(line.length()!=0)
                    sb.append(line+"\r\n");
            }
        }


    }
}
