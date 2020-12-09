package javathread1.aolige.Lock.trylocksisuo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class sisuo {
    public static void main(String[] args) throws InterruptedException {
        Lock ah = new ReentrantLock();
        Lock an = new ReentrantLock();

        Thread t1 = new Thread(){
            public void run(){
                Boolean ah1 = false;
                Boolean an1 = false;

                try{
                    ah1 = ah.tryLock(10, TimeUnit.SECONDS);
                    if(ah1) {
                        System.out.println("t1已经占有九尾狐妖");
                        //停顿1秒，让另一个足够占有安妮
                        sleep(1000);
                        System.out.println("t1试图10秒内占有安妮");

                        try{
                            an1 = an.tryLock(10,TimeUnit.SECONDS);
                            if(an1){
                                System.out.println("t1成功占有安妮");
                            }else {
                                System.out.println("t1一直占有不了安妮");
                            }
                        }finally {
                            if(an1){
                                System.out.println("t1释放安妮");
                                an.unlock();
                            }
                        }
                    }

                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    if(ah1){
                        System.out.println("t1释放九尾狐");
                        ah.unlock();
                    }
                }
            }
        };
        t1.start();
        Thread.sleep(100);

        Thread t2 = new Thread(){
            public void run(){
                Boolean an1 = false;
                Boolean ah1 = false;
                try{
                    an1 = an.tryLock(10,TimeUnit.SECONDS);
                    if(an1){
                        System.out.println("t2已占有安妮");
                        //停顿1秒 另一个线程有足够时间占有九尾狐
                        Thread.sleep(1000);
                        System.out.println("t2试图在十秒之内占有九尾狐妖");
                        try{
                            ah1 = ah.tryLock(10,TimeUnit.SECONDS);
                            if(ah1){
                                System.out.println("t2已占有九尾狐妖");
                            }else {
                                System.out.println("t2占有不了九尾狐妖");

                            }
                        }finally {
                            if(ah1){
                                System.out.println("t2释放九尾狐妖");
                                ah.unlock();
                            }
                        }
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    if(an1){
                        System.out.println("t2释放安妮");
                        an.unlock();
                    }
                }
            }
        };
        t2.start();
    }
}
