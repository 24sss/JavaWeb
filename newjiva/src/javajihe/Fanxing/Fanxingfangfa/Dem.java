package javajihe.Fanxing.Fanxingfangfa;

public class Dem {
    public static void main(String[] args) {
        Cals ca = new Cals();
        //调用含有泛型的方法
        ca.meth(1);
        ca.meth("燕双鹰");
        ca.meth(true);

        ca.meth1("静态方法，不建议这种使用");
        Cals.meth1("静态方法，建议直接使用");
    }
}
