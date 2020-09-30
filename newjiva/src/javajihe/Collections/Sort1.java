package javajihe.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort1 {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01,1,5,2,4,3);

        Collections.sort(list01, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;//升序
                //o2-o1 降序
            }
        });
        System.out.println(list01);//[1, 2, 3, 4, 5]
    }


}
