package javathread1.aolige.dan;

public class KillTread extends Thread{
    public Hero h1;
    public Hero h2;

    public KillTread(Hero h1,Hero h2){
        this.h1=h1;
        this.h2=h2;
    }

    public void run(){
        while (!h2.isDead()){
            h1.attackHero(h2);
        }
    }


}
