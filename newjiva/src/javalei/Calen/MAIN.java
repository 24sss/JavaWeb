package javalei.Calen;

import java.util.Calendar;
import java.util.Date;

public class MAIN {
    public static void main(String[] args) {
        mode1(); //public int get(int field):返回给定日历字段的值
        mode2(); //public void set (int field,int value):将给定的日历字段设置为给定值
        mode3(); //public obstract void add (int field,int omount):根据日历规则，为给定日历字段添加
        mode4(); //public Date getTime ():返回一个表示Calendar时间值的Date对象
    }

    private static void mode4() {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        System.out.println(date);//Tue Sep 22 20:21:36 CST 2020

    }

    private static void mode3() {
        Calendar cal = Calendar.getInstance();

        cal.add(Calendar.YEAR,4);
        cal.add(Calendar.MONDAY,-3);


        int y = cal.get(Calendar.YEAR);
        System.out.println(y);//2024
        int m = cal.get(Calendar.MONDAY);
        System.out.println(m);//5

    }

    private static void mode2() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,9999);
        cal.set(Calendar.MONDAY,9);
        cal.set(Calendar.DATE,8);

        int y = cal.get(Calendar.YEAR);
        System.out.println(y);//9999

        int m = cal.get(Calendar.MONDAY);
        System.out.println(m);//9

    }

    private static void mode1() {
        Calendar cal = Calendar.getInstance();
        int y = cal.get(Calendar.YEAR);
        System.out.println(y);//2020

        int m = cal.get(Calendar.MONDAY);
        System.out.println(m);//8
    }

}
