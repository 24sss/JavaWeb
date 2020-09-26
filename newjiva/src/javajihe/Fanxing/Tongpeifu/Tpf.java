package javajihe.Fanxing.Tongpeifu;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class Tpf {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

       // ArrayList<?> list03 = new ArrayList<?>();
        // 错误，不能创建对象时使用。只能作为方法的参数使用

        Printrray(list01);
        Printrray(list02);

    }

    public static void Printrray(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }


    }
}
