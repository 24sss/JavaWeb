package javajihe.ZiLeiJiHe.HashSet;

public class HashSetzhi {
    public  static void main(String[] args) {
        Person son1= new Person();
        int h1 = son1.hashCode();
        System.out.println(h1);//189568618

        Person son2 = new Person();
        int h2 = son2.hashCode();
        System.out.println(h2);//793589513

        System.out.println(son1);//javajihe.ZiLeiJiHe.HashSet.Person@b4c966a，化成十进制，就是哈希值
        System.out.println(son2);//javajihe.ZiLeiJiHe.HashSet.Person@2f4d3709


        //String 类重写hashCode()方法
        String s1 = new String();
        String s2 = new String();
        System.out.println(s1.hashCode());//0
        System.out.println(s2.hashCode());//0


    }
}
