package javajihe.Map.BianliMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Bianli {
    public static void main(String[] args) {
                Map<String ,Integer> list = new HashMap<>();
                list.put("赵世珍",19);
                list.put("杨过",20);
                list.put("汪峰",30);

                //使用Map集合的方法，把Map集合所有的key取出来，存储到set集合中
                 Set<String> set = list.keySet();

                 //遍历Set集合，获取每一个key
                  Iterator<String> it = set.iterator();
                  while(it.hasNext()){
                      String key = it.next();
                      //找到对应的value
                      Integer value = list.get(key);
                      System.out.println(key+"="+value);
                      //赵世珍=19
                      //杨过=20
                      //汪峰=30
                  }

                  for(String i:set){
                      Integer value = list.get(i);
                      System.out.println(value);
                  }





    }

    }

