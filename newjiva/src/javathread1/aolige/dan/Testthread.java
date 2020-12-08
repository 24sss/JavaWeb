package javathread1.aolige.dan;

public class Testthread {
    public static void main(String[] args) {
       /* Hero green =new Hero();
        green.name="概论";
        green.hp=616;
        green.damage=50;

        Hero teemo =new Hero();
        green.name="提莫";
        green.hp=300;
        green.damage=30;

        Hero lesin=new Hero();
        green.name="盲僧";
        green.hp=455;
        green.damage=80;

        Hero bh =new Hero();
        green.name="赏金猎人";
        green.hp=455;
        green.damage=80;

        while(!teemo.isDead()){
            green.attack(teemo);
        }

        while (!lesin.isDead()){
            bh.attack(lesin);
        }


    }*/
        Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 616;
        gareen.damage = 50;

        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;

        Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;

        Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 455;
        leesin.damage = 80;

        KillTread trd1 = new KillTread(gareen,teemo);
        trd1.start();
        KillTread trd2 = new KillTread(bh,leesin);
        trd2.start();

    }

}


