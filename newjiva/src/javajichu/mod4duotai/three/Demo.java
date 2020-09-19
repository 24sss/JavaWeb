package javajichu.mod4duotai.three;

public class Demo {
    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.methodFu();  //父类方法//先看左边是Fu，先到Fu类找，有这个方法，再到右边Zi类运行，发现没有，向上找到Fu类，运行此方法

        obj.method();//20// 先看到左边是Fu，先到Fu类去找，有这个方法，再到右边Zi类运行，发现有这个方法，直接运行

        //obj.methodZi(); //看到左边是Fu，先到左边Fu类去找，没有这个方法，就不到右边子类去找了
    }
}
