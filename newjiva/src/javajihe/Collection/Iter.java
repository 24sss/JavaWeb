package javajihe.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iter {
    public static void main(String[] args) {
        Collection<String> str = new ArrayList<>();
        str.add("孙胜顺");
        str.add("何淳登");
        str.add("白旭博");
        //Iterator接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型
        Iterator<String> it = str.iterator();//左边接口，右边实现类对象，多态

        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(Iterator<String> it2= str.iterator();it2.hasNext();){
            System.out.println(it.next());
        }
    }
}
