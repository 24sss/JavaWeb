package javathread1.aolige.Tongbu.Test;
//所有需要修改hp的地方，有要建立在占有someObject的基础上。
//而对象 someObject在同一时间，只能被一个线程占有。 间接地，导致同一时间，hp只能被一个线程修改。

public class Jiejue {
    public static void main(String[] args) {
        final Object someObject = new Object();

        final HHH garren = new HHH();
        garren.name="艾伦";
        garren.hp=10000;

        int n = 10000;
        Thread[] add = new Thread[n];
        Thread[] red = new Thread[n];

        for (int i=0;i<n;i++){
            Thread t = new Thread(){
                public void run(){
                    //任何线程要修改hp的值，必须先占用someObject
                    synchronized (someObject){
                        garren.upd();
                    }
                    try{
                        Thread.sleep(1000);

                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                }
            };
            t.start();
            add[i]=t;
        }

        for (int i=0;i<n;i++){
            Thread t2 = new Thread(){
                public void run(){
                    synchronized (someObject){
                        garren.dow();
                    }
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

            };
            t2.start();
            red[i]=t2;
        }

        for (Thread t:add){
            try{
                t.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        for(Thread t :red){
            try{
                t.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.printf("%d个增加线程和%d个减少线程结束后%n盖伦的血量是 %.0f%n", n,n,garren.hp);

    }


}
