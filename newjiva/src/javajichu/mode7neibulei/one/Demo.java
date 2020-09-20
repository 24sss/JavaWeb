package javajichu.mode7neibulei.one;

public class Demo {
    public static void main(String[] args) {
        Mybody body = new Mybody();            //间接使用内部类。先new一个外部类对象，在通过外部类方法使用内部类
                                               //外部类方法中已经 new了内部类对象，并通过内部类对象在外部类方法中使用内部类方法
        body.Body();        //直接外部类方法，在外部类方法中使用了内部类。从而间接使用内部类方法
        System.out.println("=============");


        Mybody.Myheart hert = new Mybody().new Myheart(); //直接new内部类对象
        hert.heart();        //直接使用内部类方法



    }
}
