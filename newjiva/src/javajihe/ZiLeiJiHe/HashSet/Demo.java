package javajihe.ZiLeiJiHe.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        Iterator<Integer> i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());//1 2 3
        }

        for(Integer i1:set){
            System.out.println(i1);//1 2 3
        }
    }
}
