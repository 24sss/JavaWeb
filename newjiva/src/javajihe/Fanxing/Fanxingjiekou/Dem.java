package javajihe.Fanxing.Fanxingjiekou;

public class Dem {
    public static void main(String[] args) {
        CalImpl cal = new CalImpl();
        cal.meth("字符串");

        CalImpl1<String> c = new CalImpl1<>();
        c.meth("第二种");

        CalImpl1<Integer> c1 = new CalImpl1<>();
        c1.meth(2);
    }
}
