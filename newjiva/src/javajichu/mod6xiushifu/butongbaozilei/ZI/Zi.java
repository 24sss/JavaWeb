package javajichu.mod6xiushifu.butongbaozilei.ZI;


import javajichu.mod6xiushifu.butongbaozilei.FU.Fu;

public class Zi extends Fu {

    public  void method(){
       /* System.out.println(super.num1);   private修饰的，在不同包子类中不能被访问
        System.out.println(super.num2);*/   //（abstract)修饰的，在不同包子类中，不能被访问
        System.out.println(super.num3);
        System.out.println(super.num4);
    }
}
