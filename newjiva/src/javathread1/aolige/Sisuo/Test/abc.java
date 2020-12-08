package javathread1.aolige.Sisuo.Test;
//3个同步对象a, b, c
//3个线程 t1,t2,t3
//
//故意设计场景，使这3个线程彼此死锁
public class abc {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();

        Thread t1 =new Thread(){
            public void run(){
                synchronized (a){
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized (b) {
                        synchronized (c) {
                        }
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                synchronized (c){
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized (a){
                        synchronized (b){

                        }
                    }
                }
            }
        };
            Thread t3 =new Thread(){
                public void run(){
                    synchronized (b) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        synchronized (c) {
                            synchronized (a) {

                            }
                        }
                    }
                }
            };
           t1.start();
           t2.start();
           t3.start();
    }
}
