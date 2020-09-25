package javajihe.Collection;


import java.util.ArrayList;

public class For {
    public static void main(String[] args) {
        demo1();
        demo2();
    }
    public static void demo1() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void demo2 () {
            ArrayList<String> str = new ArrayList<>();
            str.add("张三");
            str.add("李四");
            str.add("王五");

            for(String h : str){
                System.out.println(h);
             }
    }
}


