package javajihe.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer>  list01 = new ArrayList<>();
        Collections.addAll(list01,1,4,2,6);
        Collections.sort(list01);
        System.out.println(list01);//[1, 2, 4, 6]

        ArrayList <String> list02 = new ArrayList<>();
        Collections.addAll(list02,"a","d","x","b");
        Collections.sort(list02);
        System.out.println(list02);//[a, b, d, x]

        ArrayList<Person> per = new ArrayList<>();
        per.add(new Person("张三",13));
        per.add (new Person("李四",14));
        per.add(new Person("王老",11));
        Collections.sort(per);
        System.out.println(per);//[Person{name='王老', ages=11}, Person{name='张三', ages=13}, Person{name='李四', ages=14}]
    }
}
