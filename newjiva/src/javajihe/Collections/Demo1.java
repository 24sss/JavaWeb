package javajihe.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d");
        System.out.println(list);//[a, b, c, d]

        Collections.shuffle(list);
        System.out.println(list);//[d, b, c, a]
    }
}
