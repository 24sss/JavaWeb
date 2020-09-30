package javayichang.Bianyi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bianyi1 {

    public static void main(String[] args) throws ParseException {//把异常跑出去，交给虚拟机来处理
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//格式化日期
        Date date = sdf.parse("1999-02-09");//如果格式不对，jvm会中断运行，把异常打印
        System.out.println(date);
    }
}

