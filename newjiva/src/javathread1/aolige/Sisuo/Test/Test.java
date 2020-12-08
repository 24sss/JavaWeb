package javathread1.aolige.Sisuo.Test;

public class Test {
    public static void main(String[] args) {
        final Hero3 ahri= new Hero3();
        ahri.name = "九尾银狐";
        final Hero3 annie = new Hero3();
        ahri.name="安妮";

        Thread t1=new Thread(){
            public void run(){
                synchronized (ahri){
                    System.out.println("t1已经占有九尾银狐");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("t1试图等待安妮");
                    System.out.println("t1等待中...");
                    synchronized (annie){
                        System.out.println("do something");
                    }
                }
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            public void run(){
                synchronized (annie){
                    System.out.println("t2已经占有安妮");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("t2试图占有九尾银狐");
                    System.out.println("t2继续等待中...");
                    synchronized (ahri){
                        System.out.println("do something");

                    }
                }
            }
        };
        t2.start();

    }
}
