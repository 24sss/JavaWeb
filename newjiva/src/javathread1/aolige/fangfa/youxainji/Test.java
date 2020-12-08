package javathread1.aolige.fangfa.youxainji;

public class Test {
    public static void main(String[] args) {
       Hero gareen = new Hero();
        gareen.name="概论";
        gareen.hp=6666;
        gareen.damage=1;

       Hero teemo = new Hero();
        teemo.name="提莫";
        teemo.hp=6666;
        teemo.damage=1;

         Hero bh = new Hero();
        bh.name="王八";
        bh.hp=6666;
        bh.damage=1;

         Hero lession = new Hero();
        lession.name="盲僧";
        lession.hp=6666;
        lession.damage=1;

        Thread t1 = new Thread() {
            public void run() {
                while (!lession.isDead()){
                    gareen.attack(lession);
                }

            }
        };

        Thread t2=new Thread(){
            public void run(){
                while(!lession.isDead()){
                    bh.attack(lession);
                }
            }
        };

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }

}
