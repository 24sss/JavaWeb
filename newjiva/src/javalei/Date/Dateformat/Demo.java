package javalei.Date.Dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Demo {
    public static void main(String[] args) throws ParseException {
        demo1();
        demo2();

    }
    public static void demo1(){
        SimpleDateFormat sim = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = new Date();
        String s = sim.format(date);
        System.out.println(s);//2020年09月22日
    }

    public static void demo2() throws ParseException {
        SimpleDateFormat sim = new SimpleDateFormat("yyyy年MM月dd日");
         Date date= sim.parse("2020年9月21日");
         System.out.println(date);//Mon Sep 21 00:00:00 CST 2020
    }


}
