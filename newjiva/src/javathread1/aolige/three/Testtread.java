package javathread1.aolige.three;

public class Testtread {
    public static void main(String[] args) {
        Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 50;

        javathread1.aolige.three.Hero teemo = new javathread1.aolige.three.Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;

        javathread1.aolige.three.Hero bh = new javathread1.aolige.three.Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;

        Hero leesin = new Hero();
        leesin.name = "王八";
        leesin.hp = 450;
        leesin.damage = 55;



        //匿名类
        Thread t1= new Thread(){
            public void run(){
                //匿名类中用到外部的局部变量teemo，必须把teemo声明为final
                //但是在JDK7以后，就不是必须加final的了
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                }
            }
        };

        t1.start();

        Thread t2= new Thread(){
            public void run(){
                while(!leesin.isDead()){
                    bh.attackHero(leesin);
                }
            }
        };
        t2.start();
    }





    }

