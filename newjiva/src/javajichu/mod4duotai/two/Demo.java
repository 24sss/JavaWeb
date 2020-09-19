package javajichu.mod4duotai.two;

public class Demo {
    public static void main(String[] args) {
        Fu obj = new Zi();
        System.out.println(obj.num);

        //System.out.println(obj.ages);    错误，先到Fu类去找，没有则想上找，不会向下（Zi）找

        obj.NUM();
    }
}
