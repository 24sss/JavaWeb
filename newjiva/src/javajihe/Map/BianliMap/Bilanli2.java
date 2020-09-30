package javajihe.Map.BianliMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Bilanli2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",19);
        map.put("黄家驹",29);
        //使用map集合中的entyrSet()方法，把Entry对象取出来,放入Set集合
        Set<Map.Entry<String, Integer>> Entry = map.entrySet();

        //迭代，获取每个Entry值
        Iterator<Map.Entry<String, Integer>> f = Entry.iterator();

        while(f.hasNext()){

            Map.Entry<String, Integer> entry = f.next();

            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key："+key+",value"+value);
            //key：赵丽颖,value19
            //key：黄家驹,value29


        }


    }
}
