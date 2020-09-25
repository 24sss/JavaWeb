package javajihe.Collection;


import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {
    public static void main(String[] args) {
        Collection<String> arr = new ArrayList<>();
        System.out.println(arr);//[]

        //add方法
        arr.add("张三");
        arr.add("李四");
        arr.add("王五");
        System.out.println(arr);//[张三, 李四, 王五]

        //remove方法
        arr.remove("李四");
        System.out.println(arr);//[张三, 王五]

        //contations方法
        boolean b1 = arr.contains("王五");
        System.out.println(b1);//true

        //判断是否为空
        System.out.println(arr.isEmpty());//false

        //打印集合对象个数
        System.out.println(arr.size());//2

        //集合转化为数组
        Object[] all = arr.toArray();
        for(int i=0 ; i<all.length;i++){
            System.out.println(all[i]);//张三 李四 王五
        }

        //清空集合中元素，但是集合依然存在
        arr.clear();
        System.out.println(arr);//[]
    }
}

