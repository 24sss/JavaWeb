package javayichang.Bianyi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Bianyi {

        public static void main(String[] args) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//格式化日期
            Date date = null;
            try {//这种处理了异常之后，会继续执行代码
                date = sdf.parse("1999-0223");
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println(date);
            System.out.println("后续代码");//null
            //后续代码

        }
    }


