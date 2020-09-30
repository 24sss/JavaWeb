package javajihe.Map.Ofen;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Link {
    public static void main(String[] args) {
        LinkedHashMap <String,String> link = new LinkedHashMap<String, String>();
        link.put("a","b");
        link.put("a","c");
        link.put("c","m");
        System.out.println(link);//{a=c, c=m}
    }
}
