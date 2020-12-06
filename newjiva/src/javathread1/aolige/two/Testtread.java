package javathread1.aolige.two;

import javathread1.aolige.two.Hero;

public class Testtread {
    public static void main(String[] args) {
        javathread1.aolige.two.Hero gareen = new javathread1.aolige.two.Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 50;

        javathread1.aolige.two.Hero teemo = new javathread1.aolige.two.Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;

        javathread1.aolige.two.Hero bh = new javathread1.aolige.two.Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;

        javathread1.aolige.two.Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 455;
        leesin.damage = 80;

        Battle battle1=new Battle(gareen,teemo);
        new Thread(battle1).start();

        Battle battle2=new Battle(bh,leesin);
        new Thread(battle2).start();

    }
}
