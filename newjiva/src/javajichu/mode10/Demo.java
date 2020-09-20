package javajichu.mode10;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> reult=addName(list);
        for(int i=0;i<reult.size();i++){
            System.out.println(reult.get(i));
        }

    }
    public static List<String> addName(List<String> list) {
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");
        return list;
    }

}
