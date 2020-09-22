package javalei.Object.equals;

import java.util.ArrayList;

public class Equ {
    public static void main(String[] args) {
        Person p1 = new Person("张三",30);
        Person p2 = new Person("李四",28);

        System.out.println(p1);//javalei.Object.equals.Person@b4c966a
        System.out.println(p2);//javalei.Object.equals.Person@2f4d3709

        boolean b=p1.equals(p2);
        System.out.println(b);//false

        ArrayList<String> list = new ArrayList<>();
        boolean c = p1.equals(list);//不同类型比较，属性必然不同
        System.out.println(c);


    }
}
