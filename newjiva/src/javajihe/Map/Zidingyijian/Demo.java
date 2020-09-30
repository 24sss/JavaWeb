package javajihe.Map.Zidingyijian;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Map<Person,String> map = new HashMap<>();
        map.put(new Person("赵丽颖",19),"北京");
        map.put(new Person("黄家驹",29),"上海");
        map.put(new Person("黄家驹",28),"上海");

        Set<Map.Entry<Person, String>> entry = map.entrySet();

        Iterator<Map.Entry<Person, String>> en = entry.iterator();
        while(en.hasNext()){
            Map.Entry<Person, String> Entry = en.next();
            Person key = Entry.getKey();
            String value = Entry.getValue();

            System.out.println("key:"+key+"value:"+value);

        }

    }
}
