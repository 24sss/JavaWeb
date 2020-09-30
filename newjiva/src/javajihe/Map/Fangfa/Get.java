package javajihe.Map.Fangfa;

import java.util.HashMap;
import java.util.Map;

public class Get {
    public static void main(String[] args) {
        Map<String ,Integer> list = new HashMap<>();
        list.put("赵世珍",19);
        list.put("杨过",20);
        list.put("汪峰",30);

        Integer a = list.get("杨过");
        System.out.println(a);//20
        Integer b = list.get("李四");
        System.out.println(b);//null

    }
}
