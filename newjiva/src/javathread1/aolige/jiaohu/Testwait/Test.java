package javathread1.aolige.jiaohu.Testwait;

import javathread1.aolige.three.Hero;

//在Hero类中：hurt()减血方法：当hp=1的时候，执行this.wait().
//this.wait()表示 让占有this的线程等待，并临时释放占有
//进入hurt方法的线程必然是减血线程，this.wait()会让减血线程临时释放对this的占有。 这样加血线程，就有机会进入recover()加血方法了。
//
//
//recover() 加血方法：增加了血量，执行this.notify();
//this.notify() 表示通知那些等待在this的线程，可以苏醒过来了。 等待在this的线程，恰恰就是减血线程。 一旦recover()结束， 加血线程释放了this，减血线程，就可以重新占有this，并执行后面的减血工作。
public class Test {
    public static void main(String[] args) {
        Hero4 garren = new Hero4();
        garren.name="爱丽丝";
        garren.hp=666;


        Thread t1 = new Thread(){
            public void run(){
                while(true){
                    garren.hurt();
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            public void run(){
                while(true){
                    garren.rec();
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };
        t2.start();

    }
}
