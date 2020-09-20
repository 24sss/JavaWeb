package javajichu.mod6xiushifu.tongyibao;

public class Myanthor {
    public static void anthod(){
       /* System.out.println(new Myclass().num);*/ //private修饰的成员变量，同一个包不同的类，不能访问
        System.out.println(new Myclass().num1);
        System.out.println(new Myclass().num2);
        System.out.println(new Myclass().num3);
    }
}
