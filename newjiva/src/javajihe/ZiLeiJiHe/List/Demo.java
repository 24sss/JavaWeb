package javajihe.ZiLeiJiHe.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("a");
        str.add("b");
        str.add("c");
        System.out.println(str);//[a, b, c]

        str.add(2,"IT");
        System.out.println(str);//[a, b, IT, c]

        String s1 = str.remove(2);//s1==IT
        System.out.println("被移除的元素是:"+s1);//被移除的元素是:IT
        System.out.println(str);//[a, b, c]

        String s2 = str.set(0,"A");
        System.out.println("被替换的元素"+s2);//被替换的元素a
        System.out.println(str);//[A, b, c]

        for(int i=0;i<str.size();i++){
            System.out.println(str.get(i));//A b c
        }

        Iterator<String> st = str.iterator();
        while(st.hasNext()){
            System.out.println(st.next());
        }

        for(String st2 :str){
            System.out.println(st2);
        }


    }
}
