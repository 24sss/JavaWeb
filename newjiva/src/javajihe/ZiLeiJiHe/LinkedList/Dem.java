package javajihe.ZiLeiJiHe.LinkedList;

import java.util.LinkedList;

public class Dem {
    public static void main(String[] args) {
        meth1();// 增加元素
        meth2();//获取元素
        meth3();
    }
    public static void meth3(){
        LinkedList<String> lin1 = new LinkedList<>();
        lin1.add("a");
        lin1.add("b");
        lin1.add("c");

        String f = lin1.removeFirst();//等价 lin1.pop();
        System.out.println(f);//a
        System.out.println(lin1);//[b, c]

        String e = lin1.removeLast();
        System.out.println(e);//c
        System.out.println(lin1);//[b]
    }
    public static void meth2(){
        LinkedList<String> lin = new LinkedList<>();
        lin.add("a");
        lin.add("b");
        lin.add("c");
        if(!lin.isEmpty()){
            System.out.println(lin.getFirst());//返回列表的第一个元素 a
            System.out.println(lin.getLast());//返回列表的最后一个元素 c
        }

        System.out.println("===============================");
    }
    public static void meth1(){
        //不能使用多态
        LinkedList <String> link = new LinkedList<>();
        link.add("a");
        link.add("b");
        link.add("c");
        System.out.println(link);//[a, b, c]

        link.addFirst("fff");//等效于link.push("fff")
        System.out.println(link);//[fff, a, b, c]

        link.addLast(("EEE"));//等效于link.add("EEE")
        System.out.println(link);//[fff, a, b, c, EEE]

        System.out.println("================================");


    }

}
