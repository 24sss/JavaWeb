package JavaIO.JavaIO1.Lianxi;

import java.io.UnsupportedEncodingException;

public class zhong {
    public static void main(String[] args) {
        String srt ="丽";
        String[] encods = {"UTF-8","BIG5","GBK","GB2312"};
        for(String en :encods){
            showCod(srt,en);
        }

    }
    public static void showCod(String str,String en){
        try{
            byte[] all = str.getBytes(en);
            for(byte b :all){
                int i=b&0xff;
                System.out.printf(Integer.toHexString(i)+"\t");

            }
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }


    }

}
