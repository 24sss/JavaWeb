package javalei.Date.HowDay;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HowDay {
    public static void main(String[] args) throws ParseException {
        //用Scanner类中的next方法，写入出生日期
        Scanner scanner = new Scanner(System.in);
        System.out.println(("请输入出生日期:yyyy-MM-dd"));
        String s = scanner.next();
        //把字符串的出生日期转化为date类型的出生日期
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sim.parse(s);
        //把date格式的出生日期转化为毫秒值
        long ss = date.getTime();
        //获取当前日期并且转化为毫秒
        long sss = new Date().getTime();
        //打印天数
        System.out.println("天数为："+(sss-ss)/1000/60/60/24);

    }
}
