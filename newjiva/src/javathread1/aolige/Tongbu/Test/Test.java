package javathread1.aolige.Tongbu.Test;

public class Test {
    public static void main(String[] args) {
        HHH gareen = new HHH();
        gareen.name="盖伦";
        gareen.hp=10000;

        System.out.printf("盖伦的初始血量为 %.0f%n",gareen.hp);

        int n=1000;
        Thread[] add = new Thread[n];
        Thread[] red = new Thread[n];
        //n个  线程   增加hp
        for(int i=0;i<n;i++){
            Thread t = new Thread(){
                public void run(){
                    gareen.upd();
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

        //n个线程减血
        for(int i=0;i<n;i++){
            Thread t = new Thread(){
                public void run(){
                    gareen.dow();
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            red[i]=t;
        }
         for(Thread t : add){
             try{
                 t.join();
             }catch (InterruptedException  e){
                 e.printStackTrace();
             }
         }

        for(Thread t : red){
            try{
                t.join();
            }catch (InterruptedException  e){
                e.printStackTrace();
            }
        }
////代码执行到这里，所有增加和减少线程都结束了
//
//        //增加和减少线程的数量是一样的，每次都增加，减少1.
//        //那么所有线程都结束后，盖伦的hp应该还是初始值
//
//        //但是事实上观察到的是：

        System.out.printf("%d个增加线程和%d个减少线程结束后%n盖伦的血量变成了 %.0f%n", n,n,gareen.hp);

    }
}
