package javalei.StringBuilder;

public class Oppend {
    public static void main(String[] args) {
        //创建对象
        StringBuilder bui = new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        //append方法返回的是this，调用方法的对象bui，this==bui；
        StringBuilder bui1=bui.append("abc");//把bui的地址赋值给了bui1
        System.out.println(bui);//"abc"
        System.out.println(bui1);//"abc"
        System.out.println(bui==bui1);//比较的是地址ture

        //使用append方法无需接受返回值
    }
}
