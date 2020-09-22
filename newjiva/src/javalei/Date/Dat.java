package javalei.Date;

import java.util.Date;

public class Dat {
    public static void main(String[] args) {
        mod1();
        mod2();
        mod3();
    }

    //无参构造方法  Date（）：获取当前时间
    public static void mod1(){
        Date date = new Date();
        System.out.println(date);//Mon Sep 21 21:37:18 CST 2020
        //直接打印对象名，没有出来地址，说明重写了toString类
    }

    //有参构造方法   Date(long )：传递毫秒值，把毫秒值转化成日期
    public static void mod2(){
        Date date = new Date(0l);
        System.out.println(date);//Thu Jan 01 08:00:00 CST 1970
    }

    //成员方法 long getTime（） 把日期转换成毫秒值
    //从0毫秒开始，到现在
    public static void mod3(){
        Date date = new Date();
        long l = date.getTime();
        System.out.println(l);//1600696036510

    }

}
