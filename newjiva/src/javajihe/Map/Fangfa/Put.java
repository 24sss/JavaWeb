package javajihe.Map.Fangfa;

import java.util.HashMap;
import java.util.Map;

public class Put {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        String v1 = map.put("李晨","范冰冰1");
        System.out.println("v1:"+v1);//v1:null
        String v2 = map.put("李晨","范冰冰2");
        System.out.println("v2:"+v2);//v2:范冰冰1

        map.put("冷风","龙啸云");
        map.put("杨过","小龙女");
        System.out.println(map);//{杨过=小龙女, 李晨=范冰冰2, 冷风=龙啸云}

    }
}
