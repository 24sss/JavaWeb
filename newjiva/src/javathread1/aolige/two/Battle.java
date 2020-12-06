package javathread1.aolige.two;

public class Battle implements Runnable{
    public Hero h1;
    public Hero h2;

    public Battle(Hero h1,Hero h2){
        this.h1=h1;
        this.h2=h2;

    }

    public void run(){
        while(!h2.isDead()){
            h1.attack(h2);
        }
    }

}
