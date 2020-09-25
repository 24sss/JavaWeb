package javajihe.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Fanxing {
    public static void main(String[] args) {
        demo1();//不使用泛型
        demo2();//使用泛型
    }
    public static void demo2(){
        ArrayList<String> list = new ArrayList<>();
        list.add("王老五");
        //list.add(1);
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s.length());

        }
    }

    //创建集合对象，不使用泛型，
    //好处：集合不适用泛型，默认类型就是Object类型，可以存储任意类型数据
    //弊端：不安全，会引发异常
    public static void demo1(){
        ArrayList In = new ArrayList();
        In.add("张三");
        In.add(3);

        Iterator It = In.iterator();
        while(It.hasNext()){
            Object obj = It.next();
            System.out.println(obj);//张三  3

            //查看字符串长度，向下转型，转成字符串类型，但是Integer类型转换为String类型
            //抛出异常
            String s = (String)obj;
            System.out.println(s.length());

        }
    }

}
