package javalei.Object.String;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        Person per = new Person("张三", 30);
        //Person类继承Object类，其可以使用Object类中的所有方法
        String s = per.toString();//调用toString方法，返回地址值

        System.out.println(s);//javalei.Object.String.Person@b4c966a//aaa//Person{name='张三', ages=30}

        //直接打印对象名，就是调用对象的toString方法，返回地址值//aaa//Person{name='张三', ages=30}
        System.out.println(per);

        //看一个类是否重写toString方法，直接打印对象名，重写：不是地址值。没重写：打印地址值
        Random r = new Random();
        System.out.println(r);//java.util.Random@4e50df2e  //没有重写toString方法

        Scanner sc = new Scanner(System.in); //重写
        System.out.println(sc);  //java.util.Scanner[delimiters=\p{javaWhitespace}+][position=0][match valid=false]
        // [need input=false][source closed=false][skipped=false][group separator=\x{2c}][decimal separator=\x{2e}]
        // [positive prefix=][negative prefix=\Q-\E][positive suffix=][negative suffix=][NaN string=\QNaN\E][infinity string=\Q∞\E]

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);  //[1, 2] //重写了toString方法。


    }
}
