package javajihe.Fanxing.Fanxinglei;

public class Demo {
    public static void main(String[] args) {
        Gener<Integer> gen = new Gener<Integer>();
        gen.setName(1);
        Integer obj = gen.getName();
        System.out.println(obj);

        Gener<String> gen1 = new Gener<>();
        gen1.setName("刘邦");
        String s = gen1.getName();
        System.out.println(s);
    }
}
