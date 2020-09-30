package javajihe.Map.Fangfa;

import java.util.HashMap;
import java.util.Map;

public class Contain {
    public static void main(String[] args) {
        Map<String ,Integer> list = new HashMap<>();
        list.put("赵世珍",19);
        list.put("杨过",20);
        list.put("汪峰",30);

        boolean a = list.containsKey("杨过");
        System.out.println(a);//true
        boolean b = list.containsKey("李四");
        System.out.println(b);//false


    }
}
