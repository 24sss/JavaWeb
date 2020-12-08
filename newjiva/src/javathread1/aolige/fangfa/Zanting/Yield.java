package javathread1.aolige.fangfa.Zanting;

public class Yield {
    public static void main(String[] args) {
        final Hero gareen = new Hero();
        gareen.name = "盖伦";
        gareen.hp = 61600;
        gareen.damage = 1;

        javathread1.aolige.fangfa.youxainji.Hero teemo = new javathread1.aolige.fangfa.youxainji.Hero();
        teemo.name = "提莫";
        teemo.hp = 30000;
        teemo.damage = 1;

        final Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 50000;
        bh.damage = 1;

        javathread1.aolige.fangfa.youxainji.Hero leesin = new javathread1.aolige.fangfa.youxainji.Hero();
        leesin.name = "盲僧";
        leesin.hp = 45050;
        leesin.damage = 1;

       Thread t1=new Thread(){
           public void run(){
               while(!teemo.isDead()){
                   gareen.attack(teemo);
               }
           }
       };

        Thread t2=new Thread(){
            public void run(){
                while(!leesin.isDead()){

                    Thread.yield();
                    bh.attack(leesin);

                }
            }
        };

        t1.setPriority(5);
        t2.setPriority(5);
        t1.start();
        t2.start();

    }

}
